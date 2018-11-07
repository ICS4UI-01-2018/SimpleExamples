/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDDExample;

/**
 *
 * @author lamon
 */
public class Student {
    
    private int id;
    private String name;
    private int grade;
    
    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }
}
