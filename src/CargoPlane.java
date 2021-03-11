public class CargoPlane extends Airliner{

    private String cargoType;
    private int loadKg;
    private boolean dangerousCargo;

    public CargoPlane(int x, int y, double z, int wektorRuchu, int pulap, int velocity, String model, String engineType, int numberOfEngines, int numberOfPilots, String aircraftRegistration, String airline, String flightNumber, String aircraftRegistration1, String origin, String destination, String cargoType, int load, boolean dangerousCargo) {
        super(x, y, wektorRuchu, pulap, velocity, model, engineType, numberOfEngines, numberOfPilots, aircraftRegistration, airline, flightNumber, origin, destination);
        this.cargoType = cargoType;
        this.loadKg = load;
        this.dangerousCargo = dangerousCargo;
    }

    public CargoPlane(  String aircraftRegistration, String model, String engineType, int numberOfEngines, int numberOfPilots, String airline, String flightNumber, String origin, String destination, String cargoType, int loadKg, boolean dangerousCargo) {
        super(  aircraftRegistration, model, engineType, numberOfEngines, numberOfPilots, airline, flightNumber, origin, destination);
        this.cargoType = cargoType;
        this.loadKg = loadKg;
        this.dangerousCargo = dangerousCargo;
    }

    public CargoPlane() {
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public void setLoadKg(int loadKg) {
        this.loadKg = loadKg;
    }

    public void setDangerousCargo(boolean dangerousCargo) {
        this.dangerousCargo = dangerousCargo;
    }

    @Override
    public String toString() {
        return super.toString() + "cargoType:" + cargoType + ", loadKg:" + loadKg + ", dangerousCargo:" + dangerousCargo;
    }
}
