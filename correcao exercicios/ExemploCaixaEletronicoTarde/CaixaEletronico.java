public class CaixaEletronico {
    
    public double saldo;
                               
    public boolean sacar(double quantia) {
        saldo = saldo - quantia;
        return true;
    }
    
    public boolean depositar(double quantia) {
        saldo = saldo + quantia;
        return true;
    }
    
    /*public String verificarSaldo() {
        return "Seu saldo é: " + saldo;
    }*/
    
    public double verificarSaldo() {
        return saldo;
    }
    
    public String toString() {
        return "Seu saldo é: " + saldo;
    }

}