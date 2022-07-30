package com.carRental.RentalSystem.Implementation;

import com.carRental.RentalSystem.Interfaces.ICatalogService;
import com.carRental.entity.Member;
import com.carRental.entity.Vehicle;
import com.carRental.enums.CarType;
import com.carRental.enums.VanType;
import com.carRental.enums.VehicleStatus;
import com.carRental.exception.VehicleNotAvailableException;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogServiceImpl implements ICatalogService {


    Vehicle vehicle = new Vehicle("1111", "CITY4", "City 4th Gen", "Honda", CarType.LUXURY,20, VanType.PASSENGER,VehicleStatus.AVAILABLE,4);
    Boolean flag = true;
    Vehicle choosenVehicle = null;

    private void viewCarTypes(){
        CarType type[] = CarType.values();
        System.out.println("=========Type of vehicles we have ====== ");
        for (CarType t : type) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private ArrayList<Vehicle> dummyCatalogList(ArrayList<Vehicle> vehicleList){
        vehicleList.add(vehicle);
        return vehicleList;
    }

    private Vehicle isBarcodeAvailable(ArrayList<Vehicle> vehicleList, String barcode){
        Vehicle vehicle = null;
        for(Vehicle veh :vehicleList){
            if(veh.getBarcode().equals(barcode))
               vehicle = veh;
        }
        return vehicle;
    }

    @Override
    public Vehicle showVehicle(Member member, ArrayList<Vehicle> vehicleList) {

        if(vehicleList.isEmpty()) {
            vehicleList = dummyCatalogList(vehicleList);
        }
        else {
            while (flag) {
                viewCarTypes();
                Scanner scanner = new Scanner(System.in);
                System.out.print("Type of vehicles to search for: ");
                String carType = scanner.next();
                //vehicleList = searchVehicleByType(carType);
                System.out.println("=================== We have few vehicle in our List ===========");
                if (vehicleList.size() > 0) {
                    System.out.println("Vehicle Barcode ||  Vehicle Name || Vehicle Brand || Vehicle Available Status || Vehicle Capacity");
                    for (Vehicle v : vehicleList) {
                        System.out.println(v.getBarcode() + "  ||" + v.getName() + "  ||" + v.getBrand() + "  ||" + v.getStatus() + "  ||" + v.getPassengerCapacity());
                    }
                    System.out.println("=========== Please enter the barcode to reserve =======================");
                    String barCode = scanner.next();
                    Vehicle choosenVehicle = isBarcodeAvailable(vehicleList, barCode);
                    if (choosenVehicle != null)
                        flag = false;

                } else {
                    System.out.println("No vehicle Available Please Select some other type");
                }
            }
        }
     return choosenVehicle;
    }



}
