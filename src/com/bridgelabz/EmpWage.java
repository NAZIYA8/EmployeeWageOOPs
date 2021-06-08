package com.bridgelabz;

import java.util.prefs.PreferenceChangeListener;

public class EmpWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;

    public EmpWage() {
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
        numOfCompany++;
    }

    private void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    private int computeEmpWage(CompanyEmpWage companyEmpWage) {

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