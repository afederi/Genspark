package org.example.Service;

import org.example.Entity.Book;
import org.example.Repository.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    ListRepository listRepository;
    @Override
    public Book addBook(Book b) {
        return null;
    }

    @Override
    public List<Book> allBooks() {
        return listRepository.findAll();
    }

    @Override
    public Book bookById(long b_id) {
        return null;
    }

    @Override
    public Book updateBook(Book b) {
        return null;
    }

    @Override
    public Book removeBook(Book b) {
        return null;
    }

    @Override
    public Book removeBookById(long b_id) {
        return null;
    }
}
