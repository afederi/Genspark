package org.example.Controller;


import org.example.Entity.Book;
import org.example.Service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/")
    public String home(){
        return "IT HAS WORKED!!!!";
    }

    @GetMapping("/all")
    public List<Book> getBooks(){
        return bookService.getAllBooks();
    }
    @GetMapping("/byAuthor/{author}")
    public List<Book> getBookByAuthor(@PathVariable String author ){

        System.out.println("HIT the Controller!!!");
        return bookService.getBookByAuthor(author);//This is invoking the named query
    }
    @GetMapping("/byAuthor")
    public List<Book> getBookByAuthor2(@RequestParam("author") String author){
        return bookService.getBookByAuthor(author); //This is invoking the named query
    }
    @GetMapping("/byPublicationYearRange")
    public List<Book> getBooksByPublicationYear(@RequestParam("min") int minYear, @RequestParam("max") int maxYear){
        return bookService.getBookByPublicationRange(minYear,maxYear);
    }

    @GetMapping("/author/{author}")
    public List<Book> getBooksDetailsByAuthor(@PathVariable String author){
        return bookService.getBookDetailsByAuthor(author);//This is invoking the native query
    }


    @GetMapping("/price")
    public List<Book> getBooksInPriceRange(@RequestParam("minPrice") double minPrice, @RequestParam("maxPrice") double maxPrice){
        return bookService.getBookByPriceRange(minPrice, maxPrice);// This is invoking the typed query
    }





    @PostMapping()
    public Book addBook(@RequestBody Book b){
        return this.bookService.addBook(b);

    }

}
