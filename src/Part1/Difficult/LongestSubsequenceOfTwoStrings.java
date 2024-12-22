package Part1.Difficult;

public class LongestSubsequenceOfTwoStrings {

    public static int LengthOfLCS(String first, String second) {

        int m = first.length();
        int n = second.length();

        int[][] table = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (first.charAt(i - 1) == second.charAt(j - 1)) {
                    table[i][j] = table[i - 1][j - 1] + 1;
                } else {
                    table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
                }
            }
        }
        return table[m][n];
    }

    public static String CharactersOfLCS(String first, String second) {

        int m = first.length();
        int n = second.length();

        int[][] table = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (first.charAt(i - 1) == second.charAt(j - 1)) {
                    table[i][j] = table[i - 1][j - 1] + 1;
                } else {
                    table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
                }
            }
        }

        StringBuilder lcs = new StringBuilder();
        int i = m;
        int j = n;

        while (i > 0 && j > 0) {
            if (first.charAt(i - 1) == second.charAt(j - 1)) {
                lcs.append(first.charAt(i - 1));
                i--;
                j--;
            } else if (table[i - 1][j] > table[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return lcs.reverse().toString();
    }

    public static void main(String[] args) {
        String first = "AGGTAB";
        String second = "GXTXAYB";

        System.out.println(LengthOfLCS(first, second));
        System.out.println("LCS: " + CharactersOfLCS(first, second));
    }
}
