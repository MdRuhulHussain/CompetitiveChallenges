package challenges.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * given an integer n, produce an output as 1-indexed array/list of string, as per below rule
 *  arr[i] = "FizzBuzz" if i is divided by 3 and 5, "Fizz" if i is divided by 3, "Buzz" if
 *  i is divided by 5 and i if i is divided by neither 3 nor 5
 */
public class FizzBuzz {

	public static void main(String[] args) {
		List<String> res = fizzBuzz(15);
		res.forEach(x -> System.out.print(x+" "));
	}
	
	public static List<String> fizzBuzz(int n){
		List<String> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%15==0)
                li.add("FizzBuzz");
            else if(i%3==0)
                li.add("Fizz");
            else if(i%5==0)
                li.add("Buzz");
            else
                li.add(""+i);
        }
        return li;
	}

}
