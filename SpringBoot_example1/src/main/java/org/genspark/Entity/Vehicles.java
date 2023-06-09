package org.genspark.Entity;

public class Vehicles {
    private int v_id;//This is removed because it is the generated ID for the database
    private String Vin;
    private String type;
    private String Color;
    private Double price;
    private String licensePlate;

    public Vehicles() {
    }



    public Vehicles(int v_id, String vin, String type, String color, Double price, String licensePlate) {
        this.v_id = v_id;
        Vin = vin;
        this.type = type;
        Color = color;
        this.price = price;
        this.licensePlate = licensePlate;
    }

    public int getV_id(){
        return v_id;
    }

    public String getVin() {
        return Vin;
    }

    public void setVin(String vin) {
        Vin = vin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
