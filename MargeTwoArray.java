/*
 Q3.Write a program to merge two very large sorted array and print the final array.

arrayA [100000]
arrayB [100000] 
 */
import java.util.Arrays;

public class MargeTwoArray 
{
	static int Merge[];
	public static void sortedMergeArrays(int Array1[], int Array2[],  int Merge[])
	{
			int n=Array1.length;
			int m=Array2.length;
			int i = 0, j = 0, k = 0;
			while (i < n) {
				Merge[k] = Array1[i];
				i++;
				k++;
			}

			while (j < m) {
				Merge[k] = Array2[j];
				j ++;
				k ++;
			}

			Arrays.sort(Merge);
}
	public static void main(String[] args) 
	{
		//int arr1=int[100000];
		//int arr2=int[100000];
	int arr1[]={10,20,30,40,50};
	int arr2[]={50,63,96};
	System.out.println();
	Merge=new int[arr1.length+arr2.length];
	
	sortedMergeArrays(arr1,arr2,Merge);
	for(int a:Merge)
		System.out.println(a);
	
	
	}

}
