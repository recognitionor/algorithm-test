package com.example.lib;

import java.util.ArrayList;

class NoEqualNumber {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] arr) {
                int[] answer = {};
                int preNum = -1;
                ArrayList<Integer> list = new ArrayList<>();
                for (int value : arr) {
                    if (preNum != value) {
                        list.add(value);
                    }
                    preNum = value;
                }
                answer = new int[list.size()];
                int count = 0;
                for (int item : list) {
                    answer[count] = item;
                    count++;
                }

                return answer;
            }
        }
        Solution s = new Solution();
        s.solution(new int[]{4, 4, 4, 3, 3});
    }
}
