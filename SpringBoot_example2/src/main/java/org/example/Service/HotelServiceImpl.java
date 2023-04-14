package org.example.Service;

import org.example.Entity.HotelRoom;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelServiceImpl implements  HotelService{
    List<HotelRoom> list;

    public HotelServiceImpl() {
        list = new ArrayList<>();
        list.add(new HotelRoom(1, "King size", false, 4, "N/A", true));
        list.add(new HotelRoom(2, "King size", false, 4, "N/A", true));
        list.add(new HotelRoom(3, "Queen size", false, 4, "N/A", false));
        list.add(new HotelRoom(4, "King size", true, 8, "N/A", true));
        list.add(new HotelRoom(5, "Twin beds", false, 4, "N/A", false));
        list.add(new HotelRoom(6, "Twin beds", false, 4, "N/A", true));
        list.add(new HotelRoom(7, "King size", false, 3, "N/A", true));
        list.add(new HotelRoom(8, "Queen size", true, 4, "N/A", false));
        list.add(new HotelRoom(9, "King size", false, 4, "N/A", true));
        list.add(new HotelRoom(10, "King size", false, 4, "N/A", true));


    }

    @Override
    public List<HotelRoom> getAllRooms() {
        return list;
    }

    @Override
    public List<HotelRoom> getAvailableRooms() {
        List<HotelRoom> c=new ArrayList<>();

        for(HotelRoom g : list){
            if(!g.isBooked()){
                c.add(g);
            }
        }

        return c;
    }

    @Override
    public HotelRoom getHotelByRoomNum(int roomNum) {
        HotelRoom h = null;

        for(HotelRoom g: list){
            if(g.getRoom_num()==roomNum){
                h=g;
                break;
            }
        }
        return h;
    }

    @Override
    public HotelRoom addRoom(HotelRoom h) {
        for(HotelRoom g : list){
            if(h.getRoom_num()==g.getRoom_num()) {
                System.out.println("Room number exists");
                return h;
            }
        }
        list.add(h);
        return h;
    }

    @Override
    public HotelRoom updateRoom(HotelRoom h) {
        int room_num = h.getRoom_num();
        String bed_type = h.getBed_Type();
        boolean smoke = h.isIs_smoke();
        int capacity = h.getCapacity();
        String request = h.getRequests();
        boolean booked = h.isBooked();

        HotelRoom r = null;

        for(HotelRoom g : list){
            if(g.getRoom_num()==h.getRoom_num()){
                g.setRoom_num(room_num);
                g.setBed_Type(bed_type);
                g.setIs_smoke(smoke);
                g.setCapacity(capacity);
                g.setRequests(request);
                g.setBooked(booked);
                r=g;
            }
        }
        return r;
    }

    @Override
    public String deleteRoom(int roomNum) {
        for(HotelRoom g: list){
            if(g.getRoom_num()==roomNum){
                list.remove(g);
                break;
            }
        }
        return "Deleted Successfully";
    }
}