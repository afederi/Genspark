package org.genspark.Service;

import org.genspark.Entity.Vehicles;

import java.util.List;

public interface VehiclesService {
    List<Vehicles> getAllVehicles();
    Vehicles getVehicleById(int vehicleID);

    Vehicles addVehicle(Vehicles v);

    Vehicles updateVehicle(Vehicles v);

    String deleteVehicleByID(int vehicleID);

}
