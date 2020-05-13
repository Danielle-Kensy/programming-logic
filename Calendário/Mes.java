
/**
 * Classe para definir os meses.
 * 
 * @author Danizinha 
 * @version 02/04/2020 16:27
 */
public class Mes implements IMes{
    
    private int numeroMes;

    /**
     * COnstrutor para objetos da classe Mes
     */
    public Mes() {

    }
    
    public void setNumeroMes(int numeroMes) {
        this.numeroMes = numeroMes;
    }    
    
    public int getNumeroMes() {
        return this.numeroMes;
    }
    
    /**
     * @return Retorna o nome do mês segundo o número
     */
    @Override
    public String verificarMes() {
        if(this.numeroMes == 1) {
            return "Janeiro";
        } else if(this.numeroMes == 2) {
            return "Fevereiro";
        } else if(this.numeroMes == 3) {
            return "Março";
        }else if(this.numeroMes == 4) {
            return "Abril";
        } else if(this.numeroMes == 5) {
            return "Maio";
        }else if(this.numeroMes == 6) {
            return "Junho";
        } else if(this.numeroMes == 7) {
            return "Julho";
        }else if(this.numeroMes == 8) {
            return "Agosto";
        } else if(this.numeroMes == 9) {
            return "Setembro";
        }else if(this.numeroMes == 10) {
            return "Outubro";
        } else if(this.numeroMes == 11) {
            return "Novembro";
        }else if(this.numeroMes == 12) {
            return "Dezembro";
        } 
        return "Mês inválido...";
    } 
    
    public String toString() {
        return "\nO mês "+this.numeroMes + " é: "+this.verificarMes();
    
    }
}
