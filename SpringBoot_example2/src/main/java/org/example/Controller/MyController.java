package org.example.Controller;

import org.example.Entity.HotelRoom;
import org.example.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private HotelService hotelService;

    @RequestMapping("/home")
    public String home(@RequestParam(value="name", defaultValue = "Hotel")String name){
        return "Welcome to the "+name;
    }

    @GetMapping("/")
    public String home(){return "<HTML><H1>Welcome to the Java Hotel";};

    @GetMapping("/hotelRooms")
    public List<HotelRoom> getRooms(){return this.hotelService.getAllRooms();}

    @GetMapping("/hotelRooms/ava")
    public List<HotelRoom> getAvailable(){return this.hotelService.getAvailableRooms();}

    @GetMapping("/hotelRooms/{roomNum}")
    public HotelRoom getRoomNUM(@PathVariable String roomNum){
        return this.hotelService.getHotelByRoomNum(Integer.parseInt(roomNum));
    }

    @PostMapping("/hotelRooms")
    public HotelRoom addVehicle(@RequestBody HotelRoom room){
        return this.hotelService.addRoom(room);
    }

    @PutMapping("/hotelRooms")
    public HotelRoom updateRoom(@RequestBody HotelRoom room){
        return this.hotelService.updateRoom(room);
    }

    @DeleteMapping("/hotelRooms/{roomNum}")
    public String deleteRoomNUM(@PathVariable String roomNum){
        return this.hotelService.deleteRoom(Integer.parseInt(roomNum));
    }


}
