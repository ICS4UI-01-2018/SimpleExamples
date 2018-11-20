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
public abstract class Pet {
    private String name;
    private int age;
    private String colour;
    
    public Pet(String name, int age, String colour){
        this.name = name;
        this.age = age;
        this.colour = colour;
    }
    
    public abstract void speak();
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getColour(){
        return this.colour;
    }
    
    @Override
    public String toString(){
        String output = "";
        output += "Name: " + this.name + "\n";
        output += "Age: " + this.age + "\n";
        output += "Colour: " + this.colour + "\n";
        
        return output;
    }
    
}
