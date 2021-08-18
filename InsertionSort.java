
import java.util.Scanner;

public class InsertionSort {

	public static void Sort(int arr[]) {
		int n = arr.length, i, j, temp;
		for (i = 1; i < n; i++) {

			for (j = i - 1; j >= 0 && arr[j + 1] < arr[j]; j--) {
				temp = arr[j + 1];
				arr[j + 1] = arr[j];
				arr[j] = temp;

			}

		}
	}

	public static void printarray(int a[]) {
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}

	}

	public static void main(String[] args) {
		int n, i;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of elements in the array:");
		n = input.nextInt();

		int a[] = new int[n];
		System.out.println("Enter " + n + " elements ");
		for (i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}

		System.out.println("elements in array ");
		printarray(a);
		Sort(a);
		System.out.println("\nelements after sorting");
		printarray(a);
		input.close();

	}

}