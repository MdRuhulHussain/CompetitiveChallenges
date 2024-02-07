package challenges.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you and order 
 * one at a time (in the order specified by bills). Each customer will only buy one lemonade and pay with 
 * either a $5, $10, or $20 bill. You must provide the correct change to each customer so that the net 
 * transaction is that the customer pays $5.
 * Note that you do not have any change in hand at first.
 * Given an integer array bills where bills[i] is the bill the ith customer pays, return true if you can 
 * provide every customer with the correct change, or false otherwise.
 * Example1 : Input: bills = [5,5,5,10,20]; Output: true
 * Explanation: From the first 3 customers, we collect three $5 bills in order. From the fourth customer, we 
 * collect a $10 bill and give back a $5. From the fifth customer, we give a $10 bill and a $5 bill.
 * Since all customers got correct change, we output true.
 * Example2 : Input: bills = [5,5,10,10,20]; Output: false
 * Explanation: From the first two customers in order, we collect two $5 bills. For the next two customers in 
 * order, we collect a $10 bill and give back a $5 bill. For the last customer, we can not give the change of 
 * $15 back because we only have two $10 bills.
 * Since not every customer received the correct change, the answer is false.
 */
public class LemonadeChange {
	
	public static void main(String args[]) {
		int[] bills = {5,5,5,10,20};
//		int[] bills = {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5}
		
		System.out.println(lemonadeChange(bills));
	}
	
	public static boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> billsFreq = new HashMap<>();
        billsFreq.put(5, 0);
        billsFreq.put(10,0);
        billsFreq.put(20,0);
        for(int bill : bills){
            if(bill==5){
                billsFreq.put(5, billsFreq.get(5)+1);
                continue;
            } else if(bill==10){
                if(billsFreq.get(5)==0)
                    return false;
                billsFreq.put(5, billsFreq.get(5)-1);
            } else {
                if(billsFreq.get(10)>0 && billsFreq.get(5)>0){
                    billsFreq.put(5, billsFreq.get(5)-1);
                    billsFreq.put(10, billsFreq.get(10)-1);
                } else if(billsFreq.get(5)>2){
                    billsFreq.put(5, billsFreq.get(5)-3);
                } else
                    return false;
            }
            billsFreq.put(bill, billsFreq.get(bill)+1);
        }
        return true;
    }

}
