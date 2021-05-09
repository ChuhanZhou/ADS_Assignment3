package nQueensProblem;

import java.util.*;

public class Board {
    private Point zeroPoint;
    private ArrayList<Point> queenPointList;

    public Board(int n)
    {
        queenPointList = new ArrayList<>();
        zeroPoint = Point.getPoint(0,0);
        for (int x=0;x<n;x++)
        {
            for (int y=0;y<n;y++)
            {
                Point.getPoint(x,y);
            }
        }
    }

    private Board(Point zeroPoint,ArrayList<Point> queenPointMap)
    {
        this.zeroPoint = zeroPoint;
        this.queenPointList = queenPointMap;
    }

    public Point getZeroPoint() {
        return zeroPoint;
    }

    public void clear()
    {
        queenPointList.clear();
    }

    public void setQueen(Point point)
    {
        if (!queenPointList.contains(point)&&point!=null)
        {
            queenPointList.add(point);
        }
    }

    public void removeQueen(Point point)
    {
        queenPointList.remove(point);
    }

    public void setQueen(ArrayList<Point> pointMap)
    {
        queenPointList = pointMap;
    }

    public ArrayList<Point> getQueenPointList()
    {
        return copy().queenPointList;
    }

    public void printBoard()
    {
        String print = "";
        Point firstOfLine = zeroPoint;
        while (firstOfLine.getTopPoint()!=null)
        {
            firstOfLine = firstOfLine.getTopPoint();
        }
        Point printPrint = firstOfLine;
        while (true)
        {
            if (firstOfLine!=null)
            {
                if (printPrint!=null)
                {
                    if (queenPointList.contains(printPrint))
                    {
                        print += "■ ";
                    }
                    else
                    {
                        print += "□ ";
                    }
                    printPrint = printPrint.getRightPoint();
                }
                else
                {
                    print += "\n";
                    firstOfLine = firstOfLine.getBottomPoint();
                    printPrint = firstOfLine;
                }
            }
            else
            {
                break;
            }
        }
        System.out.println(print);
    }

    public Board copy()
    {
        ArrayList<Point> copyMap = new ArrayList<>();
        for (int x = 0; x< queenPointList.size(); x++)
        {
            copyMap.add(queenPointList.get(x));
        }
        Board copy = new Board(zeroPoint,copyMap);
        return copy;
    }
}
