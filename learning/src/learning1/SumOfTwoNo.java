package learning1;

public class SumOfTwoNo {

	public static void main(String[] args) {
		
		int a=10;
		int b=10;
		System.out.println("sum of a and b="+ (a+b));
		
		int arr[];
		arr = new int[10];
		
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=i;
			arr[i]=i*10;
		}
		
		System.out.println("sum of 1st ten number = "+ sum);
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.print("  "+ (arr[i]));
		}
		
		
		

	}

}


