public class Aluno {
    
    public String nome;
    public double nota1;
    public double nota2;
    
    public String mostrarNome() {
        return this.nome;
    }
    
    public double mostrarNota1() {
        return this.nota1;
    }
    
    public double mostrarNota2() {
        return this.nota2;
    }
    
    public double calcularMediaAritmetica() {
        return (this.nota1 + this.nota2) / 2;
    }
    
    public String toString() {
        return "\nNome: " + this.mostrarNome()
             + "\nNota 1 : " + this.mostrarNota1()
             + "\nNota 2 : " + this.mostrarNota2()
             + "\nMédia : " + this.calcularMediaAritmetica();
    }
    
}