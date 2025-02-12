package repository;

import java.util.ArrayList;
import java.util.List;

import models.Train;

public class ListTrainRepo {
	private List<Train> trains;
	
	public ListTrainRepo() {
		trains = new ArrayList<>();
		
		trains.add(new Train(201, "Chennai Express", "Chennai", "Bangalore", "06:00 AM", "10:00 AM", 250, 150.0));
		trains.add(new Train(202, "Kovai Express", "Coimbatore", "Chennai", "05:45 AM", "12:00 PM", 300, 180.0));
		trains.add(new Train(203, "Kerala Express", "Trivandrum", "Ernakulam", "07:00 AM", "11:00 AM", 400, 200.0));
		trains.add(new Train(204, "Netravati Express", "Mangalore", "Kochi", "09:00 AM", "02:00 PM", 350, 160.0));
		trains.add(new Train(205, "Charminar Express", "Hyderabad", "Chennai", "06:30 PM", "06:00 AM", 500, 220.0));
		trains.add(new Train(206, "Madurai Express", "Madurai", "Bangalore", "10:00 PM", "06:00 AM", 300, 180.0));
		trains.add(new Train(207, "Tirupati Express", "Tirupati", "Chennai", "07:00 AM", "11:30 AM", 200, 100.0));
		trains.add(new Train(208, "Mysore Express", "Bangalore", "Mysore", "06:00 PM", "08:30 PM", 150, 90.0));
		trains.add(new Train(209, "Vivek Express", "Kanyakumari", "Dibrugarh", "05:00 PM", "Multiple Days", 600, 300.0));
		trains.add(new Train(210, "Island Express", "Trivandrum", "Bangalore", "09:30 PM", "08:00 AM", 400, 250.0));

	}
	
	public void displayTrains() {
		for (Train train : trains) {
			System.out.println(train.trainNumber + ": " + train.trainName);
		}
	}
}
