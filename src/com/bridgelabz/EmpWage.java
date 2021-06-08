package com.bridgelabz;

public class EmpWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    /**
     * Compute employee wage for multiple companies
     *
     * @param company   name of the company
     * @param empRate   employee rate per hour
     * @param numOfDays number of working days
     * @param maxHrs    maximum hours in a month
     * @return Employee wage for the company
     */
    public static int computeEmpWageForCompany(String company, int empRate, int numOfDays, int maxHrs) {

        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs < maxHrs && totalWorkingDays < numOfDays) {
            totalWorkingDays++;
            System.out.println("Day:" + totalWorkingDays);

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    System.out.println("Empcheck is 1 (parttime)");
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Empcheck is 2 (fulltime)");
                    empHrs = 8;
                    break;
                default:
                    System.out.println("Empcheck is 0");
                    empHrs = 0;
            }
            totalEmpHrs = (totalEmpHrs + empHrs);
            System.out.println("Day : " + totalWorkingDays + "Employee hours:" + empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRate;
        System.out.println("Total Employee wage for company : " + company + "is  " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        computeEmpWageForCompany("DMart", 20, 2, 10);
        computeEmpWageForCompany("Reliance", 10, 4, 20);
        computeEmpWageForCompany("BigBazaar", 10, 5, 10);

    }

}