public class Helicopter extends Aircraft{
    private String model;
    private String powerPlantType;
    private int numOfRotors;
    private int numberOfCrew;


    public Helicopter(int x, int y, int wektorRuchu, int pulap, int velocity, String model, String powerPlantType, int numOfRotors, int numberOfCrew, String aircraftRegistration) {
        super(x, y, wektorRuchu, pulap, velocity,aircraftRegistration);
        this.model = model;
        this.powerPlantType = powerPlantType;
        this.numOfRotors = numOfRotors;
        this.numberOfCrew = numberOfCrew;
    }

    public Helicopter( String aircraftRegistration, String model,String powerPlantType, int numOfRotors, int numberOfCrew) {
        super(  aircraftRegistration);
        this.model = model;
        this.powerPlantType = powerPlantType;
        this.numOfRotors = numOfRotors;
        this.numberOfCrew = numberOfCrew;
    }

    public Helicopter() {
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setPowerPlantType(String powerPlantType) {
        this.powerPlantType = powerPlantType;
    }

    public void setNumOfRotors(int numOfRotors) {
        this.numOfRotors = numOfRotors;
    }

    public void setNumberOfCrew(int numberOfCrew) {
        this.numberOfCrew = numberOfCrew;
    }

    public String getModel() {
        return model;
    }

    public String getPowerPlantType() {
        return powerPlantType;
    }

    public int getNumOfRotors() {
        return numOfRotors;
    }

    public int getNumberOfCrew() {
        return numberOfCrew;
    }


    @Override
    public String toString() {
        return  super.toString() + "model:" + model + ", powerPlantType:" + powerPlantType + ", numOfRotors:" + numOfRotors + ", numberOfCrew:" + numberOfCrew ;
    }
}
