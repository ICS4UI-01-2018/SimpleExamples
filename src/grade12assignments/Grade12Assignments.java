/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade12assignments;

import java.util.Scanner;

/**
 *
 * @author lamon
 */
public class Grade12Assignments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // A scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Print instructions to user
        System.out.println("Please enter your name");
        
        // store the user's name
        String name = input.nextLine();
        // say hello
        System.out.println("Hello " + name);
        
        // get the users birth year
        System.out.println("What year you were born");
        int birthYear = input.nextInt();
        int age = 2018 - birthYear;
        
        System.out.println("You are (turning) " + age + " years old");
        
        // is this a valid age
        if(age <= 0){
            System.out.println("Did you invent a time machine?");
        }else if(age > 0 && age < 5){
            System.out.println("You are a baby...");
        }else{
            System.out.println("Yay..."); 
        }
        
        // count up to a number
        System.out.println("Please enter a number between 1 and 10");
        int num = input.nextInt();
        
        // create a variable to count with
        int count = 0;
        // count up to the entered number
        while(count < num){
            // add one to count
            count = count + 1;
            System.out.println(count);
        }
        
//        do{
//            // add one to count
//            count = count + 1;
//            System.out.println(count);
//        }while(count < num);
        
        // for loop to do the same counting
        for(int i = 1; i < num; i++){
            System.out.println(i);
        }
        
        // array of random integers
        int[] randomNums = new int[10];
        // generate random numbers
        for(int i = 0; i < randomNums.length; i++){
            randomNums[i] = (int)(Math.random()*100 + 1);
        }
        
        // calculate average number
        int sum = 0;
        for (int i = 0; i < randomNums.length; i++) {
            sum = sum + randomNums[i];
        }
        
        int average = sum / randomNums.length;
        
        

    }
    
}
