class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left=1,right=piles[0],mid=0;

        for(int i =1;i<piles.length;i++){
            if(piles[i]>right){
                right=piles[i];
            }
        }
        while(left<right){
            mid=(left+right)/2;
            int cur_sum =0;
            for(int i=0;i<piles.length;i++){
                cur_sum += (piles[i] + mid - 1) / mid;
            }
            //System.out.println(cur_sum);
            if(cur_sum<=h){
                right=mid;
            }
            else{
                left=mid+1;
            }
            //ystem.out.println(left + " " + right);
        }
        return left;
    }
}