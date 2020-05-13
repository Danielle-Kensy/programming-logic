public class Calculadora {

    public double valor1;
    public double valor2;
    
    public double mostrarValor1() {
        return this.valor1;
    }
    
    public double mostrarValor2() {
        return this.valor2;
    }
    
    public double somarValores() {
        return this.valor1 + this.valor2;
    }
    
    public double subtrairValores() {
        return this.valor1 - this.valor2;
    }
    
    public double dividirValores() {
        return this.valor1 / this.valor2;
    }
    
    public double multiplicarValores() {
        return this.valor1 * this.valor2;
    }
    
    public String toString() {
        return "\nValor 1: " + this.valor1
            + "\nValor 2: " + this.valor2
            + "\nsoma: " + this.somarValores()
            + "\ndivisão: " + this.dividirValores()
            + "\nmultiplicação: " + this.multiplicarValores()
            + "\nsubtração:  " + this.subtrairValores();
    }
    
}