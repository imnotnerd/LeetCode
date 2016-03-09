import java.util.*;
public class ThreeSum {

	private List<List<Integer>> Solution(int[] nums){
		Arrays.sort(nums);		
		List<List<Integer>> res = new LinkedList<List<Integer>>();
	

		for(int i =0;i<nums.length-2;i++){
			if(i==0||(i>0&&nums[i]!=nums[i-1])){
				int lo = i+1, hi= nums.length-1,sum = 0 -nums[i];
				while(lo<hi){
					if(nums[lo] + nums[hi] ==sum){
						res.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
						while(lo<hi&&nums[lo] == nums[lo+1]) lo++;
						while(lo<hi&&nums[hi] == nums[hi-1]) hi--;
						lo++;hi--;
					}else if(nums[lo] + nums[hi] <sum){
						lo++;
					}else{
						hi--;
					}
				
					
				}
			}
		}
		return res;
		
		
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> c25f3a38f2d540a09976a5cf7ca4a00953c21414
