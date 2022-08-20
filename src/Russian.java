import java.util.Map;
import java.util.TreeMap;

public class Russian {

    private TreeMap<Integer,String> russian = new TreeMap<>();

    {
        russian.put(1,"а");
        russian.put(2,"б");
        russian.put(3,"в");
        russian.put(4,"г");
        russian.put(5,"д");
        russian.put(6,"е");
        russian.put(7,"ё");
        russian.put(8,"ж");
        russian.put(9,"з");
        russian.put(10,"и");
        russian.put(11,"й");
        russian.put(12,"к");
        russian.put(13,"л");
        russian.put(14,"м");
        russian.put(15,"н");
        russian.put(16,"о");
        russian.put(17,"п");
        russian.put(18,"р");
        russian.put(19,"с");
        russian.put(20,"т");
        russian.put(21,"у");
        russian.put(22,"ф");
        russian.put(23,"х");
        russian.put(24,"ц");
        russian.put(25,"ч");
        russian.put(26,"ш");
        russian.put(27,"щ");
        russian.put(28,"ъ");
        russian.put(29,"ы");
        russian.put(30,"ь");
        russian.put(31,"э");
        russian.put(32,"ю");
        russian.put(33,"я");
    }

    public Integer alphabet(String letter){
        int result = 0;

        for (Map.Entry<Integer, String> cell : russian.entrySet()) {
            if (letter.equals(cell.getValue())){
                result = cell.getKey();
            }
        }

        return result;
    }

}
