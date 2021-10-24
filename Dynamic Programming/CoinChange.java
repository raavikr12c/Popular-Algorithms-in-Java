import java.util.Arrays; 
  
//You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount.
class CoinChange 
{ 
    static long countWays(int S[], int m, int n) 
    { 
        long[] table = new long[n+1]; 
        Arrays.fill(table, 0);  
        table[0] = 1; 
  
        for (int i=0; i<m; i++) {
            for (int j=S[i]; j<=n; j++) {
                table[j] += table[j-S[i]]; 
            }
        }
        return table[n]; 
    } 
  
    public static void main(String args[]) 
    { 
        int coins[] = {1, 2, 3}; 
        int m = coins.length; 
        int amount = 4; 
        System.out.println("Number of ways we can use the given denominations to make up the total amount of "+ amount+ " is "+countWays(coins, m, amount)); 
    } 
} 