package VEHICLE;

//Création d'une classe abstraite Vehicle
public abstract class Vehicle {
    // Ajout d'attributs à la classe abstraite
    private String brand;
    private int kilometers;

    // Création du constructeur permettant d'initialiser la classe Vehicle;
    public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    // Ajout de getters et setters pour tous les attributs
    // Ajout de getter pour l'attribut brand
    public String getbrand() {
        return this.brand;
    }

    // Ajout de setter pour l'attribut brand
    public String setbrand(String brand) {
        return this.brand;
    }

    // Ajout de getter pour l'attribut kilometers
    public int getkilometers() {
        return this.kilometers;
    }

    // Ajout de setter pour l'attribut kilometers
    public int setkilometers(int kilometers) {
        return this.kilometers;
    }

    // 7 - Ajout de la méthode abstraite publicStringDoStuff()
    public abstract String publicStringDoStuff();

}
