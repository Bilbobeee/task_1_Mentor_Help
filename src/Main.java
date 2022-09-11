import java.util.Scanner;

public class Main {

    private static Ukrainian ukrainian = new Ukrainian();
    private static Russian russian = new Russian();
    private static English english = new English();

    private static String fullName;

    public static void main(String[] args){

        start();

    }

    public static void start() {

        System.out.print("ФИО: ");

        Scanner input = new Scanner(System.in);
        fullName = input.nextLine();

        LanguageBook language = new DetectLanguage().determine(fullName);
        String[] nameSplit = fullName.split(" ");


        NumericalValue numericalMatches = new NumericalValue(fullName,language);
        int doneSum = numericalMatches.calculateNumericalValue();


        System.out.println("Фамилия: " + nameSplit[0] + "\nИмя: " + nameSplit[1] + "\nОтчество: " + nameSplit[2]
        + "\nЧисловое соответствие: " + doneSum+"\n");


    }

}
