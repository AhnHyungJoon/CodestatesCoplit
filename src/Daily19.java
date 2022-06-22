package com.codestates.coplit;
import java.util.*;

public class Daily19 {
    public String decryptCaesarCipher(String str, int secret) {
        // TODO:
        if(str.isEmpty()) return str;
        String result = "";
        char[] charArr = str.toCharArray();
        for(char temp : charArr) {
            if (temp == ' ') {
                result = result.concat(" ");
            }
            else if (temp - secret < 97) {
                result = result.concat(String.valueOf((char)(temp - secret + 26)));
            }
            else {
                result = result.concat(String.valueOf((char)(temp - secret)));
            }
        }
        return result;
    }
}