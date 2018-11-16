import java.util.ArrayList;

public class Flight {

    private ArrayList<Passengers> bookedPassengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.bookedPassengers = new ArrayList<Passengers>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Passengers> getBookedPassengers() {
        return bookedPassengers;
    }

    public void setBookedPassengers(ArrayList<Passengers> bookedPassengers) {
        this.bookedPassengers = bookedPassengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }


    public int numberBookedPassengers() {
        return this.bookedPassengers.size();
    }

    public void bookPassenger(Passengers passenger) {
        if(availableSeats()){
            bookedPassengers.add(passenger);
        }
    }

    public boolean availableSeats() {
        return plane.getPlaneType().getCapacity() - numberBookedPassengers() > 0;
    }

}



