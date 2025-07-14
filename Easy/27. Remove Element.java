class Solution {
    public int removeElement(int[] nums, int val) {
       //this taken bcz we need to do in-place swape
        int k = 0;
        for(int i=0;i<nums.length;i++){
            //val la equal nasel tar k pude kara nahitr k tasach theva
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
