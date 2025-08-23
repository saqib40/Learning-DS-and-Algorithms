pub fn checkSorted(nums: Vec<i32>) -> bool {
    int n : usize = nums.len();
    for x in 0..n-1 {
        if nums[i] > nums[i+1] {
            return false;
        }
    }
    return true;
}