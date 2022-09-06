import java.util.TreeMap;

public class Russian extends LanguageBook {

    private TreeMap<Character,Integer> russian = new TreeMap<>();

    public Russian() {
        System.out.println("Rus");
    }

    {
        russian.put('а',1);
        russian.put('б',2);
        russian.put('в',3);
        russian.put('г',4);
        russian.put('д',5);
        russian.put('е',6);
        russian.put('ё',7);
        russian.put('ж',8);
        russian.put('з',9);
        russian.put('и',10);
        russian.put('й',11);
        russian.put('к',12);
        russian.put('л',13);
        russian.put('м',14);
        russian.put('н',15);
        russian.put('о',16);
        russian.put('п',17);
        russian.put('р',18);
        russian.put('с',19);
        russian.put('т',20);
        russian.put('у',21);
        russian.put('ф',22);
        russian.put('х',23);
        russian.put('ц',24);
        russian.put('ч',25);
        russian.put('ш',26);
        russian.put('щ',27);
        russian.put('ъ',28);
        russian.put('ы',29);
        russian.put('ь',30);
        russian.put('э',31);
        russian.put('ю',32);
        russian.put('я',33);
    }
@Override
    public Integer alphabet(String letter){
        return russian.getOrDefault(letter,0);
    }

}
