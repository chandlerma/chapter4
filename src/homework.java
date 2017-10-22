import java.util.Scanner;
public class homework {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year (2017): " );
        int year = scan.nextInt();
        System.out.print("Enter a month (Oct): " );
        String month = scan.next();
        scan.close();

        if (getMonthNumber(month) == 0) {
            System.out.println("Month name is case sensitive...");
            System.out.println("Invalid month input.");
            System.exit(0);
        }

        System.out.println(month + " " + year + " has " +
                getNumOfDaysInMonth(year, getMonthNumber(month)) + " days.");

    }


    static int getNumOfDaysInMonth(int year, int month) {

        switch (month) {
            case 1: return 31;
            case 2: return isLeapYear(year) ? 28 : 29;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
            default: return 0;
        }

    }

    public static int getMonthNumber(String month) {

        int monthNumber;

        switch (month) {
            case "Jan":
                monthNumber = 1;
                break;
            case "Feb":
                monthNumber = 2;
                break;
            case "Mar":
                monthNumber = 3;
                break;
            case "Apr":
                monthNumber = 4;
                break;
            case "May":
                monthNumber = 5;
                break;
            case "Jun":
                monthNumber = 6;
                break;
            case "Jul":
                monthNumber = 7;
                break;
            case "Aug":
                monthNumber = 8;
                break;
            case "Sep":
                monthNumber = 9;
                break;
            case "Oct":
                monthNumber = 10;
                break;
            case "Nov":
                monthNumber = 11;
                break;
            case "Dec":
                monthNumber = 12;
                break;
            default:
                monthNumber = 0;
                break;
        }

        return monthNumber;
    }


    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

}
