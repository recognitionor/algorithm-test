package com.example.lib;

public class TargetNumber {

    public static void main(String[] args) {

        class Solution {
            int check(int[] numbers, int node, int sum, int target) {
                System.out.println("node : " + node + ", sum : " + sum);
                if (numbers.length <= node) {
                    if (sum == target) {
                        return 1;
                    }
                    return 0;
                }
                return check(numbers, node + 1, sum + numbers[node], target) +
                        check(numbers, node + 1, sum - numbers[node], target);
            }

            public int solution(int[] numbers, int target) {
                int answer = check(numbers, 0, 0, target);
                System.out.println(answer);
                return answer;
            }
        }
        Solution s = new Solution();
        s.solution(new int[]{1, 1, 1, 1, 1}, 3);
    }
}
