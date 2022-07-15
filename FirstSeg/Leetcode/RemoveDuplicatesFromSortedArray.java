class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int i=0;
        while((count+i+1)!=nums.length)
        {
            if(nums[i]==nums[i+1])
            {
                
                for(int j=i+1;j<nums.length-1;j++)
                {
                    nums[j]=nums[j+1];
                }
                nums[nums.length-1]=nums[i+1];
                count++;
            }
            else
            {
                i++;
            }
        }
        System.out.println(count);
        return nums.length-count;
    }
}