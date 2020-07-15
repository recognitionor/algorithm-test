package com.example.lib;

class MiroSearch {

    static int ALREADY_VISITED = 2;

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {0, 1, 1, 0, 1, 0, 0},
                {0, 1, 1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 0}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int current = arr[i][j];
                if (arr[i][j] == 1) {
                    current = ALREADY_VISITED;
                    search(arr, i, j);
                    System.out.println("------");
                }
            }
        }

    }

    private static void search(int[][] arr, int i, int j) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr.length) {
            return;
        }
        if (arr[i][j] != 1) {
            return;
        }
        arr[i][j] = ALREADY_VISITED;
        search(arr, i - 1, j);
        search(arr, i, j - 1);
        search(arr, i + 1, j);
        search(arr, i, j + 1);
    }
}
