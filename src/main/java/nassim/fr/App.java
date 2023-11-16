package nassim.fr;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        int compteurLancers = 0;
        int caseCourante = 0;
        int caseObjectif = 20;
        Random generateur = new Random();
        boolean gagne = false;

        while (!gagne) {
            // Lancer le dé
            int lancer = generateur.nextInt(6) + 1;
            compteurLancers++;

            // Avancer le pion
            caseCourante = caseCourante + lancer;

            // Si je dépasse, je "rebondis"
            if (caseCourante > caseObjectif) {
                // int caseDepassement = caseCourante + lancer;
                int depassement = caseCourante - caseObjectif;
                caseCourante = caseObjectif - depassement;
            }

            System.out.println("Lancer " + compteurLancers + " : Vous avez fait " + lancer
                    + ". Vous êtes actuellement sur la case "
                    + caseCourante);

            if (caseCourante == caseObjectif) {
                System.out.println("Gagné !");
                System.out.println(
                        "Il aura fallu " + compteurLancers + " lancés pour arriver sur la case " + caseObjectif);
                gagne = true;

            }

        }

    }
}