package com.codestates.coplit;
import java.util.*;

// 두 수(num1, num2)를 입력받아, num1를 num2로 나눈 나머지를 리턴해야 합니다.

public class Daily15 {
    public Integer modulo(int num1, int num2) {
        int result = 0;
        if (num2 == 0){
            return null;
        }
        result = Math.floorMod(num1, num2);
        return result;
    }
}
