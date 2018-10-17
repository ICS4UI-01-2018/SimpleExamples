/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

/**
 *
 * @author lamon
 */
public class LibraryMember {
    private static int numMembers = 0;
    
    private int id;
    private String name;
    private String address;
    private int phoneNumber;
    
    
    public LibraryMember(String name, String address, int phoneNumber){
        LibraryMember.numMembers++;
        this.id = LibraryMember.numMembers;
        
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getID(){
        return this.id;
    }
}
