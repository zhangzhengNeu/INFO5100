package edu.northeastern.ashish.zheng;

/*
LeetCode :
        1) Transpose Matrix : https://leetcode.com/problems/transpose-matrix/
        */

public class leetcode1 {

  public static int[][] transpose(int[][] matrix) {
    int m = matrix.length, n = matrix[0].length;
    int[][] transpose1 = new int[n][m];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        transpose1[j][i] = matrix[i][j];
      }
    }
    return transpose1;
  }
}
