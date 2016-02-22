import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Baths on 17.02.2016.
 */
public class RFTest {
    private static final double EPS = 1e-9;

//    @Test
//    public void firstParamOfConstructorShouldBeSavedInX(){
//        RF rf= new RF(1, 2);
//        Assert.assertEquals(1, );
//    }
    @Test(expected = ArithmeticException.class)
    public void nNotZero(){
        RF rf= new RF(3, 0);
    }





}
