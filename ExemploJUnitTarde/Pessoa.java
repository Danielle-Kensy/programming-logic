
/**
 * é uma classe para entender junit..
 *
 * @author Thiago Cury
 * @version 1.0
 */
public class Pessoa {
   
    private int idade;
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int calcularIdadeMeses() {
        return this.idade * 12;
    }
    
    public int calcularIdadeSemanas() {
        return this.idade * 48;
    }
    
    public double calcularIdadeLoka() {
        return this.idade * 1.0; 
    }
    
    public String calcularIdadeComNome(String nome) {
        return nome+this.idade; 
    }    
    
    public String toString() {
        return "\nem meses: " + this.calcularIdadeMeses()
             + "\nem semanas: " + this.calcularIdadeSemanas();
    }
    
}
