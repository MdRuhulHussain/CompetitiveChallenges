package challenges.leetcode.easy;

/*
 * A vehicle having mileage of 10 km/ltrs, has two tanks - mainTank and additionalTank
 * for every 5 litre of fuel consumption from mainTank, 1 litre (if available) from additional
 * tank is transferred immediately to mainTank. Calculate total distance travelled by the 
 * vehicle for the given fuel in mainTank and additional tank.
 * example : mainTank = 5 , additional tank = 10 . then the output will be => 60 kms
 * 5-5+1 => 6*10
 */
public class TotalDistanceTravelled {

	public static void main(String[] args) {
		System.out.println(calTotalDistanceTravelled(9,2));
	}
	
	public static int calTotalDistanceTravelled(int mainTank, int additionalTank) {
		int fuelConsumed = 0;
        while(mainTank>=5){
            mainTank = mainTank-5;
            if(additionalTank>=1){
                mainTank++;
                additionalTank--;
            }
            fuelConsumed += 5;
        }
        fuelConsumed += mainTank;
        return fuelConsumed*10;
	}

}
