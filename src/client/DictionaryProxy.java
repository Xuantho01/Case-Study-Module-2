package client;

import Execute.IReadAccount;
import Execute.Proxy;

import java.io.*;
import java.util.*;

public class DictionaryProxy extends editDictionaryFile implements Proxy, IReadAccount {

    editDictionaryFile EDIT_MANAGEMENT = new editDictionaryFile();

    static Scanner scanner = new Scanner(System.in);

    private String YourAccount;
    private String YourPassWord;

    private String note = "PassWord or Account incorrect. Please try again!";

    public void requiredLogin() {
        System.out.println("Enter your account: ");
        YourAccount = scanner.nextLine();

        System.out.println("Enter passWord: ");
        YourPassWord = scanner.nextLine();

    }

        public Boolean isLoggedIn() {

        requiredLogin();
        String pathOfFileAccount = "F:\\CodeGym\\Module2\\Case Study\\Translate\\src\\account.txt";
        readAccount(pathOfFileAccount);
        for (int i = 0; i < WORD_LIST_ACCOUNT.size(); i++) {
            if (WORD_LIST_ACCOUNT.get(i).equals(YourAccount) && WORD_LIST_ACCOUNT.get(i).equals(YourPassWord)){
                return true;
            }
        }
        return false;
    }
//    public Boolean isLoggedIn() {
//
//        requiredLogin();
//        String pathOfFileAccount = "F:\\CodeGym\\Module2\\Case Study\\Translate\\src\\account.txt";
//        readAccount(pathOfFileAccount);
//        boolean isCorrectLogin = this.WORD_LIST_ACCOUNT.containsKey(YourAccount)
//                && this.WORD_LIST_ACCOUNT.containsValue(YourPassWord);
//        if (isCorrectLogin) {
//            return true;
//        }
//        return false;
//    }
//
    @Override
    public void editManagement(String PathOfFile) {

        if (isLoggedIn()) {
            EDIT_MANAGEMENT.editElement(PathOfFile);
        } else
            System.out.println(note);
    }

    @Override
    public void removeManagement(String PathOfFile) {
        if (isLoggedIn()) {
            EDIT_MANAGEMENT.removeElement(PathOfFile);
        } else
            System.out.println(note);
    }

    @Override
    public void addWordManagement(String PathOfFile) {
        if (isLoggedIn()) {
            EDIT_MANAGEMENT.addNew_Word(PathOfFile);
        } else
            System.out.println(note);
    }

    List<String> WORD_LIST_ACCOUNT = new ArrayList<>();
    @Override
    public void readAccount(String pathOfFileAccount) {

        File file = new File(pathOfFileAccount);
        String cutToCharInFile = "=";

        try {
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            String line = "";
            BufferedReader input = new BufferedReader(new FileReader(file));
            while ((line = input.readLine()) != null){
                String[] Word_List = line.split(cutToCharInFile);
                WORD_LIST_ACCOUNT.add(Word_List[0]);
                WORD_LIST_ACCOUNT.add(Word_List[1]);
            }
            input.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }

//    Map<String, String> WORD_LIST_ACCOUNT = new HashMap<>();
//
//    @Override
//    public void readAccount(String pathOfFileAccount) {
//
//        File file = new File(pathOfFileAccount);
//        String cutToCharInFile = "=";
//
//        try {
//            if (!file.exists()) {
//                throw new FileNotFoundException();
//            }
//            String line = "";
//            BufferedReader input = new BufferedReader(new FileReader(file));
//            while ((line = input.readLine()) != null) {
//                String[] Word_List = line.split(cutToCharInFile);
//                WORD_LIST_ACCOUNT.put(Word_List[0], Word_List[1]);
//            }
//            input.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
}
