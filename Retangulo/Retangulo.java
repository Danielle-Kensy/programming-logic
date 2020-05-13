public class Retangulo {
    
    public double altura;
    public double largura;
    
    public double mostrarLargura() {
        return this.largura;
    }
    
    public double mostrarAltura() {
        return this.altura;
    }
    
    public double calcularArea() {
        return this.altura * this.largura;
    }
    
    public double calcularPerimetro() {
        return this.altura + this.altura + this.largura + this.largura;
    }
    
    public String toString() {
        return "\nA altura é: "+mostrarAltura() +
               "\nA largura é: "+mostrarLargura() +
               "\nA área é: "+calcularArea() +
               "\nO perimetro é: "+calcularPerimetro();
    }
} 