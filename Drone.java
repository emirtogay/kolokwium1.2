public class Drone extends AerialVehicle {
    int batterylife;
    String cameraEquipped;

    public Drone(int registrationNumber, String color, String model, int yearOfProduction, int batteryLife, String cameraEquipped){
        super(registrationNumber, color, model, yearOfProduction);
        this.batterylife = batterylife;
        this.cameraEquipped = cameraEquipped;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Type: Drone " + "Id: " + registrationNumber);

    }
}
