package com.carRental.RentalSystem.Interfaces;

import com.carRental.entity.Member;
import com.carRental.entity.Vehicle;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public interface IVehicleRentalService {

    void catalogService(Member member, ArrayList<Vehicle> vehicleList);

    void rentalService(Vehicle vehicle, Member member, Scanner scanner) throws ParseException;

}


