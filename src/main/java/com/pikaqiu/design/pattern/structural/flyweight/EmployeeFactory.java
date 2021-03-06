package com.pikaqiu.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaoye
 */
public class EmployeeFactory {
    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<String,Employee>();

    public static Employee getManager(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        //管理者为空时创建
        if(manager == null){
            manager = new Manager(department);
            System.out.print("创建部门经理:"+department);
            String reportContent = department+"部门汇报:此次报告的主要内容是......";
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告:"+reportContent);
            //并放入享元容器  以便下次复用
            EMPLOYEE_MAP.put(department,manager);

        }
        return manager;
    }

}
