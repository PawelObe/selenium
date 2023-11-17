package sprawdzian;

public class Tool {
    String type;
    public void useTool(){
        System.out.println("Używam narzędzia: " + type);
    }
    public Tool(String type) {
        this.type = type;
    }

}
