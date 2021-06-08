package com.bridgelabz;

public class EmpWage {

    public static void main(String[] args) {
        calculateWage();
    }

    /**
     * Check if the employee is Present
     * If Present Salary is returned
     * If Absent Salary is returned 0
     */
    private static void calculateWage() {

        final int isPartTime = 1;
        final int isFullTime = 2;
        int EmpRatePerHr = 20;
        int EmpHrs;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

        switch ((int) empCheck) {
            case isPartTime:
                EmpHrs = 8;
                break;
            case isFullTime:
                EmpHrs = 12;
                break;
            default:
                EmpHrs = 0;
        }

        CalculateSalary(EmpRatePerHr, EmpHrs);
    }

    /**
     * Salary is calculated
     */
    private static void CalculateSalary(double EmpRatePerHr, double EmpHrs) {
        double Salary = EmpRatePerHr * EmpHrs;
        System.out.println(Salary);
    }
}