package twosum;

public class twosum {
 

	    public static void twoSum(int[] nums, int target) {
	    	int result=0; 
	        for(int i = 0; i<nums.length ;i++)
	        	{
	            for(int j=i+1; j<nums.length ;j++ )
	              {
	            	result = nums[i] + nums[j];
	            	if(result==target) {
	            	System.out.println( result);
	              }	            
	            }
	          }
	    }
		public static void main(String[] args) {
			int[] nums= {2,7,11,15};
			int target= 9;
			
			twoSum(nums, target);
		}
	        }
	


