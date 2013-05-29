import java.lang.*;
class p373
{
  public static long S(long r)
 {
	long sum = 0;
	long s = 0;
	double area = 0;
	double testRadius = 0;
	if (r == 1) return 0;
	
	long max = r * 2;
	long min = 1;
	
	for(long a = max; a >= min; a--)
	{
		for(long b = min; b <= a; b++)
		{
			//check for all c's
			for(long c = min; a + b > c && c <= b; c++)
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
	
	return sum + S(r - 1);
 }
 
 
 
 public static void main(String args[])
  {
	System.out.println(S(100));
	System.out.println("DONE");
   
   
   

  }
}