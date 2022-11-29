package org.example.util;
import org.apache.commons.lang3.StringUtils;
import org.example.entity.Account;
import org.example.entity.Department;
import org.example.entity.Potision;


public class Utils {
    public static boolean validateDepartment(String action, Department department) {
        if (action.equalsIgnoreCase("add")) {
            return !StringUtils.isBlank(department.getDepartmentName());
        } else if (action.equalsIgnoreCase("update")) {
            if (department.getDepartmentId() == null) {
                return false;
            } else {
                return !StringUtils.isBlank(department.getDepartmentName());
            }
        } else if (action.equalsIgnoreCase("delete")) {
            return department.getDepartmentName() != null;
        }
        return true;
    }

    public static boolean validatePosition(String action, Potision potision) {
        if (action.equalsIgnoreCase("add")) {
            return !StringUtils.isBlank(potision.getPotisionName());
        } else if (action.equalsIgnoreCase("update")) {
            if (potision.getPotisionId() == null) {
                return false;
            } else {
                return !StringUtils.isBlank(potision.getPotisionName());
            }
        } else if (action.equalsIgnoreCase("delete")) {
            return potision.getPotisionName() != null;
        }
        return true;
    }
    public static boolean validateAccount(String action, Account account) {
        if (action.equalsIgnoreCase("add")) {
            return !StringUtils.isBlank(account.getFullName());
        } else if (action.equalsIgnoreCase("update")) {
            if (account.getId() == null) {
                return false;
            } else {
                return !StringUtils.isBlank(account.getFullName());
            }
        } else if (action.equalsIgnoreCase("delete")) {
            return account.getFullName() != null;
        }
        return true;
    }
}