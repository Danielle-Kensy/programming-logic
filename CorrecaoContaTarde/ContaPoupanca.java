public class ContaPoupanca implements Conta {
    
    private double saldo;
    
    public ContaPoupanca() {
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        //this.saldo += valor;
    }
    
    @Override
    public void sacar(double valor) {
        this.saldo = this.saldo - valor;
        //this.saldo -= valor;
    }
    
    @Override
    public double getSaldo() {
        return this.saldo;
    }
    
    public String toString() {//linguagem -> C
        return "\nSaldo da conta: " + this.saldo;
    }
    
}