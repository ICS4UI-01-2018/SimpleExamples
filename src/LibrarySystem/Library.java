/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lamon
 */
public class Library {
    private ArrayList<Book> books;
    private ArrayList<LibraryMember> members;
    
    public Library(){
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }
    
    public Library(String bookFile){
        this.members = new ArrayList<>();
        this.books = new ArrayList<>();
        try {
            Scanner input = new Scanner(new File("books.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Book findBook(int isbn){
        for(int i = 0; i < this.books.size(); i++){
            Book b = this.books.get(i);
            if(b.getISBN() == isbn){
                return b;
            }
        }
        return null;
    }
    
    public ArrayList<Book> findBooks(String author){
        ArrayList<Book> listOfBooks = new ArrayList<>();
        // for each book in the book list
        for(Book b: this.books){
            if(b.getAuthor().equals(author)){
                listOfBooks.add(b);
            }
        }
        return listOfBooks;
    }
    
    public void addBook(int isbn, String title, String author){
        Book b = new Book(isbn, title, author);
        this.books.add(b);
    }
}
