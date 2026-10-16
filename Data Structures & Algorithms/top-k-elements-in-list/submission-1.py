class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        if not nums:
            return []

        freMap = {} 

        for num in nums:
            if num in freMap:
                freMap[num] += 1 
            else:
                freMap[num] = 1
        top_k = sorted(freMap, key=freMap.get, reverse=True)[:k]

        return top_k