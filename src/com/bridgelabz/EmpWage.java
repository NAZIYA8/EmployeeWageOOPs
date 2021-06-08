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
        double isPartTime = 1;
        double isFullTime = 2;
        double EmpRatePerHr = 20;
        double EmpHrs;
        double empCheck = Math.floor(Math.random() * 10) % 3;

        if (empCheck == isFullTime) {
            EmpHrs = 12;
        } else if (empCheck == isPartTime) {
            EmpHrs = 8;
        } else {
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
