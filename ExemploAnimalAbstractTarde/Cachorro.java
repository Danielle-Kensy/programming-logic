public class Cachorro extends Animal {

    public Cachorro() {
    }
    
    @Override
    public int calcularIdade() {
        return this.getIdade() * 7;
    }
    
    @Override
    public String comunicar() {
        return "Au auu!";
    }
    
    public String toString() {
    
        return "\nNome: " + this.getNome()
             + "\nIdade: " + this.getIdade()
             + "\nIdade calculada: " + this.calcularIdade();
    }
}