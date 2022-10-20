class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }
    
    public int binarySearch(int[] nums, int l, int r, int target){
        if(l <= r){
            int mid = l + (r - l)/2;
            if(nums[mid] == target){
                return mid;
            }if(nums[mid] < target){
                return binarySearch(nums, mid+1, r, target);
            }
            return binarySearch(nums, l, mid-1, target);
        }
        
        return -1;
    }
}
