package solid.srp.compliant;

public class FuelTank {
    private int maxFuel;
    private int remainingFuel;
    
    public FuelTank(int maxFuel, int remainingFuel){
        this.maxFuel = maxFuel;
        this.remainingFuel = remainingFuel;
    }

    public void reFuel(){
        remainingFuel = maxFuel;
    }

    public void reFuel(int newFuel){
        if(remainingFuel + newFuel > this.maxFuel)
            remainingFuel = maxFuel;
        else remainingFuel = remainingFuel + newFuel;      
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }
}
