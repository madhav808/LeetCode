class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> a;
        bool found = false;
        for(int i =0; i < nums.size(); i++){
            for(int j =0; j < nums.size(); j++){
                if(i != j){
                    if(nums[i]+nums[j] == target){
                        a.push_back(i);
                        a.push_back(j);
                        found = true;
                        break;
                    }
                }
            }
            if(found){
                break;
            }
        }
        return a;
    }
};