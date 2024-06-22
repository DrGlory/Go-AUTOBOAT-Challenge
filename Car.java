package VEHICLE;

// Creation de la classe Car par extension de la class Vehicle
public class Car extends Vehicle {
    // Définition du constructeur par extension
    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    // 8 a - Implémentation de la méthode abstraite publicDoStuff() dans la class
    // Car
    @Override
    public String publicStringDoStuff() {
        return "Je suis" + getbrand() + "Et je fais vroom vroom";
    }
}
