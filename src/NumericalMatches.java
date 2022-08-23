public class NumericalMatches implements FindNumericalMatches{
    private String fullName;

    public Language language;

    public NumericalMatches(String fullName,Enum languageEnum) {
        this.fullName = fullName;

        if (languageEnum.equals(Languages.UKRAINIAN)){
            language = new Ukrainian();
        } else if (languageEnum.equals(Languages.RUSSIAN)){
            language = new Russian();
        } else if (languageEnum.equals(Languages.ENGLISH)){
            language = new English();
        }
    }


    @Override
    public Integer calculation() {

        String[] nameSplit = fullName.split(" ");
        int sum = 0;


        for (int i = 0; i < nameSplit.length; i++){

            for (int a = 0; a < nameSplit[i].length(); a++){

                sum = sum + language.alphabet(nameSplit[i].substring(a,a+1).toLowerCase());

            }

        }

        return sum;
    }
}
