import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectLanguage implements DefineLanguage{
    private Pattern pattern;
    private Matcher matcher;
    private Language language;
    private String[] patternLanguageString = {"[ґєіїьҐЄІЇЬ]","[а-яА-Я]","[a-zA-Z]"};

    @Override
    public Language determine(String fullName) {

        for (int i = 0; i < 3; i++){

            pattern = Pattern.compile(patternLanguageString[i]);
            matcher = pattern.matcher(fullName);

            if (matcher.find()){
                switch (i){
                    case 0 : language = Language.UKRAINIAN;
                    break;
                    case 1 : language = Language.RUSSIAN;
                    break;
                    case 2 : language = Language.ENGLISH;
                    break;
                }
                break;
            }

        }

        return language;
    }
}
