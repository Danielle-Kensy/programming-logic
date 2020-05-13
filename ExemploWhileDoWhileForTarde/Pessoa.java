
/**
 * Write a description of class Pessoa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pessoa {
    
    private String nome;
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }    
    
    public String verNomeCincoVezes1() {
        
        String nomeRetorno = "";
        
        int contador = 0; //0,1,2,3,4
        while(contador < 5) {
            nomeRetorno = nomeRetorno + " " + this.nome;
            contador = contador + 1;
        }
        return nomeRetorno;
    }
    
    public String verNomeCincoVezes2() {
        
        String nomeRetorno = "";
        
        int contador = 0; //0,1,2,3,4
        do {
            nomeRetorno = nomeRetorno + " " + this.nome;
            contador = contador + 1;
        } while(contador < 5);
        return nomeRetorno;
    }
    
    public String verNomeCincoVezes3() {
        
        String nomeRetorno = "";
        
        for(int contador = 0 ; contador < 5 ; contador++) {
            nomeRetorno = nomeRetorno + " " + this.nome;
        }
        return nomeRetorno;
    }
    
    public String verNomeConformeQuantidade1(int quantidade) {
        
        String nomeRetorno = "";
        
        int contador = 0;
        while(contador < quantidade) {
            nomeRetorno = nomeRetorno + " " + this.nome; //acumulador
            contador = contador + 1; //contador/incrementador
        }
        return nomeRetorno;
    }    
    
    public String verNomeConformeQuantidade(int quantidade) {
        
        StringBuilder nomes = new StringBuilder();
        
        int contador = 0;
        while(contador < quantidade) {
            nomes.append(" " + this.nome);
            contador = contador + 1;
        }
        //return String.valueOf(nomes);
        return nomes.toString();
    }     
    
    public String toString() {
        return this.nome;
    }    
}
