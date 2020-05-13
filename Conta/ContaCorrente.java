public class ContaCorrente implements IConta {
   
   private double saldo;
   private double taxa=0.45;
   
   public ContaCorrente() {
       
   }
   
   public void setSaldo(double saldo) {
        this.saldo = saldo;
   }
    
   public double getSaldo() {
        return this.saldo;
   }
   
   public void depositar (double valor) {
       this.saldo = (saldo + valor) - this.taxa;
   }
    
   public void sacar (double valor) {
       this.saldo = (saldo - valor) - this.taxa;
   }
   
   public String toString() {
       return "\nSeu saldo atual é: R$"+this.saldo;
   }
}