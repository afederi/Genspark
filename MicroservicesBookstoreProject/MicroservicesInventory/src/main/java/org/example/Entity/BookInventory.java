package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long inventoryId;

    double price;

    int inventory;

    /*
     * Turn into a book object later
     */

    private String name;

    private long ISBN;
    private String author;

    private String description;

}
