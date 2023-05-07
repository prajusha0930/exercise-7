package com.example.Car.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Car.Model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer>{
	@Query("select s from Car s where s.owners=:owners")
	public List<Car> getCarByOwners(int owners);
	@Query("select s from Car s where s.address=:address")
	public List<Car> getCarByAddress(String address);
	@Query("select s from Car s where s.carName=:carName")
	public List<Car> getCarByName(String carName);
	@Query("select s from Car s where s.carType=?1 and s.owners=?2")
	public List<Car> getCarByType(int owners, String carType);

}
