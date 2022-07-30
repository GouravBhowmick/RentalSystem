package com.carRental.entity;

import com.carRental.entity.Member;
import com.carRental.entity.Vehicle;
import com.carRental.enums.VehicleStatus;

import java.util.Date;

public class Reservation {

    private Member member;
    private Vehicle vehicle;
    private VehicleStatus status;
    private Date checkOut;
    private Date returnDate;

    public Reservation(Member member, Vehicle vehicle, VehicleStatus status, Date checkOut) {
        this.member = member;
        this.vehicle = vehicle;
        this.status = status;
        this.checkOut = checkOut;

    }
    public Reservation(Member member, Vehicle vehicle, VehicleStatus status, Date checkOut, Date returnDate) {
        this.member = member;
        this.vehicle = vehicle;
        this.status = status;
        this.checkOut = checkOut;
        this.returnDate = returnDate;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleStatus isStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
