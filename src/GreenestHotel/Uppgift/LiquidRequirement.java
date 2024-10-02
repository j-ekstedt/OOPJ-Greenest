package GreenestHotel.Uppgift;

//Interfacet används för att växterna ska kunna beräkna sina vätskebehov
public interface LiquidRequirement {
    double liquidAmount();
    String getName();
}
