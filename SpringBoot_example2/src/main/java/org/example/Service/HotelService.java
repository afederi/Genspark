package org.example.Service;

import org.example.Entity.HotelRoom;

import java.util.List;

public interface HotelService {
    List<HotelRoom> getAllRooms();
    List<HotelRoom> getAvailableRooms();

    HotelRoom getHotelByRoomNum(int roomNum);

    HotelRoom addRoom(HotelRoom h);

    HotelRoom updateRoom(HotelRoom h);

    String deleteRoom(int roomNum);
}
