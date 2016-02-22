import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Baths on 17.02.2016.
 */
public class Vector2D {
    private double x;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    private double y;

    public Vector2D() {
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }
    public Vector2D add(Vector2D v2){
        return new Vector2D(x+v2.getX(), y+v2.getY());
    }
}
