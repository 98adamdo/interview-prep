class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = nums.clone();
        int start = nums.length - k;
        int end = 0;

        for(int i = 0; i < nums.length; i++) {
            if(start < nums.length) {
                nums[i] = temp[start];
                start++;
            }
            else {
                nums[i] = temp[end];
                end++;
            }
        }
    }
}