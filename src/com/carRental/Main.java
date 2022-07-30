package com.carRental;

import com.carRental.entity.Member;
import com.carRental.entity.Vehicle;
import com.carRental.frontDesk.IFrontDeskService;
import com.carRental.frontDesk.FrontDeskServiceImpl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    private final static Logger LOGGER =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) throws ParseException {

        LOGGER.log(Level.INFO, "My first Log Message");
     // create a Vehicle Reservation object
        IFrontDeskService frontDeskService = new FrontDeskServiceImpl();
        ArrayList<Member> membersList = new ArrayList<Member>();
        ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
        Scanner scanner =  new Scanner(System.in);
        while(true){
            System.out.print("Press 1 for Member, Press 2 for Receptionist, Press 3 for Worker");
            int userType = scanner.nextInt();
            if(userType == 1){

                frontDeskService.systemForMember (membersList,vehicleList);
            }
            else if(userType == 2){
                frontDeskService.systemForReceptionist(scanner);
            }
            else if(userType == 3){
                frontDeskService.systemForWorker(scanner);
            }
        }

    }
}
