package GreenestHotel.Uppgift;


public abstract class Plant {

    //Inkaplsing av variabler som är privata
    //Getters används för hämta datan
    private String name;
    private TypeOfPlant plantType;

    //Konstruktor
    public Plant(String name, TypeOfPlant plantType) {
        this.name = name;
        this.plantType = plantType;
    }

        //Getters
        public String getName () {
            return name;
        }

        public TypeOfPlant getPlantType () {
            return plantType;
        }

    }
