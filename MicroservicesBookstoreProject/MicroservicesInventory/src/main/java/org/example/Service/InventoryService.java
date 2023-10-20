package org.example.Service;


import org.example.Entity.BookInventory;

import java.util.List;
import java.util.Optional;

public interface InventoryService
{

    public BookInventory addItem(BookInventory bI);

    public List<BookInventory> allInventory();

    public Optional inventoryByID(long inv_id);

    public BookInventory updateInventoryItem(BookInventory bI);

    public void addInventory(long inv_id, int x);
    public void removeInventory(long inv_id, int x);

    public BookInventory deleteInventory(long inv_id);


}
