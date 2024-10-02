package GreenestHotel.Uppgift;

//Arv - Ärver från superklassen "Plant" ger subklassen nödvändiga metoder
//Implementerar från interfacet "LiquidRequirment" för att beräkna vätskebehovet
public class CarnivorousPlant extends Plant implements LiquidRequirement {

    private double height;

    public CarnivorousPlant(String name, TypeOfPlant plantType,double height) {
        super(name, plantType);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Köttätande växten " + super.getName() + " behäver få " + getPlantType().getLiquidEachDay() + " liter " + getPlantType().getLiquidType() + " varje dag.";
    }

    @Override
    public double liquidAmount() {
        return 0.1 +(getPlantType().getLiquidEachDay() * getHeight());
    }
}
