public class Ecole {
    private int id;
    private String nom;
    private int nbrclasse;

    public Ecole(int id, String nom, int nbrclasse) {
        this.id = id;
        this.nom = nom;
        this.nbrclasse = nbrclasse;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbrclasse() {
        return nbrclasse;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbrclasse(int nbrclasse) {
        this.nbrclasse = nbrclasse;
    }
}