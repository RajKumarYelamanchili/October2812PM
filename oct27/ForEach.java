package oct27;

public class ForEach {

	public static void main(String[] args) {
	
		int arr[]= {10,4,23,6,99,45,72,1};
		
		System.out.println("Length of the array: " + arr.length);
		
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	/*	for(int t  : arr)
		{
			System.out.println(t);
		}
        */
	}

}
