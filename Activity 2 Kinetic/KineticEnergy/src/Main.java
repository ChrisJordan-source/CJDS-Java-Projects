import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Mass In Kilograms: ");
        int m = sc.nextInt();

        System.out.println("Enter Velocity in MPS: ");
        double y = sc.nextDouble();

        double ke = calculated(m,y);

        System.out.println("The Object's Kinetic Energy Is : " + ke + " J");
        }
        public static double calculated(int m, double v){
        double ke = 0.5;
        double result = ke * m * v * v;
        return result;
        }
    }