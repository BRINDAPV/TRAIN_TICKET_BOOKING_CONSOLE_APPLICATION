package ui;

import java.util.*;

import models.Passenger;
import repository.ListPassengerRepo;
import repository.ListTrainRepo;


public class Main {
	public static void main(String args[]) {
		Scanner h = new Scanner(System.in);
		System.out.println("Train Ticket Booking\n");
		System.out.println("These are availabel trains");
		
		ListTrainRepo trainRepo = new ListTrainRepo();
		trainRepo.displayTrains();
		
		ListPassengerRepo passengerRepo = new ListPassengerRepo();
		
        char addMorePassengers = 'Y'; // Variable to control the loop
        
        while (addMorePassengers == 'Y' || addMorePassengers == 'y') {
		Passenger passenger = new Passenger();
		
		System.out.println("\nPassenger Kindly enter your details:");

		System.out.print("Enter passenger name: ");
	    passenger.passengerName = h.nextLine();

	        // Getting passenger's age
	    System.out.print("Enter age: ");
	    passenger.age = h.nextInt();
	        
	        // Getting train number
	    System.out.print("Enter the train number: ");
	    passenger.passengerTrainNumber = h.nextInt();
	        
	    h.nextLine(); // Consume the remaining newline character

	    // Getting passenger's gender
	    System.out.print("Enter gender (Male/Female/Other): ");
	    passenger.gender = h.nextLine();
	        
	        // Getting passenger's phone number
	    System.out.print("Enter phone number: ");
	    passenger.phoneNumber = h.nextLong();
	        
	    h.nextLine(); // Consume the remaining newline character
	        
	        // Getting passenger's email
	    System.out.print("Enter email address: ");
	    passenger.email = h.nextLine();
	        
	    passengerRepo.addPassenger(passenger);
	
	    System.out.print("\nDo you want to add another passenger? (Y/N): ");
        addMorePassengers = h.nextLine().charAt(0);
        }
        passengerRepo.displayPassengers();
        
        System.out.println("Confirm ticket by entering confirm");
        String confirm = h.nextLine();
        if (confirm.equals("confirm") || confirm.equals("CONFIRM")) {
        	
        }
	}
}
