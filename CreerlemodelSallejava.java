public class Salle {
    private int id;
    private String nomSalle;

    public Salle(int id, String nomSalle) {
        this.id = id;
        this.nomSalle = nomSalle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomSalle() {
        return nomSalle;
    }

    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }
}