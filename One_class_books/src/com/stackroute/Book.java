package com.stackroute;

public class Book {
    private  long isbn;
    private String title;
    private String edition;
    private Author author ;

    /*Creating parameterized constructor*/


    public Book(long isbn, String title, String edition, Author author) {
        this.isbn = isbn;
        this.title = title;
        this.edition = edition;
        this.author = author;
    }

    /*Creating getter and setter*/
    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    /*Creating default constructor*/
    public Book() {
    }

    public String getBookDetails()
    {
        String getBookDetailsOne = "Book{isbn="+isbn+", title='"+title+"', author="+author.getAuthorDetails()+"}";
        return getBookDetailsOne;
    }


}
