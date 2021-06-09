package com.bridgelabz;

public class CompanyEmpWage {
    public final String company;
    public final int maxHoursPerMonth;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public int totalEmpWage;

    public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        totalEmpWage = 0;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public String toString() {
        return "Total Employee wage for company : " + company + "is  " + totalEmpWage;
    }
}

