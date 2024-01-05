package challenges.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * You are given a 0-indexed 2D integer array nums representing the coordinates of the cars parking on a 
 * number line. For any index i, nums[i] = [starti, endi] where starti is the starting point of the ith car 
 * and endi is the ending point of the ith car.
 * Return the number of integer points on the line that are covered with any part of a car.
 * Example, Input : nums = {{3,6},{1,5},{4,7}}. Outpt = 7. (3 to 6, 1 to 5, 4 to 7) take intersection
 */
public class PointsIntersectedByCars {
	
	public static void main(String args[]) {
		//{{3,6},{1,5},{4,7},{3,9},{12,16}};
		List<List<Integer>> nums = new ArrayList<>();
		List<Integer> a = Arrays.asList(3,6);
		nums.add(a);
		a = Arrays.asList(1,5);
		nums.add(a);
		a = Arrays.asList(4,7);
		nums.add(a);
		a = Arrays.asList(3,9);
		nums.add(a);
		a = Arrays.asList(12,16);
		nums.add(a);
		System.out.println(numberOfPoints(nums));
		
	}
	
	public static int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> mySet = new HashSet<>();
        int coveredPoints = 0;
        for(int i=0;i<nums.size();i++){
            for(int j=nums.get(i).get(0);j<=nums.get(i).get(1);j++){
                if(!mySet.contains(j)){
                    mySet.add(j);
                    coveredPoints++;
                }
            }
        }
        return coveredPoints;
    }

}
