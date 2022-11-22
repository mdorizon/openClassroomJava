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

    @Override
    void start(){
        super.start();

        allumerFeux();
    }

    void allumerFeux(){
        System.out.println("Allumage feux");
    }
}

class Bateau extends Vehicule {

}