import java.util.ArrayList;
import java.util.Scanner;


public class Problem4_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] inputLine = input.nextLine().split(" ");
		int[] numbers = new int[inputLine.length];
		for(int i = 0; i < inputLine.length; i++)
		{
		   numbers[i] = Integer.parseInt(inputLine[i]);
		}
		Problem4_LongestIncreasingSequence obj = new Problem4_LongestIncreasingSequence(); 
        int[] result = obj.lis(numbers);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] +" ");
        System.out.println();
		input.close();
	}
	
	public int[] lis(int[] X)
    {        
        int n = X.length - 1;
        int[] M = new int[n + 1];  
        int[] P = new int[n + 1]; 
        int L = 0;
 
        for (int i = 1; i < n + 1; i++)
        {
            int j = 0;
 
            for (int pos = L ; pos >= 1; pos--)
            {
                if (X[M[pos]] < X[i])
                {
                    j = pos;
                    break;
                }
            }            
            P[i] = M[j];
            if (j == L || X[i] < X[M[j + 1]])
            {
                M[j + 1] = i;
                L = Math.max(L,j + 1);
            }
        }
  
        int[] result = new int[L];
        int pos = M[L];
        for (int i = L - 1; i >= 0; i--)
        {
            result[i] = X[pos];
            pos = P[pos];
        }
        return result;             
    }

}
