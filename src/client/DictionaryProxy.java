package client;

import java.io.IOException;
import java.util.Scanner;

public class DictionaryProxy extends editDictionaryFile {

    editDictionaryFile EDIT_MANAGEMENT = new editDictionaryFile();
    static Scanner scanner = new Scanner(System.in);

    private static String YourAccount;
    private static String YourPassWord;

    private String note = "PassWord or Account incorrect. Please try again!";

    public static void requiredLogin(){

        System.out.println("Enter your account: ");
         YourAccount = scanner.nextLine();

        System.out.println("Enter passWord: ");
         YourPassWord = scanner.nextLine();

    }

    public static Boolean isLoggedIn(){

        requiredLogin();

        String account = "admin";
        String password = "admin";

        boolean isCorrectLogin = YourAccount.equals(account) && YourPassWord.equals(password);
        if (isCorrectLogin){
            return true;
        }
        return false;
    }

    public void editManagement(String PathOfFile){

        if (isLoggedIn()){
            EDIT_MANAGEMENT.editElement(PathOfFile);
        }else
            System.out.println(note);
    }

    public void removeManagement(String PathOfFile) throws IOException {
        if (isLoggedIn()){
            EDIT_MANAGEMENT.removeElement(PathOfFile);
        }else
            System.out.println(note);
    }

    public void addWordManagement(String PathOfFile) {
        if (isLoggedIn()){
            EDIT_MANAGEMENT.addNew_Word(PathOfFile);
        }else
            System.out.println(note);
    }

}
