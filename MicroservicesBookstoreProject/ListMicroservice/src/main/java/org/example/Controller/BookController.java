package org.example.Controller;


import lombok.extern.slf4j.Slf4j;
import org.example.Entity.Book;
import org.example.Service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Slf4j
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookServiceImpl bookService;


    @GetMapping("/login")
    public ResponseEntity<String> userLogin(@AuthenticationPrincipal OAuth2User principle){
        String msg = "Invalid user, unable to process further. Please authenticate yourself";

        if(principle !=null){
            String customerName = principle.getAttribute("name");
            log.info("Hello : {}", customerName);

        }

        return ResponseEntity.status(HttpStatus.OK).body(msg);

    }

    //http://localhost:8082/book/home
    @GetMapping(value = "/home")
    public String home(){
        return "Welcome to the book page";
    }

    @GetMapping("/all")
    public List<Book> allBooks(){
        return bookService.allBooks();
    }

    @GetMapping("{b_id}")
    public Book getBookById(String b_id){
        return bookService.bookById(Long.parseLong(b_id));
    }

    @PostMapping("/add")
    public Book addBook(@RequestBody Book b){
        return bookService.addBook(b);
    }

    @PutMapping("/update")
    public Book updateBook(@RequestBody Book b){
        return bookService.updateBook(b);
    }

    @DeleteMapping("/delete")
    public Book removeBook(@RequestBody Book b){
        return bookService.removeBook(b);
    }

    @DeleteMapping("/delete/{id}")
    public Book removeBookById(@PathVariable String id){
        return bookService.removeBookById(Long.parseLong(id));
    }



}
