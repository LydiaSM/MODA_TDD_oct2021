package Dictionnaire;


import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private String name;
    private Map<String, String> translation;

    public Dictionary(String name) {
        this.name = "Example";
        this.translation = new HashMap<>();
    }

    public String getName()
    {
        return this.name;
    }

    public boolean isEmpty()
    {
        return true;
    }

    public String getTranslation(String contre) { return this.translation.get(contre); }

    public void addTranslation(String contre ,String against){ translation.put(contre, against); }

}
