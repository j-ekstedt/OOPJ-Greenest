package GreenestHotel.Uppgift;

//Arv - Ärver från superklassen "Plant" ger subklassen nödvändiga metoder
//Implementerar från interfacet "LiquidRequirment" för att beräkna vätskebehovet
public class Cactus extends Plant implements LiquidRequirement {

    private double height;

    public Cactus(String name, TypeOfPlant plantType, double height) {
        super(name,plantType);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Kaktusen " + super.getName() + " behöver få " + getPlantType().getLiquidEachDay() + " liter " + getPlantType().getLiquidType() + " varje dag.";
    }

    @Override
    public double liquidAmount() {
        return getPlantType().getLiquidEachDay();
    }
}
