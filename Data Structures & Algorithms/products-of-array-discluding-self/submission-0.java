class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size=nums.length;
        int mul;
        int[] result=new int[size];
        for(int i=0;i<size;i++){
            mul=1;
            for(int j=0;j<size;j++){
                if(i==j){
                    continue;
                }
                mul=mul*nums[j];
            }
result[i]=mul;
        }

        return result;
    }
}  
