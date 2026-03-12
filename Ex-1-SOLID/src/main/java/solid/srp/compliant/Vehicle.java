package solid.srp.compliant;

public class Vehicle {
    private FuelTank fuelTank;

    public Vehicle(int maxFuel) {
        fuelTank = new FuelTank(maxFuel, maxFuel);
    }

    public void accelerate() {
        fuelTank.setRemainingFuel(fuelTank.getRemainingFuel() - 1);
    }
}