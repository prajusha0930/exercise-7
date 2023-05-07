package com.example.Car.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Car.Model.Car;
import com.example.Car.Repository.CarRepository;
@Service
public class Carservice {
       @Autowired
       CarRepository cr;
	public boolean saveinfo(Car s) {
		// TODO Auto-generated method stub
		return false;
	}
	public List<Car> getCarName(int owners) {
		// TODO Auto-generated method stub
		return cr.getCarByOwners(owners);
	}
	public List<Car> getCarAddress(String address) {
		// TODO Auto-generated method stub
		return cr.getCarByAddress(address);
	}
	public List<Car> getCarName(String carName) {
		// TODO Auto-generated method stub
		return  cr.getCarByName(carName);
	}
	public List<Car> getCarType(int owners, String carType) {
		// TODO Auto-generated method stub
		return cr.getCarByType(owners,carType);
	}
    
}
