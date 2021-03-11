public class PrivatePlane extends Airplane{

    String ownerName;
    String OwnerSurname;


    public PrivatePlane(int x, int y, int wektorRuchu, int pulap, int velocity, String model, String engineType, int numberOfEngines, int numberOfPilots, String aircraftRegistration, String ownerName, String ownerSurname) {
        super(x, y, wektorRuchu, pulap, velocity, model, engineType, numberOfEngines, numberOfPilots, aircraftRegistration);
        this.ownerName = ownerName;
        OwnerSurname = ownerSurname;
    }

    public PrivatePlane(  String aircraftRegistration, String model, String engineType, int numberOfEngines, int numberOfPilots, String ownerName, String ownerSurname) {
        super(   aircraftRegistration, model, engineType, numberOfEngines, numberOfPilots);
        this.ownerName = ownerName;
        OwnerSurname = ownerSurname;
    }


    public PrivatePlane() {
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerSurname() {
        return OwnerSurname;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerSurname(String ownerSurname) {
        OwnerSurname = ownerSurname;
    }

    @Override
    public String toString() {
        return super.toString() + "ownerName:" + ownerName + ", OwnerSurname:" + OwnerSurname ;
    }
}
