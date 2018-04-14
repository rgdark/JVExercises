class SumOfTwo {
    public static int[] twoSum(int[] nums, int target) {
        int i,j;
        int[] indices=new int[2];
        int count=nums.length;
        int z=0;
        //System.out.println(count);
        for(i=0;i<count && z!=1 ;i++)
        {
            //System.out.println(z);
            for(j=1;j<count;j++)
            {
                if(i!=j&&nums[i]+nums[j]==target)
                {
                    //System.out.println(i+"and"+j);
                    z=1;
                    indices[0]=i;
                    indices[1]=j;
                    break;
                }
            }
        }
        return indices;
    }
    public static void main(String args[])
    {
        int[] nums=new int[4];
        nums[0]=2;
        nums[1]=5;
        nums[2]=5;
        nums[3]=11;
        //nums[4]=5;
        //nums[5]=1;
        int target=10;
        int[] indices=twoSum(nums,target);

        System.out.println(indices[0]+","+indices[1]);
    }

}
