public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Animal animal = new Animal();
        animal.modificarNome("Rex");
        System.out.println(animal.toString());
        
        Gato gato = new Gato();
        gato.modificarNome("Garfield");
        System.out.println(gato.toString());
        
        Cachorro cachorro = new Cachorro();
        System.out.println(cachorro.toString());
        
    }
}
