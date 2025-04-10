class Solution {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);    
        int dist_val = 0;
        
        for (int num : arr1) {
            if (isnotInRange(arr2, num - d, num + d)) {
                dist_val++;
            }
        }    
        
        return dist_val;
    }
    

    private static boolean isnotInRange(int[] arr, int min, int max) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= min && arr[mid] <= max) {
                return false;
            } else if (arr[mid] < min) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return true;
    }
}