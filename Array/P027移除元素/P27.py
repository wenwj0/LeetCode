class Solution:
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        j = 0
        lens = len(nums)
        for i in range(0,lens):
            if nums[i] != val:
                nums[j] = nums[i]
                j += 1
        return  j