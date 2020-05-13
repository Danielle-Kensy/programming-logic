public class Gato extends Animal {
    
    public Gato() {
    }
        
    @Override
    public String comunicar() {
        return "miauuu!";
    }
    
    public String toString() {
    
        return "\nNome: " + this.getNome()
             + "\nIdade: " + this.getIdade()
             + "\nIdade calculada: " + this.calcularIdade();
    }
    
}