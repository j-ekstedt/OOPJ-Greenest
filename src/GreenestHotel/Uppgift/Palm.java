package GreenestHotel.Uppgift;

//Arv - Ärver från superklassen "Plant" ger subklassen nödvändiga metoder
//Implementerar från interfacet "LiquidRequirment" för att beräkna vätskebehovet
public class Palm extends Plant implements LiquidRequirement {

    //Inkaplsing av variabel som är privat
    //Publika getters används för kontrollerad åtkomst av datan
    private double height;

    //Konstruktor
    public Palm(String name, TypeOfPlant plantType, double height) {
        super(name, plantType);
        this.height = height;
    }

    //Getter
    public double getHeight() {
        return height;
    }



    @Override
    public String toString() {
        return "Palmen " + super.getName() + " behöver få " + liquidAmount() + " liter "+ getPlantType().getLiquidType() + " varje dag.";
    }

    @Override
    public double liquidAmount() {
        return getPlantType().getLiquidEachDay() * getHeight();
    }
}
