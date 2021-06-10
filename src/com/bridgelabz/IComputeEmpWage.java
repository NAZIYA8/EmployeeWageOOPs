package com.bridgelabz;

public interface IComputeEmpWage
{
    public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkDays,int maxHoursMonth);
    public void computeEmpWage();
    public int getTotalWage(String company);
}