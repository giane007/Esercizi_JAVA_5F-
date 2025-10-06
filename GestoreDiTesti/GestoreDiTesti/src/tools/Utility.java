package tools;

import java.util.Scanner;

public class Utility {

    public static void mostraMenu() {
        System.out.println("==== MENU GESTORE DI TESTI ====");
        System.out.println("1. Inserisci una frase");
        System.out.println("2. Verifica lunghezza della frase");
        System.out.println("3. Cerca parola nella frase");
        System.out.println("4. Sostituisci una parola");
        System.out.println("5. Conta vocali e consonanti");
        System.out.println("6. Inverti la frase");
        System.out.println("7. Estrai una porzione della frase");
        System.out.println("8. Torna al menu principale");
        System.out.println("9. Esci dal programma");
        System.out.println("================================");
    }

    public static void pulisciSchermo() {
        // Simulazione di "pulizia" dello schermo (non effettiva)
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }

    public static int leggiIntero(Scanner scanner, String messaggio) {
        int valore = -1;
        boolean valido = false;
        do {
            System.out.print(messaggio);
            if (scanner.hasNextInt()) {
                valore = scanner.nextInt();
                scanner.nextLine(); // consuma newline
                valido = true;
            } else {
                System.out.println("Inserisci un numero valido.");
                scanner.nextLine(); // scarta input non valido
            }
        } while (!valido);

        return valore;
    }
}
