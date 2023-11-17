package sprawdzian;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Worker {
    static List<String> narzedzia = new ArrayList<>() ;
    public static void main(String[] args) {
        Tool tool = new Tool("młotek");
        List<Tool> narzedzia = new ArrayList<>();
        narzedzia.add(new Tool("młotek"));
        narzedzia.add(new Tool("łopata"));
        narzedzia.add(new Tool("śrubokręt"));
        narzedzia.add(new Tool("wiertarka"));
        narzedzia.add(new Tool("piła"));
        narzedzia.add(new Tool("klucz francuski"));
        for(Tool t: narzedzia){
            t.useTool();
        }
    }
}
