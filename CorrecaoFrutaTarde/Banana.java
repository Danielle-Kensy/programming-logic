public class Banana extends Fruta { 

    public Banana() {
        this.setCasca(true);
    }
    
    public String comer() {
        if(this.getCasca()) {
            return "TIRA A CASCA ANTES. doce afú. huafehauf.. nhac nhac";
        } else {
            return "doce afú. huafehauf.. nhac nhac";
        }        
    }

    public String descascar() {
        return "Abrir lentamente a casca nos 4 lados... saboerando o momento. após?! nhac nhac...";
    }  
    
    public String toString() {
        return "\nCor: " + this.getCor() 
             + "\nComer: " + this.comer()
             + "\nDescascar: " + this.descascar();
    }
}