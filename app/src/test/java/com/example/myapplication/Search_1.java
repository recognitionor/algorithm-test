package com.example.myapplication;

import java.util.HashSet;

public class Search_1 {

    public static void main(String[] args) {
        class Solution {
            public int solution(String numbers) {
                int answer = 0;
                int[] arr = new int[numbers.length()];
                HashSet<Integer> numSet = new HashSet<>();
                for (int i = 0; i < numbers.length(); i++) {
                    arr[i] = Integer.valueOf(numbers.substring(i, i + 1));
                    numSet.add(arr[i]);
                }

                for (int i = 0; i < numbers.length(); i++) {
                }


                return answer;
            }
        }

        Solution s = new Solution();
        s.solution("17");
    }
}
