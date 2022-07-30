package com.carRental.RentalSystem.Implementation;

import com.carRental.RentalSystem.Interfaces.IReservationService;
import com.carRental.entity.Member;
import com.carRental.entity.Reservation;
import com.carRental.entity.Vehicle;
import com.carRental.enums.VehicleStatus;
import com.carRental.exception.BookingFailedException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReservationServiceImpl implements IReservationService {

    private Date getCheckOutDate(Scanner scanner) throws ParseException {
        Date date = null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter check-in date (gg/aa/yy):");
        String dateInput = scanner.nextLine();

        if(null != dateInput && dateInput.trim().length() > 0){
            date = format.parse(dateInput);
        }
        return date;
    }
    @Override
    public Reservation bookVehicle(Vehicle vehicle, Member member, Scanner scanner) throws ParseException {

        Date checkOutDate =  getCheckOutDate(scanner);
        Reservation reservation = new Reservation(member,vehicle, VehicleStatus.RESERVED, checkOutDate);
        return reservation;
    }

    @Override
    public void viewBookings() {

    }

    @Override
    public void cancelBooking() {

    }
}
