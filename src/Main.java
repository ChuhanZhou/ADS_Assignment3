import nQueensProblem.Board;
import nQueensProblem.NQueens;
import utopiasCoins.CoinBag;
import utopiasCoins.UtopiasCoins;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NQueens nQueens = new NQueens(8);
        ArrayList<Board> solution = nQueens.getSolution();
        for (int x=0;x<solution.size();x++)
        {
            solution.get(x).printBoard();
        }
        System.out.println("Number of solution:"+solution.size()+"\n");

        UtopiasCoins utopiasCoins = new UtopiasCoins(124);
        ArrayList<CoinBag> solutionList = utopiasCoins.getSolution();
        for (int x=0;x<solutionList.size();x++)
        {
            System.out.println(solutionList.get(x).toString());
        }
    }
}
