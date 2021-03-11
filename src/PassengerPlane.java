public class PassengerPlane extends  Airliner{

    private int numberOfPassengers;
    private int numberOfCabinCrew;

    public PassengerPlane(int x, int y, int wektorRuchu, int pulap, int velocity, String model, String engineType, int numberOfEngines, int numberOfPilots, String aircraftRegistration, String airline, String flightNumber, String origin, String destination, int numberOfPassengers, int numberOfCabinCrew) {
        super(x, y, wektorRuchu, pulap, velocity, model, engineType, numberOfEngines, numberOfPilots, aircraftRegistration, airline, flightNumber, origin, destination);
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfCabinCrew = numberOfCabinCrew;
    }


    public PassengerPlane(   String aircraftRegistration, String model, String engineType, int numberOfEngines, int numberOfPilots, String airline, String flightNumber, String origin, String destination, int numberOfPassengers, int numberOfCabinCrew) {
        super(   aircraftRegistration, model, engineType, numberOfEngines, numberOfPilots, airline, flightNumber, origin, destination);
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfCabinCrew = numberOfCabinCrew;
    }


    public PassengerPlane() {
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public int getNumberOfCabinCrew() {
        return numberOfCabinCrew;
    }


    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setNumberOfCabinCrew(int numberOfCabinCrew) {
        this.numberOfCabinCrew = numberOfCabinCrew;
    }

    @Override
    public String toString() {
        return super.toString() + "numberOfPassengers:" + numberOfPassengers + ", numberOfCabinCrew:" + numberOfCabinCrew;
    }
}
