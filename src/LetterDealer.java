import java.util.Arrays;
import java.util.Scanner;

public class LetterDealer{
    void guessLetter(String gameWord, int wordNumLetters, String hiddenWord){

        char[] ch = gameWord.toLowerCase().toCharArray();
        char[] chHidden = hiddenWord.toCharArray();

        int rightLetters=0;
        int numTrys=7;

        while (true){

            boolean letterWasRight = false;
            char letter;

            Scanner scan = new Scanner(System.in);

            System.out.println("\nChute uma letra: ");
            letter = scan.nextLine().toLowerCase().charAt(0);

            for (int i=0; i<ch.length; i++) {

                if (ch[i] == letter){
                    chHidden[i] = letter;
                    rightLetters++;
                    letterWasRight = true;
                }
                System.out.print(chHidden[i]);
            }

            if (!letterWasRight) numTrys--;

            System.out.println("\nVocê tem mais "+numTrys+" tentativas.");
            if (rightLetters == wordNumLetters){
                System.out.println("\nParabens, você acertou :)");
                break;
            } else if (numTrys<=0) {
                System.out.println("\nPoxa, suas chances acabaram :(");
                break;
            }
        }
    }

}
