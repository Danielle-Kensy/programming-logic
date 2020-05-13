public class Principal {
    
    public static void main(String args[]) {
        
        Aluno aluno= new Aluno();
        
        aluno.nome = "André";
        aluno.nota1 = 5;
        aluno.nota2 = 5;
        
        System.out.println("\f");
        System.out.println("-------------Avaliação Final-------------"); 
        System.out.println("Bem vindo! : "+aluno.mostrarNome() +
        "\nSua 1ª nota foi: "+aluno.mostrarNota1() + 
        "\nSua 2ª nota foi: "+aluno.mostrarNota2() +
        "\nSua média final é: "+aluno.calcularMedia());
        System.out.println("-----------------------------------------");
    }
}