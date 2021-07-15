/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;
import java.util.Date;

/**
 *
 * @author bellogbemisola
 */
public class BooksResponse {

    /**
     * @param args the command line arguments
     */

    private String bookTile;
    private String  isbnNO;
    private String publisher;
    private String publishedDate;

    public BooksResponse(String bookTile, String isbnNO, String publisher, String publishedDate) {
        this.bookTile = bookTile;
        this.isbnNO = isbnNO;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
    }

    public BooksResponse(String bookTile) {
        this.bookTile = bookTile;
    }

    public BooksResponse(String bookTile, String isbnNO) {
        this.bookTile = bookTile;
        this.isbnNO = isbnNO;
    }

    public String getPublishedDate() { return publishedDate; }

    public void setPublishedDate(String publishedDate) { this.publishedDate = publishedDate; }

    public String getBookTile() {
        return bookTile;
    }

    public String getIsbnNO() {
        return isbnNO;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setBookTile(String bookTile) {  //void is been used since no return 
        this.bookTile = bookTile;
    }

    public void setIsbnNO(String isbnNO) {
        this.isbnNO = isbnNO;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    
}
