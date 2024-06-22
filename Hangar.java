package VEHICLE;

// Création de Class Hangar qui possède une méthode main
public class Hangar {

    // Création de la méthode main
    public static void main(String[] args) {
        Car myNewCar = new Car("Jaguar", 0);
        System.out.println(myNewCar.publicStringDoStuff());

        Boat myNewBoat = new Boat("Azzam", 0);
        System.out.println(myNewBoat.publicStringDoStuff());
    }
}
