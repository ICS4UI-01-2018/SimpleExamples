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
public class PetTest {
    
    public static void main(String[] args) {
        Dog spike = new Dog("Spike", 4, "Brown");
        Dog max = new Dog("Max", 2, "Black");
        Cat fluffy = new Cat("Fluffy",6,"White",9);
        
        Pet[] pets = new Pet[3];
        pets[0] = spike;
        pets[1] = max;
        pets[2] = fluffy;
        
        for(int i = 0; i < 3; i++){
            pets[i].speak();
            // check if the pet is a cat
            if(pets[i] instanceof Cat){
                // convert to a cat (casting)
                Cat c = (Cat)pets[i];
                int lives = c.getLives();
            }
        }
    }
}
