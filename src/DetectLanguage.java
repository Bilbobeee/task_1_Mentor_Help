import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectLanguage {
    private Pattern pattern;
    private Matcher matcher;
    private LanguageBook language;
    private String[] patternLanguageString = {"[ґєіїьҐЄІЇЬ]","[а-яА-Я]","[a-zA-Z]"};

    public LanguageBook determine(String fullName) {

        for (int i = 0; i < 3; i++){

            pattern = Pattern.compile(patternLanguageString[i]);
            matcher = pattern.matcher(fullName);

            if (matcher.find()){
                switch (i){
                    case 0 -> language = new Ukrainian();
                    case 1 -> language = new Russian();
                    case 2 -> language = new English();

                    default ->
                        throw new IllegalStateException("Unexpected value: " + i);
                };
                break;
            }

        }
        if (language==null){
            System.out.println("Введенный вами язык не зарегистрирован.");
            System.exit(0);
        }

        return language;
    }
}
