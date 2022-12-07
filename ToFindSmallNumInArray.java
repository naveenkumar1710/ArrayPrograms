package Array;

public class ToFindSmallNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {15,20,30,40,5};
		int temp=Integer.MAX_VALUE;// temp value is 2147483647
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<temp) {
				temp=arr[i];
			}
		}
		System.out.println("Smallest num in Array is "+temp);
	}

}
