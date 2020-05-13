public class Calculadora implements Calculos {
    
    private double valor1;
    private double valor2;
    
    public double getValor1() {
        return this.valor1;
    }
    
    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }
    
        public double getValor2() {
        return this.valor2;
    }
    
    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    
    @Override
    public double somarValores(){
        return this.valor1 + this.valor2;
    }
    
    @Override
    public double subtrairValores(){
        return this.valor1 - this.valor2;
    }
    
    @Override
    public double multiplicarValores(){
        return valor1 * valor2;
    }
    
    @Override
    public double dividirValores(){
        return valor1 / valor2;
    }
    
    public String toString() {
        return "-------------Calculadora-------------"
               + "\nValor 1 é: "+this.valor1
               + "\nValor 2 é: "+this.valor2 
               + "\nA soma dos valores é: "+this.somarValores() 
               + "\nA subtração dos valores é: "+this.subtrairValores() 
               + "\nA multiplicação dos valores é: "+this.multiplicarValores() 
               + "\nA divisão dos valores é: "+this.dividirValores()
               + "\n-------------------------------------";
    }
}