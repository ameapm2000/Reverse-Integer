
public class Solution {

	public static void main(String[] args) 
	{
		Solution s = new Solution();
		System.out.println(s.reverse(123));
		
	}
	
	public int reverse(int x) 
    {
	   boolean negative = false;
	   int sum=0;
       if(x<0)
       {
    	   x = x * -1;
    	   negative = true;
       }
       
       while(x>0)
       {
    	   sum = sum + x % 10;
    	   sum = sum * 10;
    	   x = x/10;
       }
       sum = sum / 10;
       if(negative)
    	   sum = sum * -1;
    
       return sum;
    }

}
