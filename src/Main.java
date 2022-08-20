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

        String[] nameSplit = fullName.split(" ");
        int sum = 0;

        int split = nameSplit.length;
        int doneSum = 0;


        for (int i = 0; i < nameSplit.length; i++){

            for (int a = 0; a < nameSplit[i].length(); a++){

                sum = sum + ukrainian.alphabet(nameSplit[i].substring(a,a+1).toLowerCase());

                if (sum==0){
                    sum = sum + russian.alphabet(nameSplit[i].substring(a,a+1).toLowerCase());

                    if(sum==0){
                        sum = sum + english.alphabet(nameSplit[i].substring(a,a+1).toLowerCase());
                    }
                }
                doneSum = doneSum + sum;
                sum = 0;
            }
        }

        System.out.println("Фамилия: " + nameSplit[0] + "\nИмя: " + nameSplit[1] + "\nОтчество: " + nameSplit[2]
        + "\nЧисловое соответствие: " + doneSum+"\n");

    }

}
