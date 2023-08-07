import java.util.Random;

public class WordDealer {

    String typePicker(){

        String[] animals = {"abelha", "abutre", "aguia", "alpaca", "andorinha", "anta", "aranha", "arara",
                "avestruz","babuino", "bacalhau", "bagre", "baleia", "barata", "barracuda", "bezerro", "bode",
                "boi", "borboleta", "bufalo", "cabra", "cachorro", "camelo", "camundongo", "capivara", "cascavel",
                "castor", "cavalo", "chimpanze", "chinchila", "coala", "cobra", "coelho", "crocodilo",
                "dinossauro","doninha","elefante","ema","flamingo","foca","formiga",
                "gafanhoto","gaivota","galinha","galo","golfinho",
                "gorila","grilo","hamster","hiena","iguana","jabuti","jacu","jiboia","joaninha",
                "koala","lagartixa","lagosta","lebre","leopardo","lobo","lontra",
                "macaco","mariposa","minhoca","morcego",
                "orangotango","ovelha","panda","pantera","pato","pinguim","porco",
                "raposa","rinoceronte","sapo","tartaruga","touro","tucano","urso",
                "urubu","vaca","vespa","zebra"};

        String word = wordPicker(animals);

        return word;
    }

    String wordPicker(String[] words){

        Random ran = new Random();

        String word = words[ran.nextInt(words.length)];

        return word;
    }

    String buildHiddenWord(String word){

        String hiddenWord = "";
        for (int i=0; i<word.length(); i++){
            hiddenWord += "_";
        }
        System.out.println("Palavra: "+hiddenWord);
        return hiddenWord;
    }

}
