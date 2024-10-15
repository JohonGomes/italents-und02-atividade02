package Unidade02;

public class BubbleSort {
	public static void bubblesort(int[] arr) {
		boolean swap;
		
		for(int i = 0; i < arr.length - 1; i++) {
			swap = false;
			for(int j = 0; j< arr.length -i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}
			if(!swap){
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {64,34,25,12,22,11,90};
		
		System.out.println("Array não Ordenado");
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
