use std::collections::*;

impl Solution {
    pub fn has_duplicate(nums: Vec<i32>) -> bool {
        let mut set : HashSet<i32> = HashSet::new();

        for i in 0..nums.len(){
            if set.contains(&nums[i]){
              return  true;
            }

            set.insert(nums[i]);
        }

        false
    }
}
