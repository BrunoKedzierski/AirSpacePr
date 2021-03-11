public class Airplane extends Aircraft{

    private String model;
    private String engineType;
    private int NumberOfEngines;
    private int NumberOfPilots;


    public Airplane(int x, int y, int wektorRuchu, int pulap, int velocity, String model, String engineType, int numberOfEngines, int numberOfPilots, String aircraftRegistration) {
        super(x, y, wektorRuchu, pulap, velocity, aircraftRegistration);
        this.model = model;
        this.engineType = engineType;
        NumberOfEngines = numberOfEngines;
        NumberOfPilots = numberOfPilots;

    }

    public Airplane(  String aircraftRegistration, String model, String engineType, int numberOfEngines, int numberOfPilots) {
        super( aircraftRegistration);
        this.model = model;
        this.engineType = engineType;
        NumberOfEngines = numberOfEngines;
        NumberOfPilots = numberOfPilots;
    }



    public Airplane() {
    }

    public String getModel() {
        return model;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getNumberOfEngines() {
        return NumberOfEngines;
    }

    public int getNumberOfPilots() {
        return NumberOfPilots;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        NumberOfEngines = numberOfEngines;
    }

    public void setNumberOfPilots(int numberOfPilots) {
        NumberOfPilots = numberOfPilots;
    }

    @Override
    public String toString() {
        return super.toString()+ "model:" + model + ", engineType:" + engineType + ", NumberOfEngines:" + NumberOfEngines + ", NumberOfPilots:" + NumberOfPilots + ", ";
    }
}
