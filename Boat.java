package VEHICLE;

// Creation de la classe Boat par extension de la class Vehicle
public class Boat extends Vehicle {
    // Définition du constructeur par extension de Vehicle
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    // 8 b - Implémentation de la méthode abstraite publicDoStuff() dans la class
    // Boat
    @Override
    public String publicStringDoStuff() {
        return " Je suis " + getbrand() + " et je fais Glou Glou";
    }
}
