class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        num=nums.sort()
        #n=nums.size()
        for i in range (1,len(nums)):
            if nums[i]==nums[i-1]:
                return True
        return False
         