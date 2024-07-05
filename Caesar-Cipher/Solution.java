import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static String generateSecretCode(String s) {
        String secret = "";

        for(int i = 0; i < s.length(); i++) {
            int secretNumber = 1 + s.charAt(i) - 'A';
            if(secretNumber < 10) {
                secret += "0";
            }

            secret += secretNumber;
        }
        return secret;
    }
}
