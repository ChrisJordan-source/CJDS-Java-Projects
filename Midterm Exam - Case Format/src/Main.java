import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String name = "Chris Jordan Dimalanta Salamante";

        System.out.println("Enter Name : " + name);
        System.out.println("Converted Result:");

        // Convert to lower case
        String lowerCase = name.toLowerCase();
        System.out.println("Lower Case  : " + lowerCase);

        // Convert to upper case
        String upperCase = name.toUpperCase();
        System.out.println("Upper Case  : " + upperCase);

        // Format case (original case)
        System.out.println("Format Case : " + name);
        }
    }