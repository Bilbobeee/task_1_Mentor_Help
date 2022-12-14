public class NumericalValue implements FindNumericalMatches{
    private String fullName;
    public LanguageBook languageBook;

    public NumericalValue(String fullName, LanguageBook language) {
        this.fullName = fullName;
        this.languageBook = language;

    }


    @Override
    public Integer calculateNumericalValue() {

        String name = fullName.replaceAll(" ","").toLowerCase();

        int sum = 0;

        for (int i = 0; i < name.length(); i++){
            sum = sum + languageBook.alphabet(name.charAt(i));
        }

        return sum;
    }
}

