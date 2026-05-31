package section10.list.application;

import section10.list.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nEmployee #%d\n", i + 1);
            System.out.print("ID: ");
            Integer id = sc.nextInt();

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: $");
            Double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        System.out.print("\nEnter the id that will have salary increase: ");
        int idSelect = sc.nextInt();
        Employee employee = employees.stream().filter(x -> x.getId() == idSelect).findFirst().orElse(null);
        if (employee == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
        }

        System.out.println("\nList gf employees:");
        for (Employee emp : employees) {
            System.out.println(emp.getId() + ", " + emp.getName() + ", " + emp.getSalary());
        }
    }
}
