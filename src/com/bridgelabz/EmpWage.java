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
        int numWorkingHrs = 20;
        int EmpHrs;
        //int TotalSalary=0;
        double TotalSalary = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        for (int i = 0; i <= numWorkingHrs; i++) {

            switch (empCheck) {
                case isPartTime:
                    EmpHrs = 8;
                    break;
                case isFullTime:
                    EmpHrs = 12;
                    break;
                default:
                    EmpHrs = 0;
            }

            double sum = CalculateSalary(EmpRatePerHr, EmpHrs);
            TotalSalary = (TotalSalary + sum);
        }
    }

    /**
     * Salary is calculated
     */
    public static double CalculateSalary(double EmpRatePerHr, double EmpHrs) {

        double Salary = EmpRatePerHr * EmpHrs;
        System.out.println(Salary);
        return Salary;
    }
}