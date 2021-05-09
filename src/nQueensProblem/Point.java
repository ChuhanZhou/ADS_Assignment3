package nQueensProblem;

import java.util.HashMap;
import java.util.Map;

public class Point {
    private static Map<String, Point> pointMap = new HashMap<>();
    private int x;
    private int y;

    public static Point getPoint(int x, int y) {
        if (pointMap.containsKey(x + "," + y)) {
            return pointMap.get(x + "," + y);
        } else {
            return new Point(x, y);
        }
    }

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
        pointMap.put(toString(), this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point getRightPoint() {
        return pointMap.get((x + 1) + "," + y);
    }

    public Point getTopPoint() {
        return pointMap.get(x + "," + (y + 1));
    }

    public Point getLeftPoint() {
        return pointMap.get((x - 1) + "," + y);
    }

    public Point getBottomPoint() {
        return pointMap.get(x + "," + (y - 1));
    }

    public Point getFarRightPoint() {
        if(getRightPoint()!=null)
        {
            return getRightPoint().getFarRightPoint();
        }
        return this;
    }

    public Point getFarTopPoint() {
        if(getTopPoint()!=null)
        {
            return getTopPoint().getFarTopPoint();
        }
        return this;
    }

    public Point getFarLeftPoint() {
        if(getLeftPoint()!=null)
        {
            return getLeftPoint().getFarLeftPoint();
        }
        return this;
    }

    public Point getFarBottomPoint() {
        if(getBottomPoint()!=null)
        {
            return getBottomPoint().getFarBottomPoint();
        }
        return this;
    }

    @Override
    public String toString() {
        return x+","+y;
    }
}
