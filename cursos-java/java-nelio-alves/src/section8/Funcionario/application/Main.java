package section8.Funcionario.application;

import section8.Funcionario.entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Gross Salary: $");
        double grossSalary = sc.nextDouble();
        System.out.print("Tax: $");
        double tax = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);
        System.out.println(employee);

        System.out.print("\nWhich percentage to increase salary: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println(employee);
    }
}
