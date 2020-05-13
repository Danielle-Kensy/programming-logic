import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {
        
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Door door = new Door();
        
        System.out.println("Type the color of your first door: ");
        door.color = scanner.nextLine();
        
        Door door1 = new Door();
        
        System.out.println("Type the color of your second door: ");
        door1.color = scanner.nextLine();
        
        System.out.println("\n-----------------Door Status-----------------" 
                           + "\n"+door.open()
                           + "\nThe first door color is: "+door.color 
                           + "\nThe second door color is: "+door1.color 
                           + "\n---------------------------------------------" );
    }
}