package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Translator {
    private HashMap<String, String> dicto;

    public Translator() {
        this.dicto = new HashMap<>();
    }

    public void add(String hebWord, String engWord) {
        dicto.put(hebWord, engWord);
    }

    public String translate(String sentence) {
        String[] temp;
        temp = sentence.split(" ");
        String tempTrans = "";

        for (int i = 0; i < temp.length; i++) {
            if (dicto.get(temp[i]) != null) {
                tempTrans = tempTrans + (" " + dicto.get(temp[i]));
            } else {
                tempTrans = tempTrans + (" " + temp[i]);
            }
        }

        return tempTrans;
    }

    public ArrayList<String> getEngWords() {
        Set<String> set = dicto.keySet();
        Collection<String> col = dicto.keySet();
        ArrayList<String> arr = new ArrayList<>();
        arr.addAll(col);
        return arr;
    }

}
