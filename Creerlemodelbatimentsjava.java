public class Batiment {
    private int id;
    private String nomBat;

    public Batiment(int id, String nomBat) {
        this.id = id;
        this.nomBat = nomBat;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomBat() {
        return nomBat;
    }

    public void setNomBat(String nomBat) {
        this.nomBat = nomBat;
    }
}