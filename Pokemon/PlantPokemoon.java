public class PlantPokemoon extends Pokemoon {
    
    public String plantAttack;
    
    public PlantPokemoon() {
        super();
        this.plantAttack = "Bullet Seed";
    }
    
    public void modificarPlantAttack() {
        this.plantAttack = plantAttack;
    }
    
    public String toString() {
        return "\n### Plant Type ###" 
             + "\nNome: " + this.name
             + "\nAttack: " + this.plantAttack
             + "\n##################";
    }
}