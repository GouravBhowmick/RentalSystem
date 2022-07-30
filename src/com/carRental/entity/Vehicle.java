package com.carRental.entity;

import com.carRental.enums.CarType;
import com.carRental.enums.VanType;
import com.carRental.enums.VehicleStatus;

public class Vehicle {

 private String barcode;
 private String model;
 private String name;
 private String brand;
 private CarType carType;
 private int mileage;
 private VanType type;
 private VehicleStatus status;
 private int passengerCapacity;

 public Vehicle(String barcode, String model, String name, String brand, int mileage, VanType type, VehicleStatus status, int passengerCapacity) {
  this.barcode = barcode;
  this.model = model;
  this.name = name;
  this.brand = brand;
  this.mileage = mileage;
  this.type = type;
  this.status = status;
  this.passengerCapacity = passengerCapacity;
 }

 public Vehicle(String barcode, String model, String name, String brand, CarType carType, int mileage,VanType type, VehicleStatus status, int passengerCapacity) {
  this.barcode = barcode;
  this.model = model;
  this.name = name;
  this.brand = brand;
  this.carType = carType;
  this.mileage = mileage;
  this.type = type;
  this.status = status;
  this.passengerCapacity = passengerCapacity;
 }

 public String getBarcode() {
  return barcode;
 }

 public void setBarcode(String barcode) {
  this.barcode = barcode;
 }

 public String getModel() {
  return model;
 }

 public void setModel(String model) {
  this.model = model;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getBrand() {
  return brand;
 }

 public void setBrand(String brand) {
  this.brand = brand;
 }

 public CarType getCarType() {
  return carType;
 }

 public void setCarType(CarType carType) {
  this.carType = carType;
 }

 public int getMileage() {
  return mileage;
 }

 public void setMileage(int mileage) {
  this.mileage = mileage;
 }

 public VanType getType() {
  return type;
 }

 public void setType(VanType type) {
  this.type = type;
 }

 public VehicleStatus getStatus() {
  return status;
 }

 public void setStatus(VehicleStatus status) {
  this.status = status;
 }

 public int getPassengerCapacity() {
  return passengerCapacity;
 }

 public void setPassengerCapacity(int passengerCapacity) {
  this.passengerCapacity = passengerCapacity;
 }
}
