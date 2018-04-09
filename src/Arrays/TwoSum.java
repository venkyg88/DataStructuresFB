/**
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

**/

//If the array is un-sorted
public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
		    if (map.containsKey(numbers[i])) {
		        return new int[]{map.get(numbers[i]), i};
		    } else {
		        map.put(target - numbers[i], i);
		    }
		}
		return new int[]{0, 0};
	}
}

//if the array is sorted.

public class TwoSum4SortedArray{
	public int[] twoSum(int[] array, int target) {
		int a[] = new int[2];
		int i = 0;
		int j = array.length - 1;
		while(i < j) {
			if(array[i] + array[j] == target) {
				a[0] = i;
				a[1] = j;
				return a;
				break;
			}
			else if ( target - array[i] < array[j]){
				j--;
			}
			else {
				i++;
			}
		}
		return new arr[]{0,0}; //return zero or null when no target sum found.
	}
}
