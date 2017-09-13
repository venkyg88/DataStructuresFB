/***
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
***/

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i],1);
            } else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        int majorityElement = 0;
        int maxValueInMap = Collections.max(map.values());
        if (maxValueInMap > (nums.length /2)) {
            
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if (entry.getValue() == maxValueInMap) {
                   majorityElement = entry.getKey();
                }
            }
        }
        return majorityElement;
    }
}
