import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> zodiacSigns = new ArrayList<>();
        zodiacSigns.add("Capricorn");
        zodiacSigns.add("Aquarius");
        zodiacSigns.add("Pisces");
        zodiacSigns.add("Aries");
        zodiacSigns.add("Taurus");
        zodiacSigns.add("Gemini");
        zodiacSigns.add("Cancer");
        zodiacSigns.add("Leo");
        zodiacSigns.add("Virgo");
        zodiacSigns.add("Libra");
        zodiacSigns.add("Scorpio");
        zodiacSigns.add("Sagittarius");

        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter your birthday(MM,DD,YY OR DD,MM,YY): ");
            String birthday = scanner.nextLine();

            try {
                if (!birthday.matches("\\d{1,2}[-/]\\d{1,2}[-/]\\d{4}")) {
                    throw new IllegalArgumentException("Invalid format. Please use DD/MM/YYYY or MM-DD-YYYY.");
                }

                String[] parts = birthday.split("[-/]");
                int day = Integer.parseInt(parts[0]);
                int month = Integer.parseInt(parts[1]);
                int year = Integer.parseInt(parts[2]);

                if (!isValidDate(day, month, year)) {
                    throw new IllegalArgumentException("Invalid date. Please enter a valid day, month, and year.");
                }

                // Get zodiac sign
                String zodiacSign = getZodiacSign(month, day);
                System.out.println("Your zodiac sign is: " + zodiacSign);

                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
        scanner.close();
    }

    public static boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }


        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            return false;
        }

        if (month == 2) {
            if (isLeapYear(year)) {
                if (day > 29) {
                    return false;
                }
            } else {
                if (day > 28) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static String getZodiacSign(int month, int day) {
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Capricorn";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "Pisces";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagittarius";
        } else {
            return "Invalid date";
        }
    }
}