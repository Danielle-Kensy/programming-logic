public class FirePokemoon extends Pokemoon {
    
    public String fireAttack;
    
    public FirePokemoon() {
        super();
        this.fireAttack = "Blaze Kick";
    }
    
    public void modificarFireAttack() {
        this.fireAttack = fireAttack;
    }
    
    public String toString() {
        return "\n### Fire Type ###" 
             + "\nNome: " + this.name
             + "\nAttack: " + this.fireAttack
             + "\n#################";
    }
}