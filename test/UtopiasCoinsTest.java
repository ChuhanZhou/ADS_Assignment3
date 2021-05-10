import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtopiasCoinsTest
{int totalValue=2;
int minNumOfCoin=-1;
UtopiasCoins utopiasCoins=new UtopiasCoins(totalValue);


  @Test
  public void getMinNumOfCoin(){
  assertEquals(utopiasCoins.getMinNumOfCoin(),minNumOfCoin);
}
@Test
public void updateMinNumOfCoin(){

    int num=4;
    utopiasCoins.updateMinNumOfCoin(num);
    assertEquals(4,utopiasCoins.getMinNumOfCoin());
}
@Test
  public void getSolution(){
  UtopiasCoins utopiasCoins1=new UtopiasCoins(totalValue);
  assertEquals(utopiasCoins1.getSolution(),utopiasCoins.getSolution());
}
}
