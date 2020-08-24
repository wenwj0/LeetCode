class Solution:
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
        k = 1
        i = 1
        while i < len(nums):
            if nums[i] != nums[i-1]:
                nums[k] = nums[i]
                k += 1
            i += 1
        return k