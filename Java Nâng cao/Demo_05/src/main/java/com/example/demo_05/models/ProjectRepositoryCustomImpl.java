package com.example.demo_05.models;

import org.springframework.util.ObjectUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigInteger;
import java.util.*;

public class ProjectRepositoryCustomImpl implements ProjectRepositoryCustom {
    @PersistenceContext
    private EntityManager em;
    @Override
    public Map<String, Object> search(ProjectDto obj) {
        Map<String, Object> resultData = new HashMap<>();
        List<Project> listResult = new ArrayList<>();
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT upr.id,upr.project_name,upr.custommer_name,upr.created_user,upr.updated_user,upr.create_date,upr.update_date,upr.leader_user,upr.status,upr.state " +
                " FROM uhr_project upr " +
                " WHERE ");
        sql.append(" 1=1 ");
        sql.append(" AND STATUS = 1 ");

        if (!ObjectUtils.isEmpty(obj.getProjectName())) {
            sql.append(" AND UPPER(upr.project_name) like UPPER(:projectName) ");
        }
        if (!ObjectUtils.isEmpty(obj.getCustommerName())) {
            sql.append(" AND UPPER(upr.custommer_name) like UPPER(:custommerName) ");
        }
        if (!ObjectUtils.isEmpty(obj.getLeaderUser())) {
            sql.append(" AND UPPER(upr.leader_user) like UPPER(:leaderUser) ");
        }
        if (!ObjectUtils.isEmpty(obj.getCreatedUser())) {
            sql.append(" AND UPPER(upr.created_user) like UPPER(:createdUser) ");
        }

        StringBuilder sqlCount = new StringBuilder();
        sqlCount.append(" SELECT count(*) FROM ( ");
        sqlCount.append(sql);
        sqlCount.append(" ) result  ");

        // Get data
        if (obj.getPageIndex() != null && obj.getPageSize() != null) {
            int pageIndex = obj.getPageIndex().intValue();
            int pageSize = obj.getPageSize().intValue();
            sql.append(" ORDER BY create_date DESC OFFSET " + ((pageIndex - 1) * pageSize) + " LIMIT " + pageSize);
        }

        Query query = em.createNativeQuery(sql.toString());
        Query queryCount = em.createNativeQuery(sqlCount.toString());

        if (!ObjectUtils.isEmpty(obj.getProjectName())) {
            query.setParameter("projectName", "%" + obj.getProjectName() + "%");
            queryCount.setParameter("projectName", "%" + obj.getProjectName() + "%");
        }
        if (!ObjectUtils.isEmpty(obj.getCustommerName())) {
            query.setParameter("custommerName", "%" + obj.getCustommerName() + "%");
            queryCount.setParameter("custommerName", "%" + obj.getCustommerName() + "%");
        }
        if (!ObjectUtils.isEmpty(obj.getLeaderUser())) {
            query.setParameter("leaderUser", "%" + obj.getLeaderUser() + "%");
            queryCount.setParameter("leaderUser", "%" + obj.getLeaderUser() + "%");
        }
        if (!ObjectUtils.isEmpty(obj.getCreatedUser())) {
            query.setParameter("createUser", obj.getCreatedUser() );
            queryCount.setParameter("createUser", obj.getCreatedUser());
        }

        List<Object[]> result = query.getResultList();
        if (result != null) {
            for (Object[] item : result) {
                Project bo = new Project();
                BigInteger id = (BigInteger) item[0];
                bo.setId(id.longValue());
                bo.setProjectName(!ObjectUtils.isEmpty(item[1]) ? item[1].toString() : null);

                bo.setCustommerName(!ObjectUtils.isEmpty(item[2]) ? item[2].toString() : null);

                bo.setLeaderUser(!ObjectUtils.isEmpty(item[7]) ? item[7].toString() : null);

                bo.setCreatedUser(!ObjectUtils.isEmpty(item[3]) ? item[3].toString() : null);

                bo.setCreateDate(!ObjectUtils.isEmpty(item[5]) ? (Date) item[5] : null);

                bo.setUpdateDate(!ObjectUtils.isEmpty(item[6]) ? (Date) item[6] : null);

                bo.setUpdatedUser(!ObjectUtils.isEmpty(item[4]) ? item[4].toString() : null);

                bo.setState(!ObjectUtils.isEmpty(item[9]) ? item[9].toString() : null);

                Integer status = !ObjectUtils.isEmpty(item[8]) ? (Integer) item[8] : null;
                bo.setStatus(!ObjectUtils.isEmpty(status) ? status.longValue() : null);

                listResult.add(bo);
            }
        }
        resultData.put("data", listResult);
        resultData.put("total", ((BigInteger) queryCount.getSingleResult()).intValue());

        return resultData;
    }
}
