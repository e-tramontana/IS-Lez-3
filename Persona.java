/** Tiene il nome e cognome della persona. */
public class Persona {
    private String nome;
    private String cognome;

    /**
     * Imposta nome e cognome.
     * 
     * @param n nome
     * @param c cognome
     */
    public void setNome(String n, String c) {
        nome = n;
        cognome = c;
    }

    /** Stampa nome e cognome. */
    public void printAll() {
        System.out.println("Nome: " + nome + " " + cognome);
    }
}