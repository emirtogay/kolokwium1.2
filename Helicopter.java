public class Helicopter extends AerialVehicle {
    int rotorCount;
    int maxAltitude;


    public Helicopter(int registrationNumber, String color, String model, int yearOfProduction, int rotorCount, int maxAltitude) {
        super(registrationNumber, color, model, yearOfProduction);
        this.rotorCount = rotorCount;
        this.maxAltitude = maxAltitude;

    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type " + "Helicopter");
    }
}
