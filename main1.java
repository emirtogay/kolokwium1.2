public class Main {

    public static void main(String[] args) {
        Airfield airfield = new Airfield("chopin", 30, "Warszawa");
        Drone drone = new Drone(12344, "White", "Model Y", 2022, 60, "yes");
        Glider glider = new Glider(5678, "Blue", "Model Z", 2018, 20);
        Helicopter helicopter = new Helicopter(2341, "blue", "model a", 2002,  40, 20000);


        airfield.addAerialVehicle(drone);
        airfield.addAerialVehicle(glider);

        airfield.removeAerialVehicle(drone);

        drone.displayInfo();
        glider.displayInfo();
        helicopter.displayInfo();


    }
}