/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

import java.time.LocalDateTime;

/**
 *
 * @author bellogbemisola
 */
public class BooksTester {
    public static void main(String[] args) {
        // trying to consume the created constructor 
       BooksResponse BookJava1 = new BooksResponse("Thinking in java");
       BooksResponse BookJava3 = new BooksResponse("Java World", "23412","Gbemisola", LocalDateTime.now().toString());
       BooksResponse BookJava2 = new BooksResponse("My Java World", "2342","Taiwo", LocalDateTime.now().toString());
       
       System.out.println("This is java book 1 title: " + BookJava1.getBookTile());
       System.out.println("This is java book 1 IsbnNO: " + BookJava1.getIsbnNO());
       System.out.println("This is java book 1 Publisher: " + BookJava1.getPublisher());
       System.out.println("This is java book 1 PublishedDate: " + BookJava1.getPublishedDate());
       System.out.println("This is java book 2 title: " + BookJava1.getBookTile());
       System.out.println("This is java book 2 IsbnNO: " + BookJava1.getIsbnNO());
       System.out.println("This is java book 2 Publisher: " + BookJava1.getPublisher());
       System.out.println("This is java book 2 PublishedDate: " + BookJava1.getPublishedDate());
    }
}
