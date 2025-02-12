package repository;

import java.util.ArrayList;
import java.util.List;

import models.Passenger;

public class ListPassengerRepo {
	private List<Passenger> passengers;
	public ListPassengerRepo() {
		passengers = new ArrayList<>();
	}
	public void addPassenger(Passenger passenger) {
		passengers.add(passenger);
	}
	public void displayPassengers() {
		if (passengers.isEmpty()) {
            System.out.println("No passengers in the list.");
        } else {
            for (Passenger passenger : passengers) {
                System.out.println("Name: " + passenger.passengerName);
                System.out.println("Age: " + passenger.age);
                System.out.println("Train Number: " + passenger.passengerTrainNumber);
                System.out.println("Gender: " + passenger.gender);
                System.out.println("Phone Number: " + passenger.phoneNumber);
                System.out.println("Email: " + passenger.email);
                System.out.println("---------------------------");
            }
        }
	}
}
