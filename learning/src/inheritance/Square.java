package inheritance;

public class Square extends Shape{

	public Square(int len, int bre) {
		super(len, bre);
		
	}
	
	int a=0;
	
	public void isSquare()
	{
		if(getLen()==getBre())
		{
			System.out.println("******This is square*******");
			a+=1;
			
		}
		else
		{
			System.out.println("******This is not square*********");
		}
		
	}
	
	public int getAreaOfSquare() 
	{  if(a!=0)
		{
			return(4*getLen());
		}
		else
		{
			return(0);
		}
		
	}
	
	
	

}
