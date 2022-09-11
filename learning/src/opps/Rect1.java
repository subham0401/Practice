package opps;

public class Rect1 {
	private int len;
	private int bre;
	
	
	
	
	// constructor 
	

	// getter and setter of square 
	public int getLen() 
	{
		return len;
	}
	public void setLen(int len) 
	{
		this.len = len;
	}
	public int getBre() 
	{
		return bre;
	}
	public void setBre(int bre) {
		this.bre = bre;
	}
	
	public int getArea()
	{
		return((len*bre));
	}
	
	public int getPerimetre()
	{
		return((2*(bre+len)));
	}
	
	
	
	

}
