import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String text = "Asked about the concerns raised by Sir Jeremy, the home secretary told the BBC that \"nothing would be more damaging for our country and for our economy\" than a second spike in virus cases, adding that the government's plans to ease measures were \"pragmatic and responsible\".";

        String[] words = text.split(" ");
        System.out.println(words.length);
        //System.out.println(words[4]);

        //vyveli kazhdoje 2e slovo
        for (int i = 0; i < words.length; i = i + 2) {
            System.out.println(words[i]);
        }
        for (String word : words) {
            System.out.println(word);
        }


        List<String> names = new ArrayList<>();
        names.add("Valerij");
        names.add("Kostik the best");
        names.add("Maxik");
        names.add("uPsa - i eto aspirin");

        System.out.println(names.get(1));

        for (String name : names) {
            System.out.println(name);
        }

        HashMap<String, Integer> bookUniqueWords = new HashMap<>();
        bookUniqueWords.put("the", 1);
        bookUniqueWords.put("student", 1);
        bookUniqueWords.put("is", 1);
        bookUniqueWords.put("the", 2);

        for (Map.Entry<String, Integer> entry : bookUniqueWords.entrySet()) {
            System.out.println(entry.getKey());
        }

    }

}
