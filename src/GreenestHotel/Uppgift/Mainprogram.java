package GreenestHotel.Uppgift;

import javax.swing.*;
import java.util.ArrayList;

public class Mainprogram {
    public Mainprogram() {
        //ArrayList av typen Plant
        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(new Cactus("Igge", TypeOfPlant.CACTUS, 0.2));
        plants.add(new CarnivorousPlant("Meatloaf", TypeOfPlant.CARNIVOROUS_PLANT, 0.7));
        plants.add(new Palm("Laura",TypeOfPlant.PALM, 5 ));
        plants.add(new Palm("Olof",TypeOfPlant.PALM, 1 ));

        boolean continueProgram = true;

        while (continueProgram) {
            String PlantName = JOptionPane.showInputDialog("Vilken gäst ska få behandling?");
            boolean found = false;


            // Polymorfism - Behandlar alla olika växttyper som Plant-objekt och anropar deras metoder
            for (Plant plant : plants) {
                if (plant.getName().equalsIgnoreCase(PlantName)) {
                    JOptionPane.showMessageDialog(null, plant.toString());
                    found = true;
                    break;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(null, "Gästen finns inte på hotellet");
            }

            int userChoice = JOptionPane.showConfirmDialog(null, "Vill du fortsätta?", "Fortsätt", JOptionPane.YES_NO_OPTION);
            if(userChoice == JOptionPane.NO_OPTION) {
                continueProgram = false;
            }
        }
    }
    public static void main(String[] args) {
        Mainprogram mp = new Mainprogram();
    }
}
