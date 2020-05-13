public class Door {
    
    public boolean status;
    public String color;
    
    public Door() {
        this.color = "Brown";
        this.status = true;
    }
    
    public void changeColor(String color) {
        this.color = color;
    }
    
    public String open() {
        this.status = true;
        return "The door is open, close this shit man.";
    }
    
        public String close() {
        this.status = false;
        return "The door is close";
    }
}