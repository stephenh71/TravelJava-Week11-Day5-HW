public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public int baggageWeightBooked (){
        int bagWeight = 3;
        int baggageBooked = 0;
        for (Passengers passenger : flight.getBookedPassengers() ){
            baggageBooked += passenger.getBags();
        }
        int baggageWeightBooked = bagWeight * baggageBooked;
        return baggageWeightBooked;
    }

    public int weightRemaining() {
        int weightRemaining = flight.getPlane().getPlaneType().getTotalWeight()/2 - this.baggageWeightBooked();
        return weightRemaining;
    }

    public int weightReservedPerPassenger() {
        int weightReservedPerPassenger = (flight.getPlane().getPlaneType().getTotalWeight()/2) / flight.getPlane().getPlaneType().getCapacity();
        return weightReservedPerPassenger;
    }


}