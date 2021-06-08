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
        double IS_PRESENT = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_PRESENT) {
            double EmpRatePerHr = 20;
            double EmpHrs = 8;
            CalculateSalary(EmpRatePerHr, EmpHrs);
        } else {
            System.out.println("salary is 0");
        }
    }

    /**
     * Salary is calculated
     */
    private static void CalculateSalary(double EmpRatePerHr, double EmpHrs) {
        double Salary = EmpRatePerHr * EmpHrs;
        System.out.println(Salary);

    }
}