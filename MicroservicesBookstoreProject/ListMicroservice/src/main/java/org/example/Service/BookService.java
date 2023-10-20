package org.example.Service;

import org.example.Entity.Book;

import java.util.List;

public interface BookService {

    public Book addBook(Book b);

    public List<Book> allBooks();

    public Book bookById(long b_id);

    public Book updateBook(Book b);

    public Book removeBook(Book b);

    public Book removeBookById(long b_id);
}
