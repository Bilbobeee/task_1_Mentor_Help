import java.util.Map;
import java.util.TreeMap;

public class English extends Language {

    private TreeMap<String,Integer> english = new TreeMap<>();

    {
        english.put("a",1);
        english.put("b",2);
        english.put("c",3);
        english.put("d",4);
        english.put("e",5);
        english.put("f",6);
        english.put("g",7);
        english.put("h",8);
        english.put("i",9);
        english.put("j",10);
        english.put("k",11);
        english.put("l",12);
        english.put("m",13);
        english.put("n",14);
        english.put("o",15);
        english.put("p",16);
        english.put("q",17);
        english.put("r",18);
        english.put("s",19);
        english.put("t",20);
        english.put("u",21);
        english.put("v",22);
        english.put("w",23);
        english.put("x",24);
        english.put("y",25);
        english.put("z",26);

    }


@Override
    public Integer alphabet(String letter){
        return english.getOrDefault(letter,0);
    }

}
