import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NQueensTest
{
  private int numberOfQueen=2;
  NQueens nQueens=new NQueens(numberOfQueen);

  @Test
  public void getSolution(){
    ArrayList<Board> solution = new ArrayList<>();
    assertEquals(nQueens.getSolution(),solution);
  }
}
