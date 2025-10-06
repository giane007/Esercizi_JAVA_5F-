import java.util.Scanner;
import tools.GestoreTesti;
import tools.Utility;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "";

        boolean exit = false;

        do {
            Utility.mostraMenu();
            int scelta = Utility.leggiIntero(scanner, "Scegli un'opzione: ");

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci la frase: ");
                    frase = scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Lunghezza della frase: " + GestoreTesti.calcolaLunghezza(frase));
                    break;
                case 3:
                    System.out.print("Inserisci la parola da cercare: ");
                    String parola = scanner.nextLine();
                    System.out.println("Parola presente? " + GestoreTesti.contieneParola(frase, parola));
                    break;
                case 4:
                    System.out.print("Parola da sostituire: ");
                    String vecchia = scanner.nextLine();
                    System.out.print("Nuova parola: ");
                    String nuova = scanner.nextLine();
                    frase = GestoreTesti.sostituisciParola(frase, vecchia, nuova);
                    System.out.println("Frase aggiornata: " + frase);
                    break;
                case 5:
                    GestoreTesti.contaVocaliConsonanti(frase);
                    break;
                case 6:
                    System.out.println("Frase invertita: " + GestoreTesti.invertiFrase(frase));
                    break;
                case 7:
                    System.out.print("Indice iniziale: ");
                    int inizio = Utility.leggiIntero(scanner, "");
                    System.out.print("Indice finale: ");
                    int fine = Utility.leggiIntero(scanner, "");
                    System.out.println("Substring: " + GestoreTesti.estraiPorzione(frase, inizio, fine));
                    break;
                case 8:
                    continue; // torna al menu
                case 9:
                    System.out.println("Uscita dal programma.");
                    exit = true;
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }

            if (!exit) {
                System.out.println("\nPremi INVIO per continuare...");
                scanner.nextLine();
                Utility.pulisciSchermo();
            }
        } while (!exit);

        scanner.close();
    }
}
