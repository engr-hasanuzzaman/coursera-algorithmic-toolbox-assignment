import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
        long result = 0;
	// get top two max value
        for(int i = 0; i < 2; i++){
	  for(int j = i; j < numbers.length - 1; j++){
		if( numbers[j] > numbers[j+1]){
		  	numbers[j] += numbers[j+1];
			numbers[j+1] = numbers[j] - numbers[j+1];
			numbers[j] = numbers[j] - numbers[j+1];
		}
	  }
	}
      //  for(int i = 0; i < numbers.length; i++)
        //   System.out.print(numbers[i] + " ");

	//System.out.println("top two big number is " + numbers[0] + " and " + numbers[1]);
	//System.out.println(numbers);
	result = (long)numbers[numbers.length - 1] * (long)numbers[numbers.length - 2];
	
        return result;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
