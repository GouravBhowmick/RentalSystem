package com.carRental.frontDesk;

import com.carRental.entity.Member;
import com.carRental.entity.Vehicle;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public interface IFrontDeskService {

    void systemForMember(ArrayList<Member> memberList,ArrayList<Vehicle> vehicleList);
    void systemForReceptionist(Scanner scanner);
    void systemForWorker(Scanner scanner);
}
