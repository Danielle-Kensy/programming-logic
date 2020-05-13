import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {
        
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        PlantPokemoon plant = new PlantPokemoon();
        
        System.out.println("Type the name of your Plant Pókemoon: ");
        plant.name = scanner.nextLine();
        
        FirePokemoon fire = new FirePokemoon();
        
        System.out.println("\nType the name of your Fire Pókemoon: ");
        fire.name = scanner.nextLine();
        
        WaterPokemoon water = new WaterPokemoon();
        
        System.out.println("\nType the name of your Water Pókemoon: ");
        water.name = scanner.nextLine();
        
        System.out.println(plant.toString());
        System.out.println(fire.toString());
        System.out.println(water.toString());
        
    }
}