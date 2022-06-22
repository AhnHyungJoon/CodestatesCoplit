package com.codestates.coplit;
import java.util.*;

// 수를 요소로 갖는 배열을 입력받아 각 요소들이 그 이전의 요소들의 합보다 큰지 여부를 리턴해야 합니다.

public class Daily14 {
    public boolean superIncreasing(int[] arr) {
        // TODO:
        int sum = arr[0]; // 요소들의 합 선언
        // 각 요소들이 그 이전의 요소들의 합보다 작거나 같은 경우
        for (int i = 1; i < arr.length; i++){
            if (arr[i] <= sum){
                return false;

                // 각 요소들이 그 이전의 요소들의 합보다 큰 경우
            } else if (arr[i] > sum) {
                sum = sum + arr[i];
            }
        }
        return true;
    }
}
