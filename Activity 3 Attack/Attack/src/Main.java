import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Base Attack Speed: ");
        double BAS = sc.nextDouble();

        System.out.println("Enter The Bonus Attack Speed %: ");
        double BoAS = sc.nextDouble();

        System.out.println("Enter The Level: ");
        int LVL = sc.nextInt();

        double current = BAS * (1 + ((BoAS/100) * (LVL - 1)));

        System.out.println("The Character's Current Attack Speed Is : " + current);
    }
}
