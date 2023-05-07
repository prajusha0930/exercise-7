package com.example.Car.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Car.Model.Car;
import com.example.Car.Service.Carservice;



@RestController
public class Carcontroller {
       @Autowired
       Carservice cs;
       @PostMapping("/")
	    public boolean saveinfo(@RequestBody Car s) {
	    	return cs.saveinfo(s);
	    }
       @GetMapping("/fetchByOwnwers/{owners}")
       public List<Car> getByowners(@PathVariable int owners)
       {
       	return cs.getCarName(owners);
       }
       @GetMapping("/fetchByAddress/{address}")
       public List<Car> getByaddress(@PathVariable String address)
       {
       	return cs.getCarAddress(address);
       }
       @GetMapping("/fetchByName/{carName}")
       public List<Car> getByName(@PathVariable String carName)
       {
       	return cs.getCarName(carName);
       }
       @GetMapping("/Owners/{owners}/carType/{carType}")
       public List<Car> gecarByType(@PathVariable int owners,@PathVariable String carType)
       {
       	return cs.getCarType(owners,carType);
       }
}
