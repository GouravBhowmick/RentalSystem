package com.carRental.RentalSystem.Interfaces;

import com.carRental.entity.Member;
import com.carRental.entity.Vehicle;
import com.carRental.exception.VehicleNotAvailableException;

import java.util.ArrayList;
import java.util.Scanner;

public interface ICatalogService {

   // void addVehicle();
   // void removeVehicle();
   // void editVehicle();
    Vehicle showVehicle(Member member, ArrayList<Vehicle> vehicleList) ;
}
