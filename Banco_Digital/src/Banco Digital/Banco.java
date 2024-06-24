import java.util.*;

public class Banco {
    private String name;
    private List<Conta> conts;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<Conta> getConts(){
        return conts;
    }

    public void setConts(List<Conta> conts){
        this.conts = conts;
    }
}