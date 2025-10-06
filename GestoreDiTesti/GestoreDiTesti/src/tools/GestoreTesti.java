package tools;

public class GestoreTesti {

    public static int calcolaLunghezza(String frase) {
        return frase.length();
    }

    public static boolean contieneParola(String frase, String parola) {
        return frase.contains(parola);
    }

    public static String sostituisciParola(String frase, String vecchia, String nuova) {
        return frase.replaceAll(vecchia, nuova);
    }

    public static void contaVocaliConsonanti(String frase) {
        int vocali = 0, consonanti = 0;
        frase = frase.toLowerCase();

        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vocali++;
                } else {
                    consonanti++;
                }
            }
        }

        System.out.println("Vocali: " + vocali);
        System.out.println("Consonanti: " + consonanti);
    }

    public static String invertiFrase(String frase) {
        return new StringBuilder(frase).reverse().toString();
    }

    public static String estraiPorzione(String frase, int inizio, int fine) {
        if (inizio < 0 || fine > frase.length() || inizio >= fine) {
            return "Indici non validi.";
        }
        return frase.substring(inizio, fine);
    }
}
