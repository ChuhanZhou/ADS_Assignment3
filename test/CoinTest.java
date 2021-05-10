import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinTest
{private static ArrayList<Coin> coinList;
  private final int value=10;
  Coin coin=Coin.getCoin(1);

  @Test
  public void getValue(){
    assertEquals(value,coin.getValue());
  }
  @Test
  public void getCoinsForMinNum(){
    int totalValue=1;
    UtopiasCoins utopiasCoins=new UtopiasCoins(totalValue);
    int numberOfCoin=1;
    ArrayList<CoinBag> coinBagList = new ArrayList<>();
    assertEquals(coin.getCoinsForMinNum(totalValue,utopiasCoins,numberOfCoin),coinBagList);
  }
}
