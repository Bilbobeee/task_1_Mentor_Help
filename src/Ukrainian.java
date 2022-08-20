import java.util.Map;
import java.util.TreeMap;

public class Ukrainian {

    private TreeMap<Integer,String> ukrainian = new TreeMap<>();

    {
        ukrainian.put(1, "а");
        ukrainian.put(2, "б");
        ukrainian.put(3, "в");
        ukrainian.put(4, "г");
        ukrainian.put(5, "д");
        ukrainian.put(6, "е");
        ukrainian.put(7, "ё");
        ukrainian.put(8, "ж");
        ukrainian.put(9, "з");
        ukrainian.put(10, "и");
        ukrainian.put(11, "й");
        ukrainian.put(12, "к");
        ukrainian.put(13, "л");
        ukrainian.put(14, "м");
        ukrainian.put(15, "н");
        ukrainian.put(16, "о");
        ukrainian.put(17, "п");
        ukrainian.put(18, "р");
        ukrainian.put(19, "с");
        ukrainian.put(20, "т");
        ukrainian.put(21, "у");
        ukrainian.put(22, "ф");
        ukrainian.put(23, "х");
        ukrainian.put(24, "ц");
        ukrainian.put(25, "ч");
        ukrainian.put(26, "ш");
        ukrainian.put(27, "щ");
        ukrainian.put(28, "ъ");
        ukrainian.put(29, "ы");
        ukrainian.put(30, "ь");
        ukrainian.put(31, "э");
        ukrainian.put(32, "ю");
        ukrainian.put(33, "я");
    }

    public Integer alphabet(String letter){
        int result = 0;

        for (Map.Entry<Integer, String> cell : ukrainian.entrySet()) {
            if (letter.equals(cell.getValue())){
                result = cell.getKey();
            }
        }

        return result;
    }
}
