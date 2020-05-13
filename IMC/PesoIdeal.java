/**
 * Classe que recebe os dados e verifica o peso da pessoa.
 * 
 * @author Danizinha 
 * @version 03/04/2020 16:30
 */
public class PesoIdeal implements IPeso{
    
    private String nome;
    private int idade;
    private String sexo;
    private double peso;
    private double altura;

    /**
     * COnstrutor para objetos da classe PesoIdeal
     */
    public PesoIdeal() {

    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }    
    
    public String getNome() {
        return this.nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }    
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }    
    
    public String getSexo() {
        return this.sexo;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }    
    
    public double getPeso() {
        return this.peso;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }    
    
    public double getAltura() {
        return this.altura;
    }
    
    /**
     * @return Retorna o valor do cálculo do IMC.
    */
    @Override
    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }
 
    /**
     * @return Retorna o peso ideal segundo o valor do IMC.
    */
    @Override
    public String verificarPesoIdeal() {
        if(this.calcularIMC() <= 18.5) {
            return "Abaixo do peso";
        } else if(this.calcularIMC() >= 18.6 && this.calcularIMC() <=24.9) {
            return "Peso ideal";
        } else if(this.calcularIMC() >= 25.0 && this.calcularIMC() <=29.9) {
            return "Sobrepeso";
        }else if(this.calcularIMC() >= 30.0 && this.calcularIMC() <=34.9) {
            return "Obesidade grau 1";
        } else if(this.calcularIMC() >= 35.0 && this.calcularIMC() <=39.9) {
            return "Obesidade grau 2 (severa)";
        } 
        return "Obesidade grau 3 (mórbida)";
    } 
 
    public String toString() {
        return "\nSeu nome: "+this.nome
             + "\nSua idade: "+this.idade
             + "\nSeu sexo: "+this.sexo
             + "\nSeu peso: "+this.peso
             + "\nSua altura: "+this.altura
             +"\nSeu IMC é: "+(Math.round(this.calcularIMC()))
             + "\nVocê está no(a): "+this.verificarPesoIdeal();
    }
}
