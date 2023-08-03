
// Creating a Zodiac Sign Program with Java
import java.util.Scanner;

public class zodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String month;
        String end;
        int day;
        // Creating a program using Java selection statements.
        do {
            System.out.println("What month where you born?");
            month = input.next();
            System.out.println("What day where you born?");
            day = input.nextInt();
            // Conditional statement will trigger if they are Met.

            if (month.equalsIgnoreCase("March") && day > 21 || month.equalsIgnoreCase("April") && day < 19) {
                System.out.println("Your a Aries");
            } else if (month.equalsIgnoreCase("April") && day > 20 || month.equalsIgnoreCase("May") && day < 20) {
                System.out.println("Your a Taurus");

            } else if (month.equalsIgnoreCase("May") && day > 21 || month.equalsIgnoreCase("June") && day < 21) {
                System.out.println("Your a Gemini");

            } else if (month.equalsIgnoreCase("June") && day > 22 || month.equalsIgnoreCase("July") && day < 22) {
                System.out.println("Your a Cancer");

            } else if (month.equalsIgnoreCase("July") && day > 23 || month.equalsIgnoreCase("August") && day < 22) {
                System.out.println("Your a Leo");

            } else if (month.equalsIgnoreCase("August") && day > 23
                    || month.equalsIgnoreCase("September") && day < 22) {
                System.out.println("Your a Virgo");

            } else if (month.equalsIgnoreCase("September") && day > 23
                    || month.equalsIgnoreCase("October") && day < 23) {
                System.out.println("Your a Libra");

            } else if (month.equalsIgnoreCase("October") && day > 24
                    || month.equalsIgnoreCase("November") && day < 21) {
                System.out.println("Your a Scorpius");

            } else if (month.equalsIgnoreCase("November") && day > 22
                    || month.equalsIgnoreCase("December") && day < 21) {
                System.out.println("Your a Sagittarius");

            } else if (month.equalsIgnoreCase("December") && day > 22
                    || month.equalsIgnoreCase("January") && day < 19) {
                System.out.println("Your a Capricorn");

            } else if (month.equalsIgnoreCase("January") && day > 20
                    || month.equalsIgnoreCase("February") && day < 18) {
                System.out.println("Your a Aquarius");

            }

            else if (month.equalsIgnoreCase("February") && day > 19 || month.equalsIgnoreCase("March") && day < 20) {
                System.out.println("Your a Pisces");

            }
            System.out.println("Check for family or friends");
            System.out.println("Y to check N to quit");
            end = input.next();
        } while (end.equalsIgnoreCase("Y"));

    }

}
