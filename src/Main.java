import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//import javax.xml.transform.Result;

/**
 * Created by Baths on 17.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Result rs = JUnitCore.runClasses(RF.class);
        for (Failure f: rs.getFailures()){
            System.out.println("Failure");
        }
    }
}
