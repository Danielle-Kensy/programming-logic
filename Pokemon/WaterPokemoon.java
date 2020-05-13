public class WaterPokemoon extends Pokemoon {
    
    public String waterAttack;
    
    public WaterPokemoon() {
        super();
        this.waterAttack = "Hydro Pump";
    }
    
    public void modificarplantAttack() {
        this.waterAttack = waterAttack;
    }
    
    public String toString() {
        return "\n### Water Type ###" 
             + "\nNome: " + this.name
             + "\nAttack: " + this.waterAttack
             + "\n##################";
    }
}