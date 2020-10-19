/*
The longest common subsequence (LCS) problem is the problem of finding the longest subsequence common to all sequences in a set of sequences (often just two sequences). 
It differs from the longest common substring problem: unlike substrings, subsequences are not required to occupy consecutive positions within the original sequences.
Dynamic Programming Java implementation of Longest Common Subsequence problem.
*/

public class LongestCommonSubsequence
{ 
  
  static int longestCommonSubsequence( String string1, String string2 ) { 
    
    char[] firstString = string1.toCharArray(); 
    char[] secondString = string2.toCharArray(); 
    int firstStringLength = string1.length(); 
    int secondStringLength = string2.length(); 

    int table[][] = new int[firstStringLength+1][secondStringLength+1]; 
  
    for (int i = 0; i <= firstStringLength; i++) { 
        for (int j = 0; j<=secondStringLength; j++) { 
            if (i == 0 || j == 0){ 
                table[i][j] = 0; 
            } else if (firstString[i-1] == secondString[j-1]){ 
                table[i][j] = table[i-1][j-1] + 1; 
            } else {
                table[i][j] = max(table[i-1][j], table[i][j-1]); 
            }
        } 
    } 
    return table[firstStringLength][secondStringLength]; 
  } 
  
  /* Utility function to get maximum of 2 int values */
  static int max(int a, int b) { 
    return (a > b)? a : b; 
  } 
  
    public static void main(String[] args) { 
        String s1 = "independent"; 
        String s2 = "deployment";     
        System.out.println("Length of LCS is" + " " + longestCommonSubsequence(s1, s2)); 
    } 
} 