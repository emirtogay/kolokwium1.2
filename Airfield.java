import java.util.ArrayList;

public class Airfield {

    private static int capacity = 30;
    public String name;
    String adress;

    private ArrayList<AerialVehicle> vehicles = new ArrayList<AerialVehicle>();

    public Airfield(String name, int capacity, String adress){
        this.adress = adress;
        this.name = name;
    }

    public void addAerialVehicle(AerialVehicle vehicle){
        if (this.vehicles.size() >= capacity) throw new IllegalStateException("Too many vehicles");
        for (AerialVehicle i :this.vehicles){
            if (i.getRegistrationNumber() == vehicle.getRegistrationNumber()) throw new IllegalStateException("Already exists.");
        }
    this.vehicles.add(vehicle);
}


    public void removeAerialVehicle(AerialVehicle vehicle){
        if (!vehicles.contains(vehicle)) throw new IllegalStateException("doesnt Exist");

        vehicles.remove(vehicle);
    }
    }


