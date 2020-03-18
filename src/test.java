import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String[] fullName = {"Trieu Van Nam","Nguyen Thi Hoa","To Trong Phu", "Ngo van Tai"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter char: ");
        String inChar = scanner.nextLine();
        String regex = ".*"+ inChar +".*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        for (int i = 0; i < fullName.length; i++){
            matcher = pattern.matcher(fullName[i]);
            if (matcher.find()){
                System.out.println(fullName[i]);
            }
        }
    }
}
