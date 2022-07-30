package com.carRental.RentalSystem.Implementation;

import com.carRental.RentalSystem.Interfaces.ICatalogService;
import com.carRental.RentalSystem.Interfaces.IReservationService;
import com.carRental.RentalSystem.Interfaces.IVehicleRentalService;
import com.carRental.entity.Member;
import com.carRental.entity.Reservation;
import com.carRental.entity.Vehicle;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class VehicleRentalServiceImpl implements IVehicleRentalService {
    Vehicle choosenVehicle;
    Reservation reservation;
    private ICatalogService catalogService;
    private IReservationService reservationService;
    Scanner scanner =  new Scanner(System.in);
    @Override
    public void catalogService(Member member, ArrayList<Vehicle> vehicle)  {
       //choosenVehicle =  new CatalogServiceImpl().showVehicle(scanner);
      // rentalService(choosenVehicle, member, scanner);

    }

    @Override
    public void rentalService(Vehicle vehicle, Member member, Scanner scanner) throws ParseException {
        System.out.println("Proceeding to reserve your choosen vehicle");
        reservation = new ReservationServiceImpl().bookVehicle(vehicle,member,scanner);

    }



}
