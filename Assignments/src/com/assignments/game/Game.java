package com.assignments.game;


import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Game {

    //computer input
    public static String getComputerMove() {
        //method return random char given string
        String letter = "PRS";
        Random random = new Random();//get random number
        return String.valueOf(letter.charAt(random.nextInt(3))); //get char which present on index of string by random number
    }

    //input validation
    public static String getUserValid(String userInput) {
        if (userInput.equals("P") || userInput.equals("R") || userInput.equals("S")) {
            return userInput;
        } else {
            return "INVALID";
        }
    }

    //for get word Ex: p= paper;
    public static String getElement(String element) {
        switch (element) {
            case "P":
                return "Paper";
            case "R":
                return "Rock";
            case "S":
                return "Scissors ";
            default:
                return "INVALID";
        }
    }

    //compare computer and player moves
    public static String getWinner(String computerInput, String userInput) {
        if (userInput.equals(computerInput)) {
            return "**ITS DRAW**";
        } else if (userInput.equals("S") && computerInput.equals("P") ||
                userInput.equals("P") && computerInput.equals("R") ||
                userInput.equals("R") && computerInput.equals("S")) {
            return "**USER WINS**";
        } else if (userInput.equals("INVALID")) {
            return "**INVALID USER INPUT**";
        } else {
            return "**COMPUTER WINS**";
        }
    }

    //get score
    public static void getScore(int player, int computer) {
        if (player > computer) {
            System.out.format("User wins with %d points", player);
        } else if (computer > player) {
            System.out.format("Computer wins with %d point", computer);
        } else {
            System.out.println("Its Draw");
        }
    }

    public static void main(String[] args) {
        //get user input
        Scanner sc = new Scanner(System.in);

        int round = 3;
        int player = 0;
        int computer = 0;
        while (round-- > 0) {

            System.out.println("Rock = R | Paper = P | Scissors = S ");
            System.out.println("Make you choice:");
            String userInput = sc.nextLine().toUpperCase(Locale.ROOT);//input from user
            String computerInput = getComputerMove();//input from computer

            String winner = getWinner(computerInput, getUserValid(userInput));//get winner

            //print computer and user moves
            System.out.println("user's move : " + getElement(userInput));
            System.out.println("Computer's move : " + getElement(computerInput));

            //print winner
            System.out.println(winner);

            //score counting
            if (winner.equals("**USER WINS**")) {
                player++;
                System.out.println("USER VS COMPUTER : " + player + "-" + computer);
            } else if (winner.equals("**COMPUTER WINS**")) {
                computer++;
                System.out.println("USER VS COMPUTER : " + player + "-" + computer);
            } else {
                System.out.println("USER VS COMPUTER : " + player + "-" + computer);
            }
            System.out.println("-----------------------------------------------");
            System.out.println();

        }
        //print final score
        System.out.println("FINAL SCORE");
        getScore(player, computer);

    }
}
