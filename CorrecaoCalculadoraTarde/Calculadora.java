public class Calculadora implements ICalculadora {

    private double numero1;
    private double numero2;
    
    public Calculadora() {
    }
    
    public double getNumero1() {
        return this.numero1;
    }
    
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    
    public double getNumero2() {
        return this.numero2;
    }
    
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }    
    
    //interface
    
    public double somar() {
        return this.numero1 + this.numero2;
    }
    
    public double subtrair() {
        return this.numero1 - this.numero2;        
    }
    
    public double dividir() {
        return this.numero1 / this.numero2;        
    }
    
    public double multiplicar() {
        return this.numero1 * this.numero2;        
    }
                 
    public String mostrarMenu() {
        return "\n1 - somar"
             + "\n2 - subtrair"
             + "\n3 - multiplicar"
             + "\n4 - dividir"
             + "\n5 - ver todos"
             + "\n6 - sair";
    }
    
    public String verificarOpcao(int opcao) {
        switch(opcao) {
            case 1: return "Soma: " + this.somar();

            case 2: return "Subtração: " + this.subtrair();
            
            case 3: return "Multiplicação: " + this.multiplicar();
            
            case 4: return "Divisão: " + this.dividir();          
            
            case 5: return toString();
            
            case 6: System.exit(0);
            return "";
            
            default:
            return "";
        }
    }
    
    public String toString() {
        return "\nNúmero 1: " + this.numero1
             + "\nNúmero 2: " + this.numero2
             + "\nSoma: " + this.somar()
             + "\nSubtração: " + this.subtrair()
             + "\nDivisão: " + this.dividir()
             + "\nMultiplicação: " + this.multiplicar();
    }

}