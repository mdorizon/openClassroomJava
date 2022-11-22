public class bouquin {
    public static void main(String[] args) {

        Auteur robert = new Auteur("Robert Greene");

        Livre nature = new Livre(robert, "les lois de la nature humaine", 14);

        System.out.println(nature.nom);

    }
    
}

//auteur, nom, prix

class Livre {
    Auteur auteur;
    String nom;
    int prix;

    Livre(Auteur auteur, String nom, int prix){
        this.auteur = auteur;
        this.nom = nom;
        this.prix = prix;
    }
}

class Auteur {
    String nom;

    Auteur(String nom) {
        this.nom = nom;
    }
}