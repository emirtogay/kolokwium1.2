public abstract class AerialVehicle {
    int registrationNumber;
    String color;
    String model;
    int yearOfProduction;

    public AerialVehicle(int registrationNumber, String color, String model, int yearOfProduction){
        this.color = color;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.yearOfProduction = yearOfProduction;

    }

    public void displayInfo(){
        System.out.println("My ID: " + registrationNumber);
    }

    public int getRegistrationNumber(){
        return registrationNumber;
    }

}
