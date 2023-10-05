package org.example.Repository;

import org.example.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

    List<Book> findByAuthors(String author);

    @Query(value = "SELECT * FROM book where author = ?", nativeQuery = true)
    List<Book> getBookDetailsByAuthor(String name);

}
