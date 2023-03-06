/** Tiene il nome della materia e il voto riportato all'esame. */
public class Esame {
    private String materia;
    private int voto;

    /** Prende il nome della materia e il voto riportato. */
    public Esame(String n, int v) {
        materia = n;
        voto = v;
    }

    /** Restituisce il nome della materia. */
    public String getMateria() {
        return materia;
    }

    /** Restituisce il voto dell'esame. */
    public int getVoto() {
        return voto;
    }
}