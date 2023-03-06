/**
 * Classe con metodo main per la gerarchia Studente e Persona
 */
public class MainEsami {

    public static void main(String[] args) {
        Studente s = new Studente();
        s.setNome("Alan", "Rossi"); // metodo della superclasse di s
        s.setMatr("M12345");
        s.nuovoEsame("Italiano", 8); // metodo della classe di s
        s.nuovoEsame("Fisica", 7);
        s.printAll(); // metodo della classe di s
        testUno(s);
    }

    /** Mostra il controllo dei tipi quando si usa l'ereditarietà. */
    private static void testUno(Studente s) {
        System.out.println("Dopo l'assegnazione a p di tipo Persona");
        Persona p = s;
        // p.nuovoEsame("ita", 25);
        s.nuovoEsame("m", 29);
        // p e' dichiarato di tipo Persona
        // a runtime p punta all'istanza s
        p.printAll();
        // p.getMedia();
    }
}