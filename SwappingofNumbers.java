package Array;
import java.util.Arrays;
public class SwappingofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[]arr= {10,20,30,40,50};
			int j=arr.length-1;
			for(int i=0;i<j;i++) {
				int temp=arr[i];
				arr[j]=temp;
				j--;
			}
			System.out.println(Arrays.toString(arr));
	}

}
