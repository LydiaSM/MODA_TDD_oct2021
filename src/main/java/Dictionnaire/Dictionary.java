package Dictionnaire;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {

    private String name;
    private Map<String, String> translation;
    private HashMap<String, List<String>> translationMultiple;

    public Dictionary(String name) {
        this.name = "Example";
        this.translation = new HashMap<>();
        this.translationMultiple = new HashMap<>();
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

    public List getMultipleTranslation(String contre) {  return translationMultiple.get(contre); }

    public void addMultipleTranslation(String contre , List<String> against) { translationMultiple.put(contre, against); }

}
