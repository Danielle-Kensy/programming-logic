public class ContaPoupanca implements IConta {
   
   private double saldo;
   private double valor;
   
   public ContaPoupanca() {
       
   }
   
   public void setSaldo(double saldo) {
        this.saldo = saldo;
   }
    
   public double getSaldo() {
        return this.saldo;
   }
   
   public void depositar (double valor) {
       this.saldo = saldo + valor;
   }
    
   public void sacar (double valor) {
       this.saldo = saldo - valor;
   }
   
   public String toString() {
       return "\nSeu saldo atual é: R$"+this.saldo;
   }
}