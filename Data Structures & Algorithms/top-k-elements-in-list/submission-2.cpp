class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int, int> count;

        for(auto& num:nums) count[num]++;

        using P = pair<int, int>;

        priority_queue<P, vector<P>, greater<P>> heap;

        for(auto& entry: count){
            heap.push({entry.second,entry.first});
            if(heap.size() > k){
                heap.pop();
            }
        }

        vector<int> res;

        for(int i = 0; i < k; i++){
            res.push_back(heap.top().second);
            heap.pop();
        }

        return res;
    }
};
