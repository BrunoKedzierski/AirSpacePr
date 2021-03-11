public class Aircraft {

    private int x;
    private int y;

    private int wektorRuchu;

    private int pulap;

    private int velocity;
    private String aircraftRegistration;

    public Aircraft(int x, int y, int wektorRuchu, int pulap, int velocity, String aircraftRegistration) {
        this.x = x;
        this.y = y;
        this.wektorRuchu = wektorRuchu;
        this.pulap = pulap;
        this.velocity = velocity;
        this.aircraftRegistration = aircraftRegistration;
    }

    public Aircraft(  String aircraftRegistration) {

        this.aircraftRegistration = aircraftRegistration;
    }

    public Aircraft() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWektorRuchu() {
        return wektorRuchu;
    }

    public int getPulap() {
        return pulap;
    }

    public int getVelocity() {
        return velocity;
    }

    public String getAircraftRegistration() {
        return aircraftRegistration;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWektorRuchu(int wektorRuchu) {
        this.wektorRuchu = wektorRuchu;
    }

    public void setPulap(int pulap) {
        this.pulap = pulap;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void setAircraftRegistration(String aircraftRegistration) {
        this.aircraftRegistration = aircraftRegistration;
    }

    @Override
    public String toString() {
        return "x:" + x +  ", y:" + y + ", wektorRuchu:" + wektorRuchu + ", pulap:" + pulap + ", velocity:" + velocity + ", aircraftRegistration:" + aircraftRegistration + ", ";
    }
}
