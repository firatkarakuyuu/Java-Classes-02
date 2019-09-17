/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map103lab2;

import java.util.Scanner;

public class MAP103Lab2 {
    public static void main(String args[]) {
        
        
// Create a Scanner to obtain information from the user
        Scanner input = new Scanner(System.in);
// Pulls a random number between 0 and 4
        int questionNumber = (int) (Math.random() * 5);
        RandomQuizHelper helper = new RandomQuizHelper();
// Uses a method in class RandomQuizHelper that takes
// a question number and returns the question.
        String question = helper.getQuestion(questionNumber);
// A variable to store the users answer
        String answer = "";
        System.out.print(question);
        answer = input.nextLine();
        if (helper.getResult(questionNumber, answer) == true) {
            System.out.print("You are correct!");
        } else {
            System.out.print("You are not correct.");
        }
        input.close();
    }
}