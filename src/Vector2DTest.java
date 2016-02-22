import org.junit.*;

/**
 * Created by Baths on 17.02.2016.
 */
public class Vector2DTest  {
    private static final double EPS = 1e-9;
    private static Vector2D simpleVector;
    private static Vector2D notSimpleVector;

    @Test
    public void defaultVectorShouldHaveZeroLength(){
        Vector2D v= new Vector2D();
        Assert.assertEquals(0, v.length(), EPS);
    }
    @Test
    public  void lengthOfVectorShouldWorkCorrect(){
        double length = Math.sqrt(notSimpleVector.getX()*notSimpleVector.getX()+
        notSimpleVector.getY()*notSimpleVector.getY());
        Assert.assertEquals(length, notSimpleVector.length(), EPS);
    }
    @Test
    public void firstParamOfConstructorShouldBeSavedInX(){
        Vector2D v = new Vector2D(3, 4);
        Assert.assertEquals(3, v.getX(), EPS);

    }
    @Test
    public void secondParamOfConstructorShouldBeSavedInY(){
        Vector2D v = new Vector2D(3, 4);
        Assert.assertEquals(4, v.getY(), EPS);

    }
    @Test
    public void firstParamAdditionShouildWorkCorrect(){
        Vector2D v = new Vector2D(3, 4);
        Vector2D v2 = new Vector2D(3, 4);
        Assert.assertEquals(6, v.add(v2).getX(), EPS);

    }
    @Test
    public void secondParamAdditionShouildWorkCorrect(){
        Vector2D v = new Vector2D(3, 4);
        Vector2D v2 = new Vector2D(3, 4);
        Assert.assertEquals(8, v.add(v2).getY(), EPS);
    }
    @Test(expected = NullPointerException.class)
    public  void checkNull(){
        Vector2D v= null;
        v.length();
    }
//    если не успеваете пофиксить
//    заходят 1-2 раза(заказчики)
//    договориться с заказчиком
    @Ignore
    @Test(timeout = 100)
    public void checkTimeOut(){
        while (true);
    }

    @Test
    public void checkIf5()
    {
//        Vector2D v = new Vector2D();
//        если условие не выполняется не проходит тест
        Assume.assumeTrue(simpleVector.getX()== 0);
    }
    @BeforeClass
    public static void  beforeClass(){
        System.out.println("BEFORE CLASS");
        simpleVector = new Vector2D();
        notSimpleVector = new Vector2D(3,4);
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AFTER");
    }
    @Before
    public void before(){
        System.out.println("before each");
    }
    @After
    public void after(){
        System.out.println("after");
    }

}
