class Solution {
    public int maxArea(int[] height) {
        int low =0;
        int high = height.length-1;
        int max1=0;
        int sum=0;
        while(low<=high){
            sum=Math.min(height[low],height[high]);
            max1 =Math.max(max1,(sum*(high-low)));
         
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }

        }
        return max1;
        
    }
}