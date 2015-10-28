import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) {
        try {
            passwrd passw = new passwrd("asdfzxcv");
            System.out.println(passw.getPasswrd());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        // write your code here
    }
}
