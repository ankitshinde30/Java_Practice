package module4;
import java.util.Arrays;
import java.util.Collections;

public class DesendingSort {

	public static void main(String[] args) {
		Integer[] numbers = {5,2,8,4,9};
		Arrays.sort(numbers,Collections.reverseOrder());
		System.out.println(Arrays.toString(numbers));

	}

}