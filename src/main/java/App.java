/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;
/*
Exercise 2 - Counting the Number of Characters

Create a program that prompts for an input string and displays output that shows the input string and the number of characters the string contains.

Example Output
What is the input string? Homer
Homer has 5 characters.

Constraints
Be sure the output contains the original string.
Use a single output statement to construct the output.
Use a built-in function of the programming language to determine the length of the string.

 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App myApp = new App();
        String input = myApp.readInput();
        String output = myApp.createOutput(input);
        myApp.printOutput(output);

    }

    private void printOutput(String output) {
        System.out.println(output);
    }

    private String createOutput(String input) {
       return input + " has " + input.length()+ " characters.";
    }

    private String readInput() {
        System.out.print("What is the input string? ");
        String input = in.nextLine();
        return input;
    }
}
