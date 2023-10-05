package org.example.Service;

import org.example.Entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> getAllBooks();
    public List<Book> getBookByPriceRange(double minPrice, double maxPrice);



    public Book addBook(Book b);

    public void updateBook(Book b);

    public void deleteBook(Book b);


    public Book getBookById(long id);



    public List<Book> getBookByPublicationRange(int min, int max);

    public List<Book> getBookByAuthor(String author);

    public List<Book> getBookDetailsByAuthor(String author);
}
