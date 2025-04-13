class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sum =0;
        int l=0,r=nums.length-1;
        while(l<=r){
            if(l==r){
                sum+=nums[l];
            }
            else{
                int len = (int)(Math.floor(Math.log10(nums[r]))+1);
                //System.out.println(len);
                sum+=(nums[l]*(Math.pow(10,len)) + nums[r]); 
            }
            //System.out.println(sum);
            l++;
            r--;
        }
        return sum;
    }
}