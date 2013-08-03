import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: kush
 * Date: 03/08/13
 * Time: 9:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class MoneyTest {

    @Test
    public void testOnePaisaChangeCanBeMadeInOneWays()
    {
         assertEquals(1,new Money(0.01).getNoOfWaysForExchange(0,0));
    }


    @Test
    public void testTwoPaisaChangeCanBeMadeInTwoWays()
    {
        assertEquals(2,new Money(0.02).getNoOfWaysForExchange(0,0));
    }

    @Test
    public void testFivePaisaChangeCanBeMadeInFourWays() throws Exception {
        assertEquals(4,new Money(0.05).getNoOfWaysForExchange(0,0));

    }
}
