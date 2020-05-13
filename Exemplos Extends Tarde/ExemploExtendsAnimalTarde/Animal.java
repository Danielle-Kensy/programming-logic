public class Animal {

    public String nome;
    
    public Animal() {
        this.nome =  "Ted - nome padrão";
    }
    
    public void modificarNome(String nome) {
        this.nome = nome;
    }
    
    public String comunicar() {
        return "...";
    }
    
    public String toString() {
        return "\n### classe Animal ###" 
             + "\nNome: " + nome;
    }
    
}