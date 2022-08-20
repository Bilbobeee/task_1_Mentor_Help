import java.util.Map;
import java.util.TreeMap;

public class English {

    private TreeMap<Integer,String> english = new TreeMap<>();

    {
        english.put(1,"a");
        english.put(2,"b");
        english.put(3,"c");
        english.put(4,"d");
        english.put(5,"e");
        english.put(6,"f");
        english.put(7,"g");
        english.put(8,"h");
        english.put(9,"i");
        english.put(10,"j");
        english.put(11,"k");
        english.put(12,"l");
        english.put(13,"m");
        english.put(14,"n");
        english.put(15,"o");
        english.put(16,"p");
        english.put(17,"q");
        english.put(18,"r");
        english.put(19,"s");
        english.put(20,"t");
        english.put(21,"u");
        english.put(22,"v");
        english.put(23,"w");
        english.put(24,"x");
        english.put(25,"y");
        english.put(26,"z");

    }

    public Integer alphabet(String letter){
        int result = 0;

        for (Map.Entry<Integer, String> cell : english.entrySet()) {
            if (letter.equals(cell.getValue())){
                result = cell.getKey();
            }
        }

        return result;
    }

}
