package com.stackroute;

public class BookService {
/*Method to create object of Author, input values and return Author*/
    public Author createAuthor(String name, String country)
    {
        Author authObj= new Author(name,country);
        return authObj;
    }

/*Method to create an object of book and input data then return book*/
    public Book createBook(long isbn, String title, String edition, String name, String country)
    {
        Book bookObj = new Book(isbn,title,edition, new Author(name,country));
        return bookObj;
    }
}
