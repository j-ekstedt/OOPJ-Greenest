package GreenestHotel.Uppgift;

//Enum - används för att kapsla in växttyperna och dersas specefika vätskebehov
public enum TypeOfPlant {

    //Inkapsling
    CACTUS("mineralvatten", 0.02),
    CARNIVOROUS_PLANT("proteindryck", 0.2),
    PALM("kranvatten", 0.5);

    private final String LIQUID_TYPE;
    private final double LIQUID_EACH_DAY;

    //Konstruktor
    TypeOfPlant(String liquidType, double liquidEachDay) {
        this.LIQUID_TYPE = liquidType;
        this.LIQUID_EACH_DAY = liquidEachDay;
    }

    //Getters
    public String getLiquidType() {
        return LIQUID_TYPE;
    }
    public double getLiquidEachDay() {
        return LIQUID_EACH_DAY;
    }
}
