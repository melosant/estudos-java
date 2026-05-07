package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Car;

public class CarExercicio {
    public static void main(String[] args) {
        Car carToyota = new Car();
        Car carPorsche = new Car();

        carToyota.name = "Toyota Corolla";
        carToyota.model = "GLi";
        carToyota.year = 2026;

        carPorsche.name = "Porsche 911";
        carPorsche.model = "GT3/RlS";
        carPorsche.year = 2013;

        System.out.println("NOME DO CARRO: " + carToyota.name + "\nMODELO DO CARRO: " + carToyota.model + "\nANO DO CARRO: " + carToyota.year);
        System.out.println("---");
        System.out.println("NOME DO CARRO: " + carPorsche.name + "\nMODELO DO CARRO: " + carPorsche.model + "\nANO DO CARRO: " + carPorsche.year);
    }
}