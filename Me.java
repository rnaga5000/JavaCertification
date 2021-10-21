package MyPack;
class You
{
	private int avg=35;

	public int getAvg() 
	{
		if(avg>75)
		{
			return avg;
		}
		else
		{
			return 0;			
		}

	}

	public void setAvg(int avg) {
		this.avg = avg;
	}
	
}
public class Me 
{

	public static void main(String[] args) 
	{
		You y=new You();
		y.setAvg(78);
		System.out.println("Average is "+y.getAvg());
	}

}
