import nQueensProblem.Board;
import nQueensProblem.NQueens;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NQueens nQueens = new NQueens(13);
        ArrayList<Board> solution = nQueens.getSolution();
        for (int x=0;x<solution.size();x++)
        {
            solution.get(x).printBoard();
        }
        System.out.println("Number of solution:"+solution.size());
    }
}
