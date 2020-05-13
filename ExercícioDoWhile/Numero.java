
public class Numero {
    
        private int numero;
    
    public int verNumeros() {
        
        for(int contador = 0 ; contador < 5 ; contador++) {
            //% resto do módulo da divisão 10%2=0  11%2=1
            if(contador % 2 == 0) {
                return contador;
            }
        }
        return 0;
    }  
    
    public String toString() {
        return " "+this.numero;
    }
}
