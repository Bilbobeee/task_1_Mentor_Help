import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectLanguage implements DefineLanguage{
    private Matcher matcher;
    private Languages languages;
    @Override
    public Languages determine(String fullName) {

        Pattern patternUa = Pattern.compile("[ґєіїьҐЄІЇЬ]");
        matcher = patternUa.matcher(fullName);
        boolean ukrainianLanguage = matcher.find();

        if (!ukrainianLanguage){
            Pattern patternRus = Pattern.compile("[а-яА-Я]");
            matcher = patternRus.matcher(fullName);
            boolean russianLanguage = matcher.find();

            if (!russianLanguage){
                Pattern patternEng = Pattern.compile("[a-zA-Z]");
                matcher = patternEng.matcher(fullName);
                boolean englishLanguage = matcher.find();
                if (englishLanguage){
                    languages = Languages.ENGLISH;
                }

            } else {
                languages = Languages.RUSSIAN;
            }

        } else {
            languages = Languages.UKRAINIAN;
        }

        return languages;
    }
}
