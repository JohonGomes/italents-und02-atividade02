package Unidade02;

public class InsertionSort {
	
	public static void insertionSort (int[] arr) {
		
		int tamanho = arr.length;
		for( int i = 1 ; i < tamanho; i++) {
			int temp = arr[i];
			int j = i - 1;
			
			while (j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
			
		}
		
	}

	public static void main(String[] args) {
		int [] arr = {56,3,7,76,323,76,87};
		
		System.out.println("Array não ordenado");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		insertionSort(arr);
		
		System.out.println("\n");
		System.out.println("Array ordenado");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
