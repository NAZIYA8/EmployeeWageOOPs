package com.bridgelabz;

public class EmpWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int MAX_HRS_IN_MONTH = 10;
    public static final int NUM_WORKING_DAYS = 20;
    public static final int EMP_RATE_PER_HR = 20;


    public static void main(String[] args) {
        computeEmpWage();
    }

    public static int computeEmpWage() {

        int TotalSalary = 0;
        int EmpHrs = 0;
        int TotalEmpHrs = 0;
        int TotalWorkingDays = 0;

        while (TotalEmpHrs < MAX_HRS_IN_MONTH && TotalWorkingDays < NUM_WORKING_DAYS) {
            TotalWorkingDays = TotalWorkingDays + 1;
            System.out.println("Day:" + TotalWorkingDays);

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    System.out.println("Empcheck is 1 (parttime)");
                    EmpHrs = 8;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Empcheck is 2 (fulltime)");
                    EmpHrs = 12;
                    break;
                default:
                    System.out.println("Empcheck is 0");
                    EmpHrs = 0;
            }
            TotalEmpHrs = (TotalEmpHrs + EmpHrs);
            System.out.println("Total employee hours:" + TotalEmpHrs);
        }
        TotalSalary = (TotalEmpHrs * EMP_RATE_PER_HR);
        System.out.println("Total Salary : " + TotalSalary);
        return TotalSalary;
    }
}