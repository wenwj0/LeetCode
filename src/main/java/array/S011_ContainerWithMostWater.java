package array;

public class S011_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int ans = 0;
        while(left<right){
            int h = Math.min(height[left],height[right]);
            ans = Math.max(ans,h * (right - left)) ;
            while(left<right && height[left]<=h)
                left++;
            while(left<right && height[right]<=h)
                right--;
        }
        return ans;
    }
    public int maxArea0(int[] height) {
        int left = 0;
        int right = height.length -1;
        int ans = 0;
        while(left<right){
            ans = Math.max(ans,Math.min(height[left],height[right]) * (right - left)) ;
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return ans;
    }
}
