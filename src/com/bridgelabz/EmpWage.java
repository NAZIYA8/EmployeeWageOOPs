package com.bridgelabz;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.prefs.PreferenceChangeListener;

public class EmpWage implements IComputeEmpWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int numOfCompany = 0;
    private LinkedList<CompanyEmpWage> companyEmpWageList;
    private Map<String,CompanyEmpWage> companyToEmpWageMap;

    public EmpWage() {
        companyEmpWageList = new LinkedList<>();
        companyToEmpWageMap = new HashMap<>();
    }

    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
        companyEmpWageList.add(companyEmpWage);
        companyToEmpWageMap.put(company,companyEmpWage);

    }

    public void computeEmpWage() {
        for (int i = 0; i < companyEmpWageList.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }
    
    public int getTotalWage(String company){
        return companyToEmpWageMap.get(company).totalEmpWage;
    }

    public int computeEmpWage(CompanyEmpWage companyEmpWage) {

        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        while (totalEmpHrs < companyEmpWage.maxHoursPerMonth &&
                totalWorkingDays < companyEmpWage.numOfWorkingDays) {
            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    //System.out.println("Empcheck is 1 (parttime)");
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    //System.out.println("Empcheck is 2 (fulltime)");
                    empHrs = 8;
                    break;
                default:
                    //System.out.println("Empcheck is 0");
                    empHrs = 0;
            }
            totalEmpHrs = (totalEmpHrs + empHrs);
            System.out.println("Day : " + totalWorkingDays + "Employee hours:" + empHrs);
        }
        return totalEmpHrs * companyEmpWage.empRatePerHour;
    }


    public static void main(String[] args) {
        EmpWage empWage = new EmpWage();
        empWage.addCompanyEmpWage("Dmart", 20, 2, 10);
        empWage.addCompanyEmpWage("Reliance", 10, 4, 20);
        empWage.computeEmpWage();
    }
}