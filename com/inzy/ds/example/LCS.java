package com.inzy.ds.example;

class LCS {
    // Function to find Longest common substring of sequences
    // X[0..m-1] and Y[0..n-1]
    public static String LCS(String X, String Y, int m, int n) {
        int maxlen = 0;        // stores the max length of LCS
        int endingIndex = m;    // stores the ending index of LCS in X

        // lookup[i][j] stores the length of LCS of substring
        // X[0..i-1], Y[0..j-1]
        int[][] lookup = new int[m + 1][n + 1];

        // fill the lookup table in bottom-up manner
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // if current character of X and Y matches
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    lookup[i][j] = lookup[i - 1][j - 1] + 1;

                    // update the maximum length and ending index
                    if (lookup[i][j] > maxlen) {
                        maxlen = lookup[i][j];
                        endingIndex = i;
                    }
                }
            }
        }

        // return Longest common substring having length maxlen
        return X.substring(endingIndex - maxlen, endingIndex);
    }

    // main function
    public static void main(String[] args) {
        String X = "bqdrcvefgh", Y = "abcvdefgh";
        int m = X.length(), n = Y.length();

        // Find Longest common substring
        System.out.print("The Longest common substring is "
                + LCS(X, Y, m, n));
    }
}
