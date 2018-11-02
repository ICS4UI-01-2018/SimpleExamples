/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.ImageIO;

/**
 * Represents a Single Library Book. 
 * Used in the Library Management System
 * @author lamon
 */
public class Book {
    private long isbn;
    private String title;
    private String author;
    private boolean onLoan;
    private Date returnDate;
    private LibraryMember borrowing;
    private BufferedImage coverPhoto;
    
    /**
     * Makes a book using ISBN Number, Title and Author
     * @param isbn the ISBN number of the book
     * @param title the title of the book
     * @param author the author of the book
     */
    public Book(long isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.onLoan = false;
        this.returnDate = null;
        this.borrowing = null;
        this.coverPhoto = null;
    }
    
    public Book(long isbn, String title, String author, String filename){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.onLoan = false;
        this.returnDate = null;
        this.borrowing = null;
        try{
            this.coverPhoto = ImageIO.read(new File(filename));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    /**
     * Returns the title of the book
     * @return a String representing the title of the book
     */
    public String getTitle(){
        return this.title;
    }
    
    /**
     * Returns the author of the book
     * @return a String representing the book's author
     */
    public String getAuthor(){
        return this.author;
    }
    
    /**
     * Returns the ISBN number of the book
     * @return the integer representing the ISBN number of the book
     */
    public long getISBN(){
        return this.isbn;
    }
    
    /**
     * Returns whether the book is currently out of the Library
     * @return returns true if the book is currently on loan and false if the book is in the library
     */
    public boolean isOnLoan(){
        return this.onLoan;
    }
    
    /**
     * Returning the LibraryMember who currently is borrowing the book
     * @return the LibraryMember currently in possession of the book
     */
    public LibraryMember whereIsIt(){
        return this.borrowing;
    }
    
    /**
     * Returns when the book is due back at the Library
     * @return the date which the book should be returned by
     */
    public Date getReturnDate(){
        return this.returnDate;
    }
    
    /**
     * Checks a borrowed book back into the Library
     */
    public void checkIn(){
        this.onLoan = false;
        this.borrowing = null;
        this.returnDate = null;
    }
    
    /**
     * Checks out a book to the specific Library Member
     * @param member the Library Member checking out the book
     */
    public void checkOut(LibraryMember member){
        this.borrowing = member;
        this.onLoan = true;
        // use a Calendar to set a date 2 weeks in the future
        Calendar c = Calendar.getInstance();
        // setting the date to the current date
        c.setTimeInMillis(System.currentTimeMillis());
        // add two weeks
        c.add(Calendar.WEEK_OF_YEAR, 2);
        // set the return date
        this.returnDate = c.getTime();
    }

    public BufferedImage getImage() {
        return this.coverPhoto;
    }
}
