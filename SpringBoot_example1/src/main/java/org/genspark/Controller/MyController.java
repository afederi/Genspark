package org.genspark.Controller;

import org.genspark.Entity.Vehicles;
import org.genspark.Service.VehiclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {


    @Autowired
    private VehiclesService vehiclesService;

    @RequestMapping("/home")
    public String home(@RequestParam(value="name",defaultValue="World")String name, @RequestParam(value="Message", defaultValue = "Good Morning")String message){
        return "Hello"+name+" "+message;
    }

    @GetMapping("/")
    public String home(){
        return "<HTML><H1>Welcome to Course Application</H1></HTML>";
    }

    @GetMapping("/vehicles")
    public List<Vehicles> getVehicle(){
        return this.vehiclesService.getAllVehicles();
    }

    @GetMapping("/vehicles/{vehicleID}")
    public Vehicles getVehicleID(@PathVariable String vehicleID){
        return this.vehiclesService.getVehicleById(Integer.parseInt(vehicleID));
    }

    @PostMapping("/vehicles")
    public Vehicles addVehicle(@RequestBody Vehicles vehicles){
        return this.vehiclesService.addVehicle(vehicles);
    }

    @PutMapping("/vehicles")
    public Vehicles updateVehicle(@RequestBody Vehicles vehicles){
        return this.vehiclesService.updateVehicle(vehicles);
    }

    @DeleteMapping("/vehicles/{vehicleID}")
    public String deleteCourse(@PathVariable String vehicleID){
        return this.vehiclesService.deleteVehicleByID(Integer.parseInt(vehicleID));
    }


}
