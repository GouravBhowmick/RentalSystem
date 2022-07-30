package com.carRental.RentalSystem.Interfaces;

import com.carRental.entity.Member;
import com.carRental.entity.Reservation;
import com.carRental.entity.Vehicle;

import java.text.ParseException;
import java.util.Scanner;

public interface IReservationService {

        public Reservation bookVehicle(Vehicle vehicle, Member member, Scanner scanner) throws ParseException;
        public void viewBookings();
        public void cancelBooking();
}
