public class CaixaEletronico {
    
    public String contaNome;
    public double saldo;
    
    public void depositarSaldo(double depositado) {
        saldo = saldo + depositado;
    }
    
        public void sacarSaldo(double sacado) {
        saldo = saldo - sacado;
    }
}