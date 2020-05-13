public class Morango extends Fruta { 

    public Morango() {
        this.setCasca(false);
    }

    
    public String comer() {
        if(this.getCasca()) {
            return "TIRA A CASCA ANTES. levemente doce com um toque sútil de acidez. huafehauf.. nhac nhac";
        } else {
            return "levemente doce com um toque sútil de acidez. huafehauf.. nhac nhac";
        }
    }
    
    public String descascar() {
        return "Tirar a folha e dale com tdo na boca!";
    }  
    
    public String toString() {
        return "\nCor: " + this.getCor() 
             + "\nComer: " + this.comer()
             + "\nDescascar: " + this.descascar();
    }
}