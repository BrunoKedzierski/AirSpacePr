public class Airliner extends Airplane {

    private String airline;
    private String flightNumber;
    private String origin;
    private String destination;

    public Airliner(int x, int y, int wektorRuchu, int pulap, int velocity, String model, String engineType, int numberOfEngines, int numberOfPilots, String aircraftRegistration, String airline, String flightNumber, String origin, String destination) {
        super(x, y, wektorRuchu, pulap, velocity, model, engineType, numberOfEngines, numberOfPilots, aircraftRegistration);
        this.airline = airline;
        this.flightNumber = flightNumber;

        this.origin = origin;
        this.destination = destination;
    }

    public Airliner(   String aircraftRegistration, String model, String engineType, int numberOfEngines, int numberOfPilots, String airline, String flightNumber, String origin, String destination) {
        super(  aircraftRegistration, model, engineType, numberOfEngines, numberOfPilots);
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
    }

    public Airliner() {
    }

    public String getAirline() {
        return airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }


    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return super.toString() + "airline:" + airline  + ", flightNumber:" + flightNumber + ", origin:" + origin +", destination:" + destination + ", ";
    }
}
