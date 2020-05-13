public class ContaCorrente implements Conta {
    
    private double saldo;
    private final double TAXA;
    
    public ContaCorrente() {
        this.TAXA = 0.45;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor - this.TAXA;
        //this.saldo += valor - this.TAXA;        
    }
    
    @Override
    public void sacar(double valor) {
        this.saldo = this.saldo - valor - this.TAXA;
        //this.saldo -= valor - this.TAXA;        
    }
    
    @Override
    public double getSaldo() {
        return this.saldo;
    }
    
    public String toString() {
        return "\nSaldo da conta: " + this.saldo;
    }
    
}