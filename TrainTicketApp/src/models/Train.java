package models;

public class Train {
	public int trainNumber;
	public String trainName;
	public String source;
	public String destination;
	public String departureTime;
	public String arrivalTime;
	public int totalSeats;
	public double ticketPrice;
	
	public Train(int trainNumber,String trainName,String source,String destination,String departureTime,String arrivalTime,int totalSeats,double ticketPrice) {
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.totalSeats = totalSeats;
		this.ticketPrice = ticketPrice;
	}
}
