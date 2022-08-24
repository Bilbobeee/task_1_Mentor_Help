import java.util.TreeMap;

public class Ukrainian extends LanguageBook {

    private TreeMap<String,Integer> ukrainian = new TreeMap<>();

    public TreeMap<String, Integer> getUkrainian() {
        return ukrainian;
    }

    {
        ukrainian.put("а",1);
        ukrainian.put("б",2);
        ukrainian.put("в",3);
        ukrainian.put("г",4);
        ukrainian.put("ґ",5);
        ukrainian.put("д",6);
        ukrainian.put("е",7);
        ukrainian.put("є",8);
        ukrainian.put("ж",9);
        ukrainian.put("з",10);
        ukrainian.put("и",11);
        ukrainian.put("і",12);
        ukrainian.put("ї",13);
        ukrainian.put("й",14);
        ukrainian.put("к",15);
        ukrainian.put("л",16);
        ukrainian.put("м",17);
        ukrainian.put("н",18);
        ukrainian.put("о",19);
        ukrainian.put("п",20);
        ukrainian.put("р",21);
        ukrainian.put("с",22);
        ukrainian.put("т",23);
        ukrainian.put("у",24);
        ukrainian.put("ф",25);
        ukrainian.put("х",26);
        ukrainian.put("ц",27);
        ukrainian.put("ч",28);
        ukrainian.put("ш",29);
        ukrainian.put("щ",30);
        ukrainian.put("ь",31);
        ukrainian.put("ю",32);
        ukrainian.put("я",33);

    }
@Override
    public Integer alphabet(String letter){
        return ukrainian.getOrDefault(letter,0);
    }
}
