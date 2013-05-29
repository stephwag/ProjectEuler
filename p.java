import java.io.*;
class p 
{

 
 public static void main(String args[])
  {
  
	  int[] currentSums = null;
	  String[] nextLineToSum = null;
	  int[] nextLineToSumInts = null;
	  int[] nextLineToSumIntsOrig = null;
	  try{

	  FileInputStream fstream = new FileInputStream("triangle2.txt");
	  DataInputStream in = new DataInputStream(fstream);
	  BufferedReader br = new BufferedReader(new InputStreamReader(in));
	  String strLine;

	  while ((strLine = br.readLine()) != null && strLine != null)   {

		  //System.out.println (strLine); //get the current triangle string
		  
		  if (currentSums == null)
		  {
			currentSums = new int[1];
			currentSums[0] = Integer.parseInt(strLine);
		  }
		  else
		  {
		    nextLineToSum = strLine.split(" ");
			nextLineToSumInts = new int[nextLineToSum.length];
			nextLineToSumIntsOrig = new int[nextLineToSum.length];
			for(int i = 0; i < nextLineToSum.length; i++)
			{
				nextLineToSumIntsOrig[i] = Integer.parseInt(nextLineToSum[i]);
				nextLineToSumInts[i] = Integer.parseInt(nextLineToSum[i]);
			}
			
			for(int i = 0; i < currentSums.length; i++)
			{
				//i and i + 1 of currentSum index
				//System.out.print(currentSums[i] + " ");
				if((currentSums[i] + nextLineToSumIntsOrig[i]) > nextLineToSumInts[i])
				{
					nextLineToSumInts[i] = currentSums[i] + nextLineToSumIntsOrig[i];
				}
				if((currentSums[i] + nextLineToSumIntsOrig[i+1]) > nextLineToSumInts[i+1])
				{
					nextLineToSumInts[i+1] = currentSums[i] + nextLineToSumIntsOrig[i+1];
				}
					
			}
			//System.out.println();
			currentSums = nextLineToSumInts;
			
		  }
		  } //end while
  
    in.close();
	int max = 0;
	for(int i = 0; i < currentSums.length; i++)
	{
	if(currentSums[i] > max)
	max = currentSums[i];
	}
System.out.println(max);

  //for(int i = 0; i < currentSums.length; i++)
 // System.out.println(currentSums[i]);
  
  
    }catch (Exception e){
  System.err.println("Error: " + e.getMessage());
  e.printStackTrace();
  }
  }
}