package com.carRental.exception;

public class BookingFailedException extends Exception{
    public BookingFailedException(String msgs){
        super(msgs);
    }
}
