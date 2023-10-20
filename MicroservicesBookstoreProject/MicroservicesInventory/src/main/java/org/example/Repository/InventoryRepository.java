package org.example.Repository;

import org.example.Entity.BookInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<BookInventory, Long> {



}
