/**
 * Escreva a descrição da classe Numeros aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Numeros {
    
    private double valor1;
    private double valor2;
    private double valor3;
    

    /**
     * COnstrutor para objetos da classe Numeros
     */
    public Numeros() { 
    }
     
    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }    
    
    public double getValor1() {
        return this.valor1;
    }
    
    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }    
    
    public double getValor2() {
        return this.valor2;
    }
    
    public void setValor3(double valor3) {
        this.valor3 = valor3;
    }    
    
    public double getValor3() {
        return this.valor3;
    } 
    
    public String verCrescente() {

        if(valor1 < valor2 && valor2 < valor3) { 
            return "Ordem: " + valor1 + " " + valor2 + " " + valor3; 
        } else if(valor1 < valor3 && valor3 < valor2) {
            return "Ordem: " + valor1 + " " + valor3 + " " + valor2; 
        } else if (valor2 < valor1 && valor1 < valor3) {
            return "";
        }
        return "";
    }
}
