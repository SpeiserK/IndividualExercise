
public class base {
	public static void main(String [] args) {
		int [] arr1 = new int[10];
		for(int i=0;i<arr1.length;i++) {
			int rand = ((int) (Math.random()*100));
			arr1[i] = rand;
		}
		System.out.println("Here's an array: ");
		for(int j=0;j<arr1.length;j++) {
			System.out.print(arr1[j]+" ");
		}
	}
}
