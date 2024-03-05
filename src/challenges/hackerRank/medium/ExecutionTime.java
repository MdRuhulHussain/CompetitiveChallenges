package challenges.hackerRank.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * There are n functions to be executed on a single-threaded CPU, with each function having a unique id between 0 and n-1.
 * Given an integer n, representing the number of functions to be executed, and an execution log as an array of strings, logs
 * of size m, determine the exclusive times of each of the functions. Exclusive time is the sum of execution times for all calls
 * to a function. Any string representing an execution log is of the form {function_id}:{"start"|"end"}:{timestamp}, indicating
 * that the function with ID = function_id, either starts or ends at a time identified by the timestamp value.
 * 
 * Note : while calculating the execution time of a function call, both the starting and ending times of the function call have to
 * be included. The log of the form {function_id}:{start}:{timestamp} means that the running function is preempted at the beginning
 * of timestamp second. The log of the form {function:id}:{end}:{timestamp} means that the function function_id is preempted after
 * completing its execution at timestamp second i.e after timestamp second.
 * 
 * Example : n=3, logs = ["0:start:0", "2:start:4", "2:end:5", "1:start:7", "1:end:10", "0:end:11"]
 * So, we can see the function 0th start at 0sec and was preempted by function 2nd at 4 sec. till now f0 = 4
 * Now at 4sec, f2 starts and ends at 5sec. so f2 = [4,5] => 2 secs
 * Now, f0 againg resumes and run till 7 secs when at 7 secs f0 preempted by f1 and f1 starts. f0 += [6,7) (i.e 4+1=5 secs)
 * Now, f1 ends at 10 secs so f1 = [7,10]=> 4
 * Now, f0 resumes at 11 and end at 11, so, f0 += [11,11] (i.e 5+1=6). 
 * Hence execution time of f0, f1 and f2 are 6, 4 and 2 seconds respectively.
 * Output = 6,4,2
 */
public class ExecutionTime {
	
	public static void main(String args[]) {
		int n=3;
		List<String> logs = new ArrayList<>();
		logs.add("0:start:0");
		logs.add("1:start:3");
		logs.add("1:end:6");
		logs.add("2:start:8");
		logs.add("2:end:10");
		logs.add("0:end:12");
		int timeTaken[] = getTotalExecutionTime(n, logs); // the output should be -. 6,4,3
		for(int time : timeTaken)
			System.out.print(time+" ");
	}
	
	public static int[] getTotalExecutionTime(int n, List<String> logs) {
		int[] exclusiveTimes = new int[n];
		Stack<Integer> stack = new Stack<>();
		int prevTime = 0;
		for(String log : logs) {
			String[] parts = log.split(":");
			int functionId = Integer.parseInt(parts[0]);
			String eventType = parts[1];
			int currentTime = Integer.parseInt(parts[2]);
			
			if(!stack.isEmpty()) {
				exclusiveTimes[stack.peek()] += currentTime - prevTime;
			}
			prevTime = currentTime;
			if(eventType.equals("start"))
				stack.push(functionId);
			else {
				exclusiveTimes[stack.pop()]++;
				prevTime++;
			}
		}
		return exclusiveTimes;
	}

}
