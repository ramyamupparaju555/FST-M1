	package activities;

public class Activity4 {

	public static void main(String[] args) {
		int[] numArry= {9,7,1,4,6,3,0,5,1,8,2};
		int i,j,k;
		
		  System.out.println("Before sorting the array"); 
		  
		  for(i=0;i<numArry.length;i++)
		  { System.out.println(numArry[i]); }
		 
		System.out.println("After sorting the array");
		int temp;
		for(j=0;j<numArry.length;j++) {
			for(k=j;k<numArry.length;k++){
				if(numArry[j]>numArry[k]) {
				temp=numArry[j];
				numArry[j]=numArry[k];
				numArry[k]=temp;
			}}
		}
	for(int a:numArry) {
		System.out.println(a);
	}	
	}

}
