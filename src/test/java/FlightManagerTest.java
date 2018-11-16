import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class FlightManagerTest {

    Passengers passenger;
    Flight flight;
    FlightManager flightManager;
    private ArrayList<Passengers> bookedPassengers;


    @Before
    public void setUp() {
        passenger = new Passengers("Stephen", 2);
        Plane plane = new Plane(PlaneType.BOENG747);
        flight = new Flight(plane, "BA4567", "LHR", "GLA", "06:50");
        flight.bookPassenger(passenger);
        flightManager = new FlightManager(flight);
    }

    @Test
    public void calculateBaggageWeightBooked() {
        assertEquals(6, flightManager.baggageWeightBooked());
    }

    @Test
    public void calculateWeightRemaining() {
        assertEquals(4, flightManager.weightRemaining());
    }

    @Test
    public void calculateBaggageWeightPerPassenger(){
        assertEquals(5, flightManager.weightReservedPerPassenger());
    }


}