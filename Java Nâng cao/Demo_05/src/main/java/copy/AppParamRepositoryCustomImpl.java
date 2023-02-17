package copy;

import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigInteger;
import java.util.*;

@Repository
public class AppParamRepositoryCustomImpl implements AppParamRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Map<String, Object> search(AppParamDto obj) {
        Map<String, Object> resultData = new HashMap<>();
        List<AppParam> listResult = new ArrayList<>();
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT uap.id, uap.par_type, uap.par_code, uap.par_name, uap.par_value, " +
                " uap.created_date, uap.updated_date, uap.description, uap.status " +
                " FROM UHR_APP_PARAM uap " +
                " WHERE ");
        sql.append(" 1=1 ");
        sql.append(" AND STATUS = 1 ");

        if (!ObjectUtils.isEmpty(obj.getParType())) {
            sql.append(" AND UPPER(uap.PAR_TYPE) like UPPER(:parType) ");
        }
        if (!ObjectUtils.isEmpty(obj.getParCode())) {
            sql.append(" AND UPPER(uap.PAR_CODE) like UPPER(:parCode) ");
        }
        if (!ObjectUtils.isEmpty(obj.getParName())) {
            sql.append(" AND UPPER(uap.PAR_NAME) like UPPER(:parName) ");
        }
        if (!ObjectUtils.isEmpty(obj.getParValue())) {
            sql.append(" AND UPPER(uap.PAR_VALUE) like UPPER(:parValue) ");
        }

        StringBuilder sqlCount = new StringBuilder();
        sqlCount.append(" SELECT count(*) FROM ( ");
        sqlCount.append(sql);
        sqlCount.append(" ) result  ");

        // Get data
        if (obj.getPageIndex() != null && obj.getPageSize() != null) {
            int pageIndex = obj.getPageIndex().intValue();
            int pageSize = obj.getPageSize().intValue();
            sql.append(" ORDER BY updated_date DESC OFFSET " + ((pageIndex - 1) * pageSize) + " LIMIT " + pageSize);
        }

        Query query = em.createNativeQuery(sql.toString());
        Query queryCount = em.createNativeQuery(sqlCount.toString());

        if (!ObjectUtils.isEmpty(obj.getParType())) {
            query.setParameter("parType", "%" + obj.getParType() + "%");
            queryCount.setParameter("parType", "%" + obj.getParType() + "%");
        }
        if (!ObjectUtils.isEmpty(obj.getParCode())) {
            query.setParameter("parCode", "%" + obj.getParCode() + "%");
            queryCount.setParameter("parCode", "%" + obj.getParCode() + "%");
        }
        if (!ObjectUtils.isEmpty(obj.getParName())) {
            sql.append(" AND uap.PAR_TYPE = :parName ");
            query.setParameter("parName", "%" + obj.getParName() + "%");
            queryCount.setParameter("parName", "%" + obj.getParName() + "%");
        }
        if (!ObjectUtils.isEmpty(obj.getParValue())) {
            query.setParameter("parValue", "%" + obj.getParValue() + "%");
            queryCount.setParameter("parValue", "%" + obj.getParValue() + "%");
        }

        List<Object[]> result = query.getResultList();
        if (result != null) {
            for (Object[] item : result) {
                AppParam bo = new AppParam();
                BigInteger id = (BigInteger) item[0];
                bo.setId(id.longValue());
                bo.setParType(!ObjectUtils.isEmpty(item[1]) ? item[1].toString() : null);
                bo.setParCode(!ObjectUtils.isEmpty(item[2]) ? item[2].toString() : null);
                bo.setParName(!ObjectUtils.isEmpty(item[3]) ? item[3].toString() : null);
                bo.setParValue(!ObjectUtils.isEmpty(item[4]) ? item[4].toString() : null);
                bo.setCreatedDate(!ObjectUtils.isEmpty(item[5]) ? (Date) item[5] : null);
                bo.setUpdatedDate(!ObjectUtils.isEmpty(item[6]) ? (Date) item[6] : null);
                bo.setDescription(!ObjectUtils.isEmpty(item[7]) ? item[7].toString() : null);
                BigInteger status = !ObjectUtils.isEmpty(item[8]) ? (BigInteger) item[8] : null;
                bo.setStatus(!ObjectUtils.isEmpty(status) ? status.longValue() : null);
                listResult.add(bo);
            }
        }

        resultData.put("data", listResult);
        resultData.put("total", ((BigInteger) queryCount.getSingleResult()).intValue());

        return resultData;
    }
}
