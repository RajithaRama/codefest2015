import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by Rama on 10/28/2015.
 */
public class passwrd {

    private char [] inputs;
    private String passwrd = "";

    public passwrd(String input) throws NoSuchAlgorithmException {

        inputs = input.toCharArray();

        passwrd1to5();
        passwrd5to10();
        passwrd10to15();
    }

    private void passwrd1to5() throws NoSuchAlgorithmException {
        String[] symbols = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int length = 5;
        Random random = SecureRandom.getInstanceStrong();    // as of JDK 8, this should return the strongest algorithm available to the JVM
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int indexRandom = random.nextInt( symbols.length );
            sb.append( symbols[indexRandom] );
        }
        passwrd = passwrd.concat(sb.toString());
    }

    private void passwrd5to10() throws NoSuchAlgorithmException {
        String[] symbols = {"A", "B", "C", "D", "E", "F", "G", "H", "P", "L", "R", "N", "I", "V", "S"};
        int length = 5;
        Random random = SecureRandom.getInstanceStrong();    // as of JDK 8, this should return the strongest algorithm available to the JVM
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int indexRandom = random.nextInt( symbols.length );
            sb.append( symbols[indexRandom] );
        }
        passwrd = passwrd.concat(sb.toString());
    }

    private void passwrd10to15() throws NoSuchAlgorithmException {

        int length = 5;
        Random random = SecureRandom.getInstanceStrong();    // as of JDK 8, this should return the strongest algorithm available to the JVM
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int indexRandom = random.nextInt( inputs.length );
            sb.append( inputs[indexRandom] );
        }
        passwrd = passwrd.concat(sb.toString());
    }

    public String getPasswrd(){
        return passwrd;
    }
}
