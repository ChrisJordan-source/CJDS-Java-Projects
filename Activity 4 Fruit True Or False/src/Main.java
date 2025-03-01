import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> fruitList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Coconut", "Dewberry", "Elderberry", "Fig", "Grape", "Hazelnut", "Icaco", "Jackfruit", "Kiwi", "Lemon", "Mango", "Nuts", "Orange", "Pineapple", "Quince", "Rambutan", "Strawberry", "Thimbleberry", "Urava", "Voavanga", "Watermelon", "Xerophyte", "Yuzu", "Zucchini"));
        String fruit = "";

        while (true) {
            System.out.println("Enter Fruit Name: ");
            fruit = scanner.nextLine().trim();

            if (fruitList.contains(fruit)) {
                if (fruit.equalsIgnoreCase("Apple") || fruit.equalsIgnoreCase("Orange")) {
                    System.out.println("Is Fruit Circle: YES");
                } else {
                    System.out.println("Is Fruit Circle: NO");
                }
                break;
            } else {
                System.out.println("-Invalid Fruit Input");
            }
        }

        while (true) {
            System.out.println("Enter Amount In Numbers: ");
            String countInput = scanner.nextLine().trim();

            try {
                int count = Integer.parseInt(countInput);
                System.out.println("Fruit Name: " + fruit);
                System.out.println("Count: " + count);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Amount");
            }
        }
    }
}