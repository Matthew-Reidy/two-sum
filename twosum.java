	    public static void twoSum(int[] nums, int target) 
	      {
	    	int result=0; 
	        for(int i = 0; i<nums.length ;i++)
	        	{
	            for(int j=0; j<nums.length ;j++ )
	              {
	            	result = nums[i] + nums[j];
	            	if(result==target) 
	            	{
	            	
	            	System.out.print(nums[i]);          	
	                }	            
	              }
	        	}

	    	}
		public static void main(String[] args) 
		{
			int[] nums= {2,15,11,7};
			int target= 9;
			
			twoSum(nums, target);
		}
	        }
	
