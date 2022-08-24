public class NumericalMatches implements FindNumericalMatches{
    private String fullName;
    public LanguageBook languageBook;

    public NumericalMatches(String fullName,Language languageEnum) {
        this.fullName = fullName;

        if (languageEnum.equals(Language.UKRAINIAN)){
            languageBook = new Ukrainian();
        } else if (languageEnum.equals(Language.RUSSIAN)){
            languageBook = new Russian();
        } else if (languageEnum.equals(Language.ENGLISH)){
            languageBook = new English();
        }
    }


    @Override
    public Integer calculation() {

        String name = fullName.replaceAll(" ","").toLowerCase();

        int sum = 0;

        for (int i = 0; i < name.length(); i++){
            sum = sum + languageBook.alphabet(String.valueOf(name.charAt(i)));
        }

        return sum;
    }
}

