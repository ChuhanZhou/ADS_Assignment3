package nQueensProblem;

public class Queen {
    public static boolean canAttack(Point queenPosition, Point point) {
        return queenPosition.getX() == point.getX() ||
                queenPosition.getY() == point.getY() ||
                (queenPosition.getX()-point.getX())*(queenPosition.getX()-point.getX()) == (queenPosition.getY()-point.getY())*(queenPosition.getY()-point.getY());

    }
}
