// Leetcode 912 sort an array
class Solution{
    public int[] sortArray(int[] nums){
        if(nums.length == 1){
            return nums;
        }
        int mid = nums.length/2;
        int[] left = sortArray(Arrays.copyOfRange(nums, 0, mid));
        int[] right =sortArray(Arrays.copyOfRange(nums, mid, nums.length));
        return merge(left, right);
    }
    public int[] merge(int[] l, int[] r){
        int ans[] = new int[l.length+r.length];
        int i=0, j=0, k=0;
        while(i<l.length && j<r.length){
            if(l[i]<r[j]){
                ans[k]=l[i];
                i++;
                k++;
            }else{
                ans[k]=r[j];
                j++;
                k++;
            }
        }
        while(i<l.length){
            ans[k]=l[i];
            i++;
            k++;
        }
        while(j<r.length){
            ans[k]=r[j];
            j++;
            k++;
        }
        return ans;
    }
}