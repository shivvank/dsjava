
class Program{
    public static void main(String[] args)
    {
        Solution s=new Solution();
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int k=s.removeDuplicates(nums);
        for(int i=0;i<k;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}