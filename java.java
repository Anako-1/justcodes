import java.util.Random;
import java.util.Scanner;

public class java{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        while (true){

            String[] rps = {"r", "p", "s"};
            String compMove = rps[new Random().nextInt(rps.length)];
            String player;

            while(true){
                System.out.println("Hey there! So you wanna play rock, paper, scissors!! Let the game begin...");
                System.out.println("Enter your move ( r, p, s): ");
                player =scan.nextLine();
                if(player.equals("r")|| player.equals("p")|| player.equals("s")){
                    break;
                }
                System.out.println(player + "invalid move,please try again.");

            }
            System.out.println("Computer played: " + compMove);

            if (player.equals(compMove )){
                System.out.println("You made the same move as the computer");

            }
            else if( player.equals("r")){
                if (compMove.equals("p")){
                    System.out.println("Paper wraps rock, Computer Wins!");
                }
                else if (compMove.equals("s")){
                    System.out.println("Rock beats scissors, You Win");
                }
            }
            else if( player.equals("p")){
                if (compMove.equals("r")){
                    System.out.println("Paper wraps rock, You Win!");
                }
                else if (compMove.equals("s")){
                    System.out.println("Scissors cut paper, Computer Wins!");
                }
            }
            else if( player.equals("s")){
                if (compMove.equals("p")){

                    System.out.println("Scissors cut paper, You Win!");
                }
                else if (compMove.equals("r")){

                    System.out.println("Rock beats scissors, Computer Wins!");
                }
            }
            System.out.println("Play again!(yes / nn)");
            
            String playAgain = scan.nextLine();

            if(!playAgain.equals("yes")){

                break;
            }
        }
        scan.close();
    }
}