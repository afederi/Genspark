package org.example.Service;


import org.example.Entity.BookInventory;
import org.example.Repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public BookInventory addItem(BookInventory bI) {
        return inventoryRepository.save(bI);
    }

    public List<BookInventory> allInventory() {
        return inventoryRepository.findAll();
    }

    public Optional inventoryByID(long inv_id) {
        return inventoryRepository.findById(inv_id);
    }

    public BookInventory updateInventoryItem(BookInventory bI) {
        return inventoryRepository.save(bI);
    }



    public void addInventory(long inv_id, int x) {
        BookInventory b = inventoryRepository.findById(inv_id).get();
        int amount = b.getInventory();
        amount+=1;

        b.setInventory(amount);

        inventoryRepository.save(b);

    }
    @Override
    public void removeInventory(long inv_id, int x) {

        BookInventory b = inventoryRepository.findById(inv_id).get();
        int amount = b.getInventory();
        if(amount>x) {
            amount -= 1;

            b.setInventory(amount);

            inventoryRepository.save(b);
        }else{
            System.out.println("Amount is greater than the inventory amount");
        }

    }
    public BookInventory deleteInventory(long inv_id) {
        BookInventory b = inventoryRepository.findById(inv_id).get();
        inventoryRepository.deleteById(inv_id);
        return b;
    }
}
