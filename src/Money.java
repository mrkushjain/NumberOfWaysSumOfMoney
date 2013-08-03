/**
 * Created with IntelliJ IDEA.
 * User: kush
 * Date: 03/08/13
 * Time: 9:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class Money {
     private final double [] denominations  = {0.01,0.02,0.05,1,5,10,25,50};
     private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public int getNoOfWaysForExchange(double sum,int currentIndex){
        int numberOfWays=0;
        if(sum>amount)
            return 0;
        for(int i=currentIndex;i<denominations.length;i++){
            if(sum + denominations[i]<amount){
                numberOfWays += getNoOfWaysForExchange(sum + denominations[i],i);
            }
            else if(sum + denominations[i]==amount){
                numberOfWays++;
                return numberOfWays;
            }
         }
         return numberOfWays;
     }
}
