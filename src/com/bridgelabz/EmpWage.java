package com.bridgelabz;

import java.util.prefs.PreferenceChangeListener;

public class EmpWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int maxHoursPerMonth;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private int totalEmpWage;

    /**
     * Compute employee wage for company and save total wage
     *
     * @param company          name of the company
     * @param empRatePerHour   employee rate per hour
     * @param numOfWorkingDays number of working days
     * @param maxHoursPerMonth maximum hours in a month
     * @return Employee wage for the company
     */
    public EmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void computeEmpWage() {

        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        while (totalEmpHrs < maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
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
        totalEmpWage = totalEmpHrs * empRatePerHour;
    }

    public String toString() {
        return "Total Employee wage for company : " + company + "is  " + totalEmpWage;
    }


    public static void main(String[] args) {
        EmpWage dMart = new EmpWage("DMart", 20, 2, 10);
        EmpWage reliance = new EmpWage("Reliance", 10, 4, 20);
        dMart.computeEmpWage();
        System.out.println(dMart);
        reliance.computeEmpWage();
        System.out.println(reliance);
    }
}