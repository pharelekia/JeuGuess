import java.util.Random;
import java.util.Scanner;

public class Guess {

    public static void main(String[] args){

        System.out.println("Bienvenu dans le jeu Guess");
        System.out.println("Choisissez le niveau du jeu:");
        System.out.println("Tapez 1 pour deviner un nombre entre 1 et 10");
        System.out.println("Tapez 2 pour deviner un nombre entre 1 et 100");
        System.out.println("Tapez 3 pour deviner un nombre entre 1 et 1000");
        System.out.println("Vous avez 5 essaies pour deviner le nombre, bonne chance!");

        int min = 1;
        int max = 10;
        Random random = new Random();
        int randomNombre = random.nextInt((max - min) + 1) + min;

        Scanner scanner = new Scanner(System.in);
        int niveauDuJeu = scanner.nextInt();

        switch (niveauDuJeu){
            case 1:
                break;
            case 2:
                max = 100;
                break;
            case 3:
                max = 1000;
                break;
        }

        System.out.println("Vous avez choisie la plage de nombres a deviner entre" + " " + min + " " + "et" + " " + max);

        int guess;

        int nombreDeTentative = 0;

        do {
            if(niveauDuJeu == 1 || niveauDuJeu == 2 || niveauDuJeu == 3){
                System.out.println("C'est parti, devinez un nombre entre" +" " + min + " " + "et" +" " + max);
            }else {
                System.out.println("Ce niveau n'existe pas");
                break;
            }

            guess = scanner.nextInt();

            nombreDeTentative++;

            if (nombreDeTentative < 5){
                if(guess > randomNombre){
                    System.out.println("la devinette est trop haute");
                } else if (guess < randomNombre) {
                    System.out.println("la devinette est trop basse");
                }else {
                    System.out.println("Bravo!!! vous avez trouver la devinette apres" + " " + nombreDeTentative + " " + "essaies");
                }
            }else {
                System.out.println("Vous avez perdu!");
                break;
            }
        }while (guess != randomNombre);
    }
}
