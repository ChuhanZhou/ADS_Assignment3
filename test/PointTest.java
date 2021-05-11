

import nQueensProblem.Point;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    int x = 4;
    int y = 4;
    private Point point = Point.getPoint(x, y);

    @Test
    public void getPoint() {
        Point point1;
        point1 = Point.getPoint(x, y);
        assertEquals(point, point1);
    }

    @Test
    public void getX() {
        assertEquals(x, point.getX());
    }

    @Test
    public void getY() {
        assertEquals(y, point.getY());
    }

    @Test
    public void getRightPoint() {
        Point point1 = Point.getPoint(4, 4);
        assertEquals(point1.getRightPoint(), point.getRightPoint());
    }

    @Test
    public void getTopPoint() {
        Point point1 = Point.getPoint(4, 4);
        assertEquals(point1.getTopPoint(), point.getTopPoint());
    }

    @Test
    public void getLeftPoint() {
        Point point1 = Point.getPoint(4, 4);
        assertEquals(point1.getLeftPoint(), point.getLeftPoint());
    }

    @Test
    public void getBottomPoint() {
        Point point1 = Point.getPoint(4, 4);
        assertEquals(point1.getBottomPoint(), point.getBottomPoint());
    }

    @Test
    public void getFarRightPoint() {
        Point point1 = Point.getPoint(4, 4);
        ;
        assertEquals(point1.getFarRightPoint(), point.getFarRightPoint());
    }

    @Test
    public void getFarTopPoint() {
        Point point1 = Point.getPoint(4, 4);

        assertEquals(point1.getFarTopPoint(), point.getFarTopPoint());
    }

    @Test
    public void getFarLeftPoint() {
        Point point1 = Point.getPoint(4, 4);

        assertEquals(point1.getFarTopPoint(), point.getFarTopPoint());
    }

    @Test
    public void getFarBottomPoint() {
        Point point1 = Point.getPoint(4, 4);

        assertEquals(point1.getFarTopPoint(), point.getFarTopPoint());
    }

}
