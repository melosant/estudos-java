package section8.Estudante.application;

import section8.Estudante.entitites.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] grades = new double[3];

        System.out.print("Nome: ");
        String name = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.print((i +1) + "° trimestre: ");
            grades[i] = sc.nextDouble();
        }

        Student student = new Student(name, grades);
        System.out.println(student);
    }
}
