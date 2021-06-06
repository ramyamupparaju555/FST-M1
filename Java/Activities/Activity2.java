package activities;

public class Activity2 {

	public static void main(String[] args) {

		int[] array1= {10,77,10,54,-11,10};
		
	int reqNum= 10;
	int reqSum=30;
	System.out.println(" the sum of 10's in the array is equal to 30 ?" +arrSum(array1,reqNum,reqSum));
	

	}
public static boolean arrSum(int[] arrval, int reqNum,int reqSum) {
	
	int temp_Sum=0;
	
	for (int i: arrval) {
		
		if (i==reqNum) {
			temp_Sum+= reqNum;
		}
		
		if(temp_Sum==reqSum) {
			break;
		}
	}
	return temp_Sum==reqSum;
	
}
}
