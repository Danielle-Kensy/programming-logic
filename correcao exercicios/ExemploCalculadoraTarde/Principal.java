public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Calculadora calculadora = new Calculadora();
        
        calculadora.valor1 = 10;
        calculadora.valor2 = 5;
        
        System.out.println(calculadora.toString());

    }
}