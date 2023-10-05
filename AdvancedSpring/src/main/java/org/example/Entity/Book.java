package org.example.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity

// You need to set the parameter :author. This will be seen in book service
@NamedQuery(name = "Book.findByAuthors", query = "SELECT b FROM Book b WHERE b.author = :author")
@NamedQuery( name= "Book.findByPublicationYearRange", query = "SELECT b FROM Book b Where b.publicationYear BETWEEN :minYear AND :maxYear")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long book_id;
    String title;
    String author;
    double price;
    int publicationYear;
}
