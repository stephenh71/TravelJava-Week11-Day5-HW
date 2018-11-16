import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    Passengers passenger;
    Flight flight;
    private ArrayList<Passengers> bookedPassengers;


    @Before
    public void setUp() {
        passenger = new Passengers("Stephen", 2);
        Plane plane = new Plane(PlaneType.BOENG747);
        flight = new Flight(plane, "BA4567", "LHR", "GLA", "06:50");
        flight.bookPassenger(passenger);
    }

    @Test
    public void canBookPassengers() {
        assertEquals(1, flight.numberBookedPassengers());
    }

    @Test
    public void checkAvailableSeats(){
        assertEquals(true, flight.availableSeats());
    }



}

