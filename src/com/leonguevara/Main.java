/*
 *  Main.java
 *  DaysInAMonth_Java
 *
 *  This program will give you the number of days of any given month of any given year
 *
 *  Java:   SDK 1.8 - Language level 8
 *
 *  Author: León Felipe Guevara Chávez
 *  email:  leon.guevara@itesm.mx
 *  date:   May 31st, 2017
 */
package com.leonguevara;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //  Opening the scanner for the standard input
        short daysOfMonth;

        //  We ask for and read the month's number
        System.out.print("Give me the number of the month (1 - 12): ");
        short month = scanner.nextShort();

        //  We ask for and read the year's number
        System.out.print("Give me the number of the year (XXXX): ");
        int year = scanner.nextInt();

        //  We find out the number of days that last this particular month
        switch(month) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                daysOfMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysOfMonth = 30;
                break;
            default:
                if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
                    daysOfMonth = 29;
                } else {
                    daysOfMonth = 28;
                }
        }

        //  We display our findings
        System.out.println("The numbers of days in this month is " + daysOfMonth);
    }
}
