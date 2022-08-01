package day2.second;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        int beginDay = 1;
        int beginMonth = 1;
        int beginYear = 1900;

        int endDay = 10;
        int endMonth = 8;
        int endYear = 1935;

        final boolean correctDates = checkIntDate(beginDay) && checkIntDate(beginMonth) && checkIntDate(beginYear)
                && checkIntDate(endDay) && checkIntDate(endMonth) && checkIntDate(endYear);

        final boolean correctMonths = checkMonth(beginMonth) && checkMonth(endMonth);

        final boolean correctDays = checkDaysAmount(beginDay, beginMonth, beginYear) && checkDaysAmount(endDay, endMonth, endYear);
        if (correctDates) {
            System.out.println("incorrect date, date < 0");
        } else if (correctMonths) {
            System.out.println("incorrect month, month > 12");
        } else if (!correctDays) {
            System.out.println("Incorrect days amount");
        } else {
            int daysAnswer = 0;
            while (beginYear < endYear) {
                daysAnswer = daysAnswer + (isLeapYear(beginYear) ? 366 : 365);
                beginYear++;
            }
            int differenceMonths = beginMonth - endMonth;
            for (int i = differenceMonths; i != 0;){
                if (differenceMonths < 0) {
                    daysAnswer = daysAnswer + getDaysAmountInMonth(Math.abs(i), beginYear);
                    i++;
                } else {
                    daysAnswer = daysAnswer - getDaysAmountInMonth(Math.abs(i), beginYear);
                    i--;
                }
            }
            if (differenceMonths > 0){
                daysAnswer = daysAnswer + beginDay - endDay;
            } else {
                daysAnswer = daysAnswer - beginDay + endDay;
            }
            System.out.println(daysAnswer);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate startDate = LocalDate.parse("01/01/1900", formatter);
            LocalDate endDate = LocalDate.parse("10/08/1935", formatter);
            System.out.println(ChronoUnit.DAYS.between(startDate,endDate));
        }




        System.out.println();
    }

    private static boolean checkIntDate(int date) {
        return date < 0;
    }

    private static boolean checkMonth(int date) {
        return date > 12;
    }

    private static boolean checkDaysAmount(int day, int month, int year) {
        boolean correctDayAmount = true;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (day > 31) correctDayAmount = false;
                break;
            case 2:
                int days = isLeapYear(year) ? 29 : 28;
                if (day > (days)) correctDayAmount = false;
                break;
            case 4, 6, 9, 11:
                if (day > 30) correctDayAmount = false;
                break;
            default:
                correctDayAmount = false;
                break;
        }
        return correctDayAmount;
    }

    private static int getDaysAmountInMonth(int month, int year) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11:
                return 30;
            default:
                return 0;
        }
    }
    private static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
}