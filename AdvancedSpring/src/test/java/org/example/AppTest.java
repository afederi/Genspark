package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.Controller.BookController;
import org.example.Entity.Book;
import org.example.Repository.BookRepo;
import org.example.Service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest 
    extends TestCase
{

    @Autowired
    private BookController controller;

    @Autowired
    private BookServiceImpl service;

    @MockBean
    private BookRepo repository;
    
    public void testAllBooks(){
        when(this.repository.findAll()).thenReturn(Stream.of(new Book(2, "HelloWorld", "Steve", 7.99, 2016)).collect(Collectors.toList()));
        assertEquals(1 , service.getAllBooks().size());
    }


}
