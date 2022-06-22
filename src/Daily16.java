package com.codestates.coplit;
import java.util.*;

// 문자열을 입력받아 아이소그램인지 여부를 리턴해야 합니다. 아이소그램(isogram)은 각 알파벳을 한번씩만 이용해서 만든 단어나 문구를 말합니다.

public class Daily16 {
    public boolean isIsogram(String str) {
        // TODO:
        str = str.toLowerCase();
        // 빈 문자열일 경우 true
        if (str.length() == 0){
            return true;
        }
        // 반복문으로 문자 하나씩 체크
        for (int i = 0; i < str.length(); i++){
            // 동일한 알파벳 있으면 false
            if (str.indexOf(str.charAt(i), i+1) != -1) {
                return false;
            }
        }
        // 정상 case true 리턴
        return true;
    }
}
