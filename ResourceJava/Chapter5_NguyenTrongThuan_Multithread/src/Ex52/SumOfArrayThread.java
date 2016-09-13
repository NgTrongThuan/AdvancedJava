package Ex52;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 13/09/2016
 * @version : 1.0
 * --------------------------
 * create main method to run sum of array  thread
 *
 */
public class SumOfArrayThread {

	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		System.out.println("Input n: ");
		int n = input.nextInt();
		int arr[] = new int[n];
		Random random = new Random();
		for(int i = 0; i < n; i++){
			arr[i] = random.nextInt(10);
		}
		System.out.println("Input num of threads: ");
		int numThreads = input.nextInt();
		int sum = sum(arr, numThreads);
		String strArr = "";
		for(int value: arr){
			strArr += value + " ";
		}
		System.out.println("Array: " + strArr);
		System.out.println("Sum: " + sum);
	}

	// sum of array
	public static int sum(int[] arr, int numThreads) throws InterruptedException{
		int len = arr.length;
		int sum = 0;
		SumThread[] ts = new SumThread[numThreads];
		for(int i = 0; i < numThreads; i++){
			ts[i] = new SumThread((i * len) / numThreads, ((i + 1) * len /numThreads), arr);
			ts[i].start();
		}
		
		for(int i = 0; i < numThreads; i++){
			ts[i].join();
			sum += ts[i].getSum();
		}
		return sum;
	}
}
