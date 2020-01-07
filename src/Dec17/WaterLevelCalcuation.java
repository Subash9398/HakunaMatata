package Dec17;


	//Output
	//Enter the length
	//8
	//Enter the values
	//7
	//2
	//4
	//0
	//6
	//4
	//0
	//5
	//Water level is -18
	import java.util.ArrayList;
	import java.util.Scanner;

	public class WaterLevelCalcuation {
		 static int findWater(int arr[],int n) 
		    { 
		        int left[] = new int[n]; 
		        int right[] = new int[n]; 
		        int water = 0; 
		        left[0] = arr[0]; 
		        for (int i = 1; i < n; i++) 
		            left[i] = Math.max(left[i - 1], arr[i]); 
		        right[n - 1] = arr[n - 1]; 
		        for(int i=0;i<left.length;i++)
		        {
		        	System.out.println(left[i]);
		        }
		        for (int i = n - 2; i >= 0; i--) 
		            right[i] = Math.max(right[i + 1], arr[i]);  
		        for(int i=0;i<right.length;i++)
		        	System.out.println(right[i]);
		        for (int i = 0; i < n; i++) 
		            water += Math.min(left[i], right[i]) - arr[i]; 
		  
		        return water; 
		    } 
		 static int[] getinput(int n)
		 {
			 Scanner scannerObject=new Scanner(System.in);
			 int tank[]=new int[n];
			 System.out.println("Enter the values");
			 for(int i=0;i<tank.length;i++)
			 {
			 	tank[i]=scannerObject.nextInt();
			 }
			 return tank;
		 }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner scannerObject=new Scanner(System.in);
	System.out.println("Enter the length");
	int n=scannerObject.nextInt();
	int tank[]=getinput(n);
	System.out.println("Water level is -"+findWater(tank,tank.length));
		}}