package collections;

import java.util.HashMap;

public class Translator {
    private HashMap<String, String> dicto;

    public Translator(HashMap<String, String> dicto) {
        this.dicto = new HashMap<>();
    }

    public void add(String hebWord, String engWord) {
        dicto.put(hebWord, engWord);
    }

    public void translate(String sentence) {

    }


}
