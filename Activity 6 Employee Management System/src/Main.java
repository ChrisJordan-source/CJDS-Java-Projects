import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    String position;
    double salary;

    public Employee(int id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }
}

public class Main {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int option = getValidIntInput("Choose an option: ");
            switch (option) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    updateSalary();
                    break;
                case 5:
                    deleteEmployee();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nEmployee Management System");
        System.out.println("[1] Add Employee");
        System.out.println("[2] View Employees");
        System.out.println("[3] Search Employee");
        System.out.println("[4] Update Salary");
        System.out.println("[5] Delete Employee");
        System.out.println("[6] Exit");
    }

    private static int getValidIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    private static double getValidDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    private static void addEmployee() {
        int id = getValidIntInput("Enter Employee ID: ");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Position: ");
        String position = scanner.nextLine();
        double salary = getValidDoubleInput("Enter Salary: ");
        employees.add(new Employee(id, name, position, salary));
        System.out.println("Employee added successfully!");
    }

    private static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
    }

    private static void searchEmployee() {
        int id = getValidIntInput("Enter Employee ID to search: ");
        Employee emp = findEmployeeById(id);
        if (emp != null) {
            System.out.println(emp);
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void updateSalary() {
        int id = getValidIntInput("Enter Employee ID to update salary: ");
        Employee emp = findEmployeeById(id);
        if (emp != null) {
            double newSalary = getValidDoubleInput("Enter new Salary: ");
            emp.salary = newSalary;
            System.out.println("Salary updated successfully!");
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void deleteEmployee() {
        int id = getValidIntInput("Enter Employee ID to delete: ");
        Employee emp = findEmployeeById(id);
        if (emp != null) {
            employees.remove(emp);
            System.out.println("Employee deleted successfully!");
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static Employee findEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp.id == id) {
                return emp;
            }
        }
        return null;
    }
}