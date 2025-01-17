package local;

public class OptimizedBubbleSort {
	
	public static void bubbleSort(int[]arr) {
		int n  = arr.length;
		boolean swapped;
		for(int i=0;i<n-1;i++) {
			swapped = false;
			for(int j=0;j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
					swapped = true;
					
				}
			}
			
			if(!swapped) {
				break;
			}
		}
	}
	
	
	public static void main(String[]args) {
		int[]arr= {32,70,33,11,90,91,1};
		bubbleSort(arr);
		System.out.println("Sorted array:");
		for(int value : arr) {
			System.out.print(value + " ");
		}
	}
	
	

}
