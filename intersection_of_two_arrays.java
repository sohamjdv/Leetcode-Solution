
class Solution2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>set=new HashSet<>();
        Set<Integer>reSet=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i)){
                set.remove(i);
                reSet.add(i);
            }
        }
        int []res=new int [reSet.size()];
        int j=0;
        for(int i:reSet){
            res[j++]=i;
        }
        return res;
    }
}