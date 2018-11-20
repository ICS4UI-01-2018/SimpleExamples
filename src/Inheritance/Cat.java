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
public class Cat extends Pet{
    private int lives;
    
    public Cat(String name, int age, String colour, int lives){
        super(name, age, colour);
        this.lives = lives;
    }
    
    public int getLives(){
        return this.lives;
    }
    
    @Override
    public void speak(){
        System.out.println("MEOW");
    }
    
    @Override
    public String toString(){
        String output = "CAT \n";
        output += super.toString();
        return output;
    }
}
