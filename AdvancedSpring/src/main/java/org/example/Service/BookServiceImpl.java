package org.example.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.example.Entity.Book;
import org.example.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private EntityManager em;

    @Override
    public List<Book> getAllBooks() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book addBook(Book b){
        return this.bookRepo.save(b);
    }

    @Override
    public void updateBook(Book b){
        this.bookRepo.save(b);
    }

    @Override
    public void deleteBook(Book b){
        this.bookRepo.delete(b);
    }


    @Override
    public Book getBookById(long id){
        return new Book();
    }



    @Override
    public List<Book> getBookByPublicationRange(int min, int max){

        Query q = em.createNamedQuery("Book.findByPublicationYearRange");
        q.setParameter("minYear", min);
        q.setParameter("maxYear", max);
        return q.getResultList();
    }


    //This service method is used to invoke the named query
    @Override
    public List<Book> getBookByAuthor(String author){
        System.out.println("HIT THE SERVICE!!!");

        Query q = em.createNamedQuery("Book.findByAuthors");
        q.setParameter("author", author);
        return q.getResultList();
    }



    /* Building a typed Query using JPQL */
    public List<Book> getBookByPriceRange(double minPrice, double maxPrice){

        TypedQuery<Book> query = em.createQuery(
                "SELECT b FROM Book b Where b.price BETWEEN :minPrice AND :maxPrice", Book.class
        );
        query.setParameter("minPrice", minPrice);
        query.setParameter("maxPrice", maxPrice);


        return query.getResultList();
    }


    /* This service method is used to invoke the native query*/
    @Override
    public List<Book> getBookDetailsByAuthor(String author) {
        return this.bookRepo.getBookDetailsByAuthor(author);
    }
}
