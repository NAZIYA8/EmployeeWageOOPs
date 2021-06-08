package com.bridgelabz;

public class EmpWage {

    public static void main(String[] args) {
        ispresent();
    }

    private static void ispresent() {
        double IS_PRESENT = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_PRESENT) {
            System.out.println("Employee is Present ");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
