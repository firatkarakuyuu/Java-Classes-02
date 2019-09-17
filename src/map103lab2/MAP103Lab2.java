/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map103lab2;

/**
 *
 * @author 19062772
 */
public class MAP103Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

import java.util.Scanner;
public class MAP103Lab2 {
public static void main( String args[] ) {
// Create a Scanner to obtain information from the user
Scanner input = new Scanner( System.in );
// Pulls a random number between 0 and 4
int questionNumber = (int)(Math.random() * 5);
RandomQuizHelper helper = new RandomQuizHelper();
// Uses a method in class RandomQuizHelper that takes
// a question number and returns the question.
String question = helper.getQuestion(questionNumber);
// A variable to store the users answer
String answer = "";
System.out.print( question );
answer = input.next();
if ( helper.getResult(questionNumber, answer) == true ) {
System.out.print( "You are correct!" );
} else {
System.out.print( "You are not correct." );
}
input.close();
}
}

class RandomQuizHelper {
private String questions;
private String answers;
        
String[] questions;
questions = new questions [5];
String[] questions = {"What is the biggest country in the world?", "What is the smallest country in the world?", "How much it cost to buy a new Ferrari ?", "What is the friendly country in the world?", "Which one is better to use for home users macOs or Windows ?"};

System.out.println(questions[0]);
System.out.println(questions[1]);
System.out.println(questions[2]);
System.out.println(questions[3]);
System.out.println(questions[4]);

String[] answers;
answers = new answers [5];
String[] answers = {"Russia","Vatican City","$252,800","Canada","Windows"};

System.out.println(answers[0]);
System.out.println(answers[1]);
System.out.println(answers[2]);
System.out.println(answers[3]);
System.out.println(answers[4]);

}