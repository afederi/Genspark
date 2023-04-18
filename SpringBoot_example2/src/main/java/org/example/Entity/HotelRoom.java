package org.example.Entity;

public class HotelRoom {
    int room_num;
    String bed_Type;
    boolean is_smoke;
    int capacity;
    String requests;
    boolean booked;

    public HotelRoom() {
    }

    public HotelRoom(int room_num, String bed_Type, boolean is_smoke, int capacity, String requests, boolean booked) {
        this.room_num = room_num;
        this.bed_Type = bed_Type;
        this.is_smoke = is_smoke;
        this.capacity = capacity;
        this.requests = requests;
        this.booked = booked;
    }

    public int getRoom_num() {
        return room_num;
    }

    public void setRoom_num(int room_num) {
        this.room_num = room_num;
    }

    public String getBed_Type() {
        return bed_Type;
    }

    public void setBed_Type(String bed_Type) {
        this.bed_Type = bed_Type;
    }

    public boolean isIs_smoke() {
        return is_smoke;
    }

    public void setIs_smoke(boolean is_smoke) {
        this.is_smoke = is_smoke;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRequests() {
        return requests;
    }

    public void setRequests(String requests) {
        this.requests = requests;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "room_num=" + room_num +
                ", bed_Type='" + bed_Type + '\'' +
                ", is_smoke=" + is_smoke +
                ", capacity=" + capacity +
                ", requests='" + requests + '\'' +
                ", booked=" + booked +
                '}';
    }
}
