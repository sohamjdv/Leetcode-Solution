#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        unordered_map<int,int>um;
        for(int i:nums){
            um[i]++;
        }
        int num;
        for(int i: nums){
            if(um[i]>nums.size()/2){
                num= i;
                break;
            }
        }
        return num;
    }
};