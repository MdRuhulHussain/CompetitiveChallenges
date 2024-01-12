package challenges.leetcode.easy;

/*
 * https://leetcode.com/problems/number-of-employees-who-met-the-target/description/
 * There are n employees in a company, numbered from 0 to n - 1. Each employee i has worked for hours[i] 
 * hours in the company.The company requires each employee to work for at least target hours. You are given a 
 * 0-indexed array of non-negative integers hours of length n and a non-negative integer target.
 * Return the integer denoting the number of employees who worked at least target hours.
 * Example : Input: hours = [0,1,2,3,4], target = 2
 * Output = 3
 */
public class EmployeesTarget {
	
	public static void main(String args[]) {
		int[] hours = {5,1,8,4,13,2,2};
		int target = 6;
		System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
	}
	
	public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int hour : hours){
            if(hour >= target)
                count++;
        }
        return count;
    }

}
