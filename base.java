import java.util.Arrays;

public class base {
	public static void main(String [] args) {
		//Comment
		int [] arr1 = {4,2,5,1,3};
		int sum = 15;
		System.out.println("Here's an array: ");
		for(int j=0;j<arr1.length;j++) {
			System.out.print(arr1[j]+" ");
		}
		average(arr1,sum);
		sort(arr1);
	}
	static int average(int[] array, int sum1) {
		int above = 0;
		int avg = sum1/5;
		System.out.println("\n");
		System.out.println("The average of the array is: ("+avg+")");
		for(int k = 0;k<array.length;k++) {
			if(array[k]>avg) {
				above++;
			}
		}
		System.out.print("There are "+above+" numbers above the average");
		return avg;
	}
		static int[] sort(int[] array) {
		System.out.println("\n");
		System.out.println("Here is the array sorted:");
		Arrays.sort(array);
		for(int j=0;j<array.length;j++) {
			System.out.print(array[j]+" ");
		}
		return array;
	}
}