public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");        
        
        //Instanciação do objeto
        Aluno aluno = new Aluno();
        
        //Entrada de dados
        
        aluno.nome = "thiago curry";
        aluno.nota1 = 9.5;
        aluno.nota2 = 8.5;
        
        //Saída de dados
        System.out.println(aluno.toString());
        
    }
}