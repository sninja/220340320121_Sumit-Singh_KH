import java.util.Scanner;
class Sorting{
	
	void insertionSort(int n, int a1[]){
		for(int i=n-1; i>=0; i--){
			int k = a1[i];
			int j = i-1;
			int flag = 0;
			while(j>=0 && a1[j] >= k){
				a1[j+1] = a1[j];
				--j;
				display(a1);
			}		
			a1[j+1] = k;
		}
		display(a1);
	}
	
	void display(int a1[]){
		for(int i=0 ;i<a1.length; i++){
			System.out.print(a1[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		Sorting obj = new Sorting();
		obj.insertionSort(n, arr);
	}
}