import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try{
            fullName = input.readLine();

        }catch (IOException e){
            e.printStackTrace();
        }

        Language language = new DetectLanguage().determine(fullName);

        String[] nameSplit = fullName.split(" ");


        NumericalMatches numericalMatches = new NumericalMatches(fullName,language);
        int doneSum = numericalMatches.calculation();


        System.out.println("Фамилия: " + nameSplit[0] + "\nИмя: " + nameSplit[1] + "\nОтчество: " + nameSplit[2]
        + "\nЧисловое соответствие: " + doneSum+"\n");

    }

}
