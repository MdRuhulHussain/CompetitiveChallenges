package challenges.hackerRank.easy;

public class TimeConversion {
	
	public static void main(String args[]) {
		String time = "07:00:00PM";
		System.out.println(timeConversion(time));
	}
	
	public static String timeConversion(String s) {
	    // Write your code here
	        int hr = Integer.parseInt(s.substring(0,2));
	        String unchangedTime = s.substring(2,8);
	        boolean isPm = s.charAt(s.length()-2)=='P'?true:false;
	        String convertedTime = "";
	        if(isPm){
	            if(hr<12)
	                convertedTime = (hr+12)+unchangedTime;
	            else
	                convertedTime = hr+unchangedTime;
	        } else {
	            if(hr==12)
	                convertedTime = "00"+unchangedTime;
	            else
	                convertedTime = "0"+hr+unchangedTime;
	        }
	        return convertedTime;
	        
	    }

}
