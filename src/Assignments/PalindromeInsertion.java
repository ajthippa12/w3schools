package Assignments;


public class PalindromeInsertion {
    
    // Function to find the minimum number of insertions required to make a string palindrome
	
	static  int Insertions(String str) {
        int n = str.length();
        int[][] a = new int[n][n];

        // Fill the table
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;
                if (str.charAt(i) == str.charAt(j)) {
                    a[i][j] = a[i + 1][j - 1];
                } else {
                    a[i][j] = Math.min(a[i][j - 1], a[i + 1][j]) + 1;
                }
            }
        }

        // The minimum number of insertions to make the entire string a palindrome
        return a[0][n - 1];
    }

    public static void main(String[] args) {
        String input1 = "abcd";
        String input2 = "aabb";
        
        System.out.println("output of'" + input1 + "' a palindrome is : " + Insertions(input1));
        System.out.println("output of'" + input2 + "' a palindrome is: " + Insertions(input2));
    }
}
