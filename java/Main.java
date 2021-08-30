package com.company;
import  java.lang.*;
import java.util.Scanner;

public class Main {

    static String validateInput() {
        Scanner input = new Scanner(System.in);
        String handSign = input.nextLine();
        while (
            !handSign.equalsIgnoreCase("R")
            && !handSign.equalsIgnoreCase("P")
            && !handSign.equalsIgnoreCase("S")
        )
        {
            System.out.println("Enter R for Rock");
            System.out.println("Enter P for Paper");
            System.out.println("Enter S for Scissors");
            handSign = input.nextLine();
        }
        return handSign;
    }

    public static void main(String[] args) {

        System.out.println("Enter R for Rock");
        System.out.println("Enter P for Paper");
        System.out.println("Enter S for Scissors");

        String handSign = validateInput();

        int player1 = (handSign.equalsIgnoreCase("R")?1:
                       (handSign.equalsIgnoreCase("P")?2:
                       (handSign.equalsIgnoreCase("S")?3:4)));

        int player2 = (int) (Math.random() * (3 + 1)) + 1  ;
        while(player1 == player2 || player2 > 3) {
            player2 = (int) (Math.random() * (3 + 1)) + 1  ;
        }

        String playerOneHand =  (handSign.equalsIgnoreCase("R")?"Rock":
                                (handSign.equalsIgnoreCase("P")?"Paper":
                                (handSign.equalsIgnoreCase("S")?"Scissors":"")));

        String playerTwoHand =  (player2 == 1?"Rock":
                                (player2 == 2 ?"Paper":
                                (player2 == 3?"Scissors":"")));

        String ans ;

        switch (player1){
            case 1 :
                ans = (2 <  player2 ? "You win" : "You Lose");
                break;
            case 2 :
                ans = (player1 > player2 ? "You win" : "You Lose");
                break;
            case 3 :
                ans = (1 <  player2 ? "You win" : "You Lose");
                break;
            default:
                ans = "You Lose";
        }
        System.out.println(ans);
        System.out.println("You : "+ playerOneHand+" and Computer : "+playerTwoHand);
    }
}
