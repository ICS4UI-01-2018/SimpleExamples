/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

import java.util.ArrayList;

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
