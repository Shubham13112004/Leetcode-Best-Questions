

class Solution {
            public int majorityElement(int[] nums) {
            int repeat=0;
            int count=0;

            for(int i=0;i<nums.length;i++){
                if(count==0){
                    repeat=nums[i];
                }
                if(repeat==nums[i]){
                    count++;
                }
                else{
                    count--;
                }
            }
           return repeat;
                    
                }
            }
    
