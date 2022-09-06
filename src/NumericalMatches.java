public class NumericalMatches implements FindNumericalMatches{
    private String fullName;
    public LanguageBook languageBook;

    public NumericalMatches(String fullName,LanguageBook language) {
        this.fullName = fullName;

    }


    @Override
    public Integer calculation() {

        String name = fullName.replaceAll(" ","").toLowerCase();

        int sum = 0;

        for (int i = 0; i < name.length(); i++){
            sum = sum + languageBook.alphabet(String.valueOf(name.charAt(i)));
            System.out.println(sum);
        }

        return sum;
    }
}

