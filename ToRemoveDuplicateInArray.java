package Array;

public class ToRemoveDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int []arr= {1,2,2,3,4,4};
             int []removeCopyArr=new int[arr.length];
             int j=0;
             for(int i=0;i<arr.length-1;i++) {
            	 if(arr[i]!=arr[i+1]) {
            		 removeCopyArr [j]=arr[i];
            		 j++;
            	 }
            }
             removeCopyArr[j]=arr[arr.length-1];
             for(int i=0;i<=j;i++) {
            	 System.out.print(removeCopyArr[i]);
             }
	}

}
