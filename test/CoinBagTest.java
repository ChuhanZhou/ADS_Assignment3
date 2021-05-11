import org.junit.jupiter.api.Test;
import utopiasCoins.Coin;
import utopiasCoins.CoinBag;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinBagTest {
    CoinBag coinBag = new CoinBag();

    @Test
    public void addCoin() {
        Coin coin = Coin.getCoin(1);
        coinBag.addCoin(coin);
        CoinBag coinBag1 = new CoinBag();
        coinBag1.addCoin(coin);
        assertEquals(coinBag.toString(), coinBag1.toString());
    }

    @Test
    public void getNumOfCoin() {
        assertEquals(0, coinBag.getNumOfCoin());
    }

    @Test
    public void copy() {
        assertEquals(coinBag, coinBag.copy());
    }
}
