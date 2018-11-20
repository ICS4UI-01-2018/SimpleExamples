/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author lamon
 */
public class Dog extends Pet{
    
    public Dog(String name, int age, String colour){
        // sending the variables over to the Pet Constructor
        super(name, age, colour);
    }
    
    @Override
    public void speak(){
        System.out.println("WOOF WOOF");
    }
    
    @Override
    public String toString(){
        String output = "DOG \n";
        output += super.toString();
        
        return output;
    }
    
}
