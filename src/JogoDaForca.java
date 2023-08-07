import java.util.Scanner;

public class JogoDaForca {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Player player = new Player();

        String playerName = player.setName();
        System.out.println("Ola, "+playerName+". Bem vindo(a) ao Jogo da Forca.");
        System.out.println("Acerte o animal com menos de 7 erros.");

        while (true){

            WordDealer dealWord = new WordDealer();

            String gameWord = dealWord.typePicker();
            int wordNumLetters = gameWord.length();

            String hiddenWord = dealWord.buildHiddenWord(gameWord);

            LetterDealer dealLetter = new LetterDealer();
            dealLetter.guessLetter(gameWord,wordNumLetters,hiddenWord);

            System.out.println("O animal era: "+ gameWord);
            System.out.println("Deseja jogar novamente? s/n");
            String reapet = scan.next();

            if (reapet.charAt(0) == 'n'){
                break;
            }
        }

        System.out.println("Obrigado por jogar!");
    }
}
