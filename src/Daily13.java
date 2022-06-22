package com.codestates.coplit;
import java.util.*;

public class Daily13 {
    public String readVertically(String[] arr) {
        // TODO:
        String result = ""; // result 초기화
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].length() > max){
                max = arr[i].length();
            }
        }
        // 반복문을 통해 문자 하나씩 가져온다.
        // arr{hello, world, java}
        for (int i = 0; i < max; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[j].length() > i)
                    result = result.concat(String.valueOf(arr[j].charAt(i)));
            }
        }
        return result;
    }
}
