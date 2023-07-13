package com.example.programmers.level2;

public class Solution7 {

    public int solution(int n) {

        int[] array = new int[n + 1];

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i <= n; i++) {
            array[i] = (array[i - 1] + array[i - 2]) % 1234567;
        }

        return array[n];
    }
}
