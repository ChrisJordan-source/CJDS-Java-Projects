import java.util.Scanner;

public class Main {
    public static float calculateBmi(double height, double weight) {

        return 0;
    }

    public String getBmiCategory(double bmi) {

        //Severe Wasted    : < 10
        //Wasted           : 10 - 14
        //Underweight      : 14 - 18.5
        //Normal           : 18.5 - 24.999999999999999
        //Overweight       : 25 - 29.999999999999999
        //Obese (Stage 1)  : 30 - 33.999999999999999
        //Obese (Stage 2)  : 34 - 37.999999999999999
        //Obese (Stage 3)  : 38 - 41.999999999999999
        //Obese (Stage 4)  : 42 - 45.999999999999999
        //Obese (Stage 5)  : 46 - 49.999999999999999
        //Extreme Obesity  : >= 50

        return "";
    }

    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input Weight In Kilograms: ");
            double weight = sc.nextDouble();
            System.out.println("Input Height In meters: ");
            double height = sc.nextDouble();
            double BMI = weight / (height * height);
            System.out.println("Your Body Mass Index (BMI) is " + BMI + " kg/m2");
        }
    }
}