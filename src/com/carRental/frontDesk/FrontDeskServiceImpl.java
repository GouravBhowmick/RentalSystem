package com.carRental.frontDesk;

import com.carRental.RentalSystem.Implementation.VehicleRentalServiceImpl;
import com.carRental.RentalSystem.Interfaces.IVehicleRentalService;
import com.carRental.entity.Member;
import com.carRental.entity.Vehicle;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class FrontDeskServiceImpl implements IFrontDeskService {

    private IVehicleRentalService vehicleRentalService = new VehicleRentalServiceImpl();
    Scanner scanner =  new Scanner(System.in);
    public Member registerMember(){
        System.out.println("=================== Looks Like new to system, please fill the details ===========================");
        System.out.print("Need your Name:");
        String name = scanner.next();
        System.out.print("Address Please:");
        String address = scanner.next();
        System.out.print("Phone No:");
        String phoneNo = scanner.next();
        System.out.print("Mail Id:");
        String emailId = scanner.next();
        Member newMember = new Member(name, address, phoneNo, emailId);

        return newMember;
    }

    @Override
    public void systemForMember(ArrayList<Member> membersList, ArrayList<Vehicle> vehicleList) {

        if (membersList.isEmpty()) {
            Member newMember = registerMember();
            membersList.add(newMember);
            vehicleRentalService.catalogService(newMember, vehicleList);
        } else {
            System.out.print("Enter Mail Id to login");
            String emailId = scanner.next();
            for (Member mem : membersList) {
                if (mem.getEmail().equals(emailId)) {
                    vehicleRentalService.catalogService(mem, vehicleList);
                } else {
                    Member newMember = registerMember();
                    membersList.add(newMember);
                    vehicleRentalService.catalogService(newMember, vehicleList);
                }
            }
        }
    }


    @Override
    public void systemForReceptionist(Scanner scanner) {

    }

    @Override
    public void systemForWorker(Scanner scanner) {

    }
}
