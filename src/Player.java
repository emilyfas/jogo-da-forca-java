import java.util.Scanner;

public class Player {

    String name = "";


    Scanner scan = new Scanner(System.in);
    String setName(){
        System.out.println("Qual o seu nome?");
        name = scan.nextLine();

        return name;
    }



}
