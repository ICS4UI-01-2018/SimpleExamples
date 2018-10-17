/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

import java.util.Date;

/**
 *
 * @author lamon
 */
public class Book {
    private int isbn;
    private String title;
    private String author;
    private boolean onLoan;
    private Date returnDate;
    private LibraryMember borrowing;
    
    public Book(int isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.onLoan = false;
        this.returnDate = null;
        this.borrowing = null;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public int getISBN(){
        return this.isbn;
    }
    
    public boolean isOnLoan(){
        return this.onLoan;
    }
    
    public LibraryMember whereIsIt(){
        return this.borrowing;
    }
    
    public Date getReturnDate(){
        return this.returnDate;
    }
    
    public void checkIn(){
        this.onLoan = false;
        this.borrowing = null;
        this.returnDate = null;
    }
}
