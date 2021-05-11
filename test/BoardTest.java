import nQueensProblem.Board;
import nQueensProblem.Point;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
    Point zeroPoint = Point.getPoint(0, 0);
    Board board = new Board(3);

    @Test
    public void getZeroPoint() {
        assertEquals(board.getZeroPoint(), zeroPoint);
    }

    @Test
    public void clear() {
        Board board1 = new Board(3);
        board1.clear();
        board.clear();
        assertEquals(board1.getQueenPointList(), board.getQueenPointList());
    }

    @Test
    public void setQueen() {
        Point point = Point.getPoint(2, 2);
        board.setQueen(point);
        Board board1 = new Board(3);
        board1.setQueen(point);
        assertEquals(board1.getQueenPointList(), board.getQueenPointList());
    }

    @Test
    public void removeQueen() {
        Point point = Point.getPoint(1, 1);
        Point point1 = Point.getPoint(2, 2);
        Board board1 = new Board(3);
        board.setQueen(point);
        board.setQueen(point1);
        board.removeQueen(point);
        board1.setQueen(point);
        board1.setQueen(point1);
        board1.removeQueen(point);
        assertEquals(board1.getQueenPointList(), board.getQueenPointList());
    }

    @Test
    public void getQueenPointList() {
        Board board1 = new Board(3);
        Point point1 = Point.getPoint(1, 1);
        board.setQueen(point1);
        board1.setQueen(point1);
        assertEquals(board1.getQueenPointList(), board.getQueenPointList());
    }

    @Test
    public void printBoard() {
        Board board1 = new Board(3);
        board.printBoard();
        board1.printBoard();
    }

    @Test
    public void copy() {
        assertEquals(board.getQueenPointList(), board.copy().getQueenPointList());
    }
}
