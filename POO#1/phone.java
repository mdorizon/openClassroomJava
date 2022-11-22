public class phone {
    public static void main(String[] args) {

        Marque apple = new Marque("apple");

        Telephone iphone = new Telephone(30000, "iphone", apple);
        

        System.out.println(iphone.nom);
    }
}

class Telephone {
    int pixels;
    String nom;
    Marque marque;

    Telephone(int pixels, String nom, Marque marque) {
        this.pixels = pixels;
        this.nom = nom;
        this.marque = marque;
    }
}

class Marque {
    String nom;

    Marque(String nom) {
        this.nom = nom;
    }
}