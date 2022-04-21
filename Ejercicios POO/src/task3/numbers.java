package task3;

import java.util.Scanner;

public class numbers {

	public void bubbleSort(double[] randomNumbers) {
		int n = randomNumbers.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (randomNumbers[j] > randomNumbers[j + 1]) {
					double temp = randomNumbers[j];
					randomNumbers[j] = randomNumbers[j + 1];
					randomNumbers[j + 1] = temp;
				}
	}

	public void quickSort(double[] arr, int low, int high) {
		int i, j;
		double temp, t;

		if (low > high) {
			return;
		}

		i = low;
		j = high;
		temp = arr[low];
		while (i < j) {
			while (temp <= arr[j] && i < j) {
				j--;
			}
			while (temp >= arr[i] && i < j) {
				i++;
			}
			if (i < j) {
				t = arr[j];
				arr[j] = arr[i];
				arr[i] = t;
			}

		}
		arr[low] = arr[i];
		arr[i] = temp;
		quickSort(arr, low, j - 1);
		quickSort(arr, j + 1, high);
	}

	public void printArray(double[] randomNumbers) {
		String pt = "";
		for (double i : randomNumbers) {
			pt = pt +" "+ i; 
		}
		System.out.println(pt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] randomNumbers = new double[10];
		for (int i = 0; i < 10; i++) {
			randomNumbers[i] = Math.random() * 20;
		}

		numbers n = new numbers();

		int op = 0;
		System.out.println("Array to Sort");
		n.printArray(randomNumbers);
		Scanner myObj = new Scanner(System.in);
		System.out.println(" Orders =) " 
		                 + "\n" + "1. BubbleSort!" 
				         + "\n" + "2. QuickSort" 
		                 + "\n" + "3. Exit" + "\n");
		op = myObj.nextInt();
		switch (op) {
		case 1:
			// code block
			System.out.println("Bubble Sort");
			n.bubbleSort(randomNumbers);
			n.printArray(randomNumbers);
			break;
		case 2:
			// code block
			System.out.println("Quick Sort");
			n.quickSort(randomNumbers, 0, randomNumbers.length - 1);
			n.printArray(randomNumbers);
			break;
		case 3:
			// code block
			System.out.println("Bye");
			break;
		default:
			// code block
			System.out.println("Type a valid option!");
		}
	}

}
