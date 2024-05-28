public class Glider extends AerialVehicle {
    double wingLength;

    public Glider(int registrationNumber, String color, String model, int yearOfProduction, double wingLength) {
        super(registrationNumber, color, model, yearOfProduction);
        this.wingLength = wingLength;
    }


    public void displayInfo(){
        super.displayInfo();
        System.out.println("Type: " + "Glider");
    }
}
