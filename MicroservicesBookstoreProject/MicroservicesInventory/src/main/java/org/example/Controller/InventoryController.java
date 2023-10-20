package org.example.Controller;


import org.example.Entity.BookInventory;
import org.example.Service.InventoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryServiceImpl inventoryService;



    //http://localhost:8081/inventory/home
    @GetMapping("/home")
    public String home(){
        return "Welcome to the inventory page";
    }

    @GetMapping("/all")
    public List<BookInventory> allItems(){
        return inventoryService.allInventory();
    }

    @GetMapping("/{in_id}")
    public Optional getItemByID(@PathVariable String in_id){
        return inventoryService.inventoryByID(Long.parseLong(in_id));
    }

    @PostMapping("/add")
    public BookInventory addItem(@RequestBody BookInventory bI){
        return inventoryService.addItem(bI);
    }

    @PutMapping("/update")
    public BookInventory updateItem(@RequestBody BookInventory bI){
        return inventoryService.updateInventoryItem(bI);
    }

    @DeleteMapping("/remove/{id}")
    public BookInventory removeItem(@PathVariable String id){
        return inventoryService.deleteInventory(Long.parseLong(id));
    }

}
