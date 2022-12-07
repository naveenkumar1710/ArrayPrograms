package Array;

public class ToFindBigNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=Integer.MIN_VALUE;// value for temp is -2147483648
		int[]arr= {10,20,30,60,50};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>temp) {
				temp=arr[i];
			}
		}
		System.out.println("Biggest num in Array is "+temp);
	}				
}					
			
	
