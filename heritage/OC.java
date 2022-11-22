public class OC {

    public static void main(String[] args) {
        Voiture mercedes = new Voiture();
        mercedes.start();

        Bateau bateau = new Bateau();
        bateau.start();
    }
}

class Vehicule {
    void start(){
        System.out.println("VROOOOOOM");
    }
}

class Voiture extends Vehicule {

}

class Bateau extends Vehicule {

}