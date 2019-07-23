package game;

import java.util.Random;
import java.util.Scanner;

public class PlayGame {

    public static void main(String[] args) {
        int human = 0, pc = 0;
        Move humanChoice = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write: ROCK PAPER SCISSOR EXIT");
        do {
            System.out.printf("Human = %d - PC = %d", human, pc);
            try {
                String input = scanner.nextLine().toUpperCase();
                humanChoice = Move.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong Command!");
                continue;
            }
            Result decide = decider(humanChoice, pcChoice());

            switch (decide){
                case HUMAN: human++; break;
                case PC: pc++;
            }

        } while (humanChoice != Move.EXIT);
    }

    public static Move pcChoice() {
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;

        switch (n) {
            case 1: return Move.ROCK;
            case 2: return Move.PAPER;
            case 3: return Move.SCISSOR;
            default: return null;
        }
    }

    public static Result decider(Move humanChoice, Move pcChoice) {
        Result result = null;

        if (humanChoice == pcChoice) {
            result = Result.DRAW;
        } else if (humanChoice == Move.ROCK && pcChoice == Move.PAPER) {
            result = Result.PC;
        } else if (humanChoice == Move.ROCK && pcChoice == Move.SCISSOR) {
            result = Result.HUMAN;
        } else if (humanChoice == Move.PAPER && pcChoice == Move.ROCK) {
            result = Result.HUMAN;
        } else if (humanChoice == Move.PAPER && pcChoice == Move.SCISSOR) {
            result = Result.PC;
        } else if (humanChoice == Move.SCISSOR && pcChoice == Move.ROCK) {
            result = Result.PC;
        } else if (humanChoice == Move.SCISSOR && pcChoice == Move.PAPER) {
            result = Result.HUMAN;
        }

        return result;
    }

}
