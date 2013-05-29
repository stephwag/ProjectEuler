import java.lang.*;
class p373list
{ 


public static long Sloop(long r)
{
	long sum = 0;
	long s = 0;
	double area = 0;
	double testRadius = 0;
	//if (r > 100) return 0;
	if (r == 0 || r == 1) return 0;
	
	for(int rr = 2; rr <= r; rr++)
	{
	
		long max = rr * 2;
		long min = 1;
		
		for(long a = max; a >= min; a--)
		{
			for(long b = min; b <= a; b++)
			{
				//check for all c's
				for(long c = min; a + b > c && c <= b; c++)
				{
					if((a + c > b) && (b + c > a) && ((a + b + c) % 2 == 0) && ((a * b * c) % 4 == 0))
					{
						//if((a + b + c) % 2 == 0)
						//{
							s = (a + b + c) / 2;
							area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
							testRadius = (a * b * c) / (4 * area);
							if(testRadius == rr)
							{
								System.out.println(a + "\t" + b + "\t" + c + "\t" + testRadius);
								sum = sum + rr;
							}
						
						//}
					
					}
				
				}
			
			}
		}
	
	}
	return sum;

}



  public static long S(long r, long prevr)
 {
	long sum = 0;
	long s = 0;
	double area = 0;
	double testRadius = 0;
	if (r > 100) return 0;
	if (r == 0 || r == 1) return 0 + S(r + 1, r);
	
	long max = r * 2;
	long min = 1;
	
	for(long a = max; a >= prevr; a--)
	{
		for(long b = min; b <= a; b=b*2)
		{
			//check for all c's
			for(long c = min; a + b > c && c <= b; c=c*4)
			{
				if((a + c > b) && (b + c > a))
				{
					if((a + b + c) % 2 == 0)
					{
						s = (a + b + c) / 2;
						area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
						testRadius = (a * b * c) / (4 * area);
						if(testRadius == r)
						{
							System.out.println(a + "\t" + b + "\t" + c + "\t" + testRadius);
							sum = sum + r;
						}
					
					}
				
				}
			
			}
		
		}
	}
	
	return sum + S(r + 1, r);
 }
 
 
 
 public static void main(String args[])
  {
	System.out.println(Sloop(10000000));
	System.out.println("DONE");
   
   
   

  }
}