public class LampadaLED implements LampadaInterface {

    private String marca;
    private String status;
    
    public LampadaLED(String marca) {
        this.status = "desligado";
        this.setMarca(marca);
    }
    
    public void on() {
        this.status = "ligada";
    }
    
    public void off() {
        this.status = "desligada";
    }
    
    
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getState() {
        return this.status;
    }
    
    public void setState(String status) {
        this.status= status;
    }
    
    public String toString() {
        return "\nMarca: " + this.marca
             + "\nStatus: " + this.status;
    }

}