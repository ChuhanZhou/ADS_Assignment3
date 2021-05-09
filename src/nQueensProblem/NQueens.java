package nQueensProblem;

import java.util.ArrayList;

public class NQueens {

    private int numberOfQueen;

    public NQueens(int numberOfQueen)
    {
        this.numberOfQueen = numberOfQueen;
    }

    public ArrayList<Board> getSolution()
    {
        ArrayList<Board> solution = new ArrayList<>();

        Board board = new Board(numberOfQueen);
        Point point = board.getZeroPoint();
        for (int x=0;x<numberOfQueen;x++)
        {
            while (true)
            {
                ArrayList<Point> queenList = board.getQueenPointList();
                board.setQueen(point);
                for (int i=0;i<queenList.size();i++)
                {
                    if (Queen.canAttack(queenList.get(i),point))
                    {
                        board.removeQueen(point);
                        break;
                    }
                }
                if (board.getQueenPointList().size()==queenList.size()+1)
                {
                    //This column has queen
                    break;
                }
                if (point.getTopPoint()!=null)
                {
                    point = point.getTopPoint();
                }
                else
                {
                    //To top;
                    break;
                }
            }

            if (board.getQueenPointList().size()!=x+1)
            {
                //This column doesn't have queen
                while (true)
                {
                    x-=1;
                    point = board.getQueenPointList().get(x);
                    board.removeQueen(point);
                    if (point.getX()==0&&point.getY()==numberOfQueen-1)
                    {
                        x = numberOfQueen;
                        break;
                    }
                    if (point.getTopPoint()!=null)
                    {
                        point = point.getTopPoint();
                        x-=1;
                        break;
                    }
                }
            }
            else
            {
                if (point.getRightPoint()!=null)
                {
                    //To next column
                    point = point.getRightPoint().getFarBottomPoint();
                }
                else
                {
                    solution.add(board.copy());
                    while (true)
                    {
                        point = board.getQueenPointList().get(x);
                        board.removeQueen(point);
                        if (point.getX()==0&&point.getY()==numberOfQueen-1)
                        {
                            x = numberOfQueen;
                            break;
                        }
                        x-=1;
                        if (point.getTopPoint()!=null)
                        {
                            point = point.getTopPoint();
                            break;
                        }
                    }
                }
            }
        }
        return solution;
    }
}
