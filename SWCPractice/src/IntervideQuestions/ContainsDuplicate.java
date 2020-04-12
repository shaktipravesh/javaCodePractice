package IntervideQuestions;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class ContainsDuplicate {

	public static void main(String[] args) {
	       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
	            try {
	                return bufferedReader.readLine().replaceAll("\\s+$", "");
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        })
	            .map(String::trim)
	            .map(Integer::parseInt)
	            .collect(toList());

	        boolean result = Result.containsDuplicate(numbers);

	        bufferedWriter.write(String.valueOf(result ? 1 : 0));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();

	}

}

class Result {

    /*
     * Complete the 'containsDuplicate' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static boolean containsDuplicate(List<Integer> numbers) {
    	boolean iResult = false;
    	int iRes = 0; 
    	return iResult;
    }

}
