package org.genspark.Service;

import org.genspark.Entity.Vehicles;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehiclesServiceImpl implements VehiclesService{
    List<Vehicles> list;

    public VehiclesServiceImpl(){
        list=new ArrayList<>();
        list.add(new Vehicles(0,"14FR352", "SUV", "RED", 40000.00, "123ABC"));
        list.add(new Vehicles(1,"3D5232GK45", "CAR", "SILVER", 27850.98, "234BCD"));
        list.add(new Vehicles(2,"G90UID098", "truck", "PURPLE", 65000.00, "345CDE"));
    }

    @Override
    public List<Vehicles> getAllVehicles() {
        return list;
    }

    @Override
    public Vehicles getVehicleById(int vehicleID) {
        Vehicles v = null;

        for(Vehicles g: list){
            if(g.getV_id()==vehicleID){
                v=g;
                break;
            }
        }
        return v;
    }

    @Override
    public Vehicles addVehicle(Vehicles v) {
        list.add(v);
        return v;
    }

    @Override
    public Vehicles updateVehicle(Vehicles v) {
        String vin = v.getVin();
        String type = v.getType();
        String color = v.getColor();
        Double price = v.getPrice();
        String l_plate = v.getLicensePlate();
        Vehicles veh = null;

        for(Vehicles g : list){
            if(g.getV_id() == v.getV_id()){
                g.setVin(vin);
                g.setType(type);
                g.setColor(color);
                g.setPrice(price);
                g.setLicensePlate(l_plate);
                veh = g;
            }
        }
        return veh;
    }

    @Override
    public String deleteVehicleByID(int vehicleID) {
        for(Vehicles g: list){
            if(g.getV_id()==vehicleID){
                list.remove(g);
                break;
            }
        }
        return "Deleted Successfully";
    }
}
