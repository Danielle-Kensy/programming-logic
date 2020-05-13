public class Aluno {
    
    public String nome;
    public double nota1;
    public double nota2;
    
    public String mostrarNome() {
        return nome;
    }
    
    public double mostrarNota1() {
        return nota1;
    }
    
    public double mostrarNota2() {
        return nota2;
    }
    
    public double calcularMedia() {
        return (nota1 + nota2)/2;
    }
}