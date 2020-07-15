package com.example.lib;

import org.omg.CORBA.MARSHAL;

class CarpetTest {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int brown, int yellow) {
                int[] answer = new int[2];
                int col = 0, row = 0;
                int temp = 0;
                do {
                    temp++;
                    if (yellow % temp == 0) {
                        int temp2 = yellow / temp;
                        col = Math.max(temp, temp2);
                        row = Math.min(temp, temp2);
                    }
                } while (col * 2 + row * 2 + 4 != brown);
                answer[0] = col + 2;
                answer[1] = row + 2;


                return answer;
            }
        }
        Solution s = new Solution();
        s.solution(18, 6);
    }
}
