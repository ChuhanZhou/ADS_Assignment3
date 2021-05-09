package utopiasCoins;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CoinBag {
    private Map<Coin, Integer> coinNumMap;

    public CoinBag()
    {
        coinNumMap = new HashMap<>();
        for (int x=0;;x++)
        {
            if (Coin.getCoin(x)!=null)
            {
                coinNumMap.put(Coin.getCoin(x),0);
            }
            else
            {
                break;
            }
        }
    }

    public void addCoin(Coin coin)
    {
        int num = coinNumMap.get(coin)+1;
        coinNumMap.put(coin,num);
    }

    public void addCoin(Coin coin,int num)
    {
        int numOfBag = coinNumMap.get(coin);
        coinNumMap.put(coin,numOfBag+num);
    }

    public int getNumOfCoin()
    {
        int num = 0;
        for (int x=0;;x++)
        {
            if (Coin.getCoin(x)!=null)
            {
                num += coinNumMap.get(Coin.getCoin(x));
            }
            else
            {
                break;
            }
        }
        return num;
    }

    @Override
    public String toString() {
        String toString = "";
        int totalValue = 0;
        for (int x=0;;x++)
        {
            if (Coin.getCoin(x)!=null)
            {
                toString += Coin.getCoin(x).toString()+" Num:"+coinNumMap.get(Coin.getCoin(x))+"\n";
                totalValue += coinNumMap.get(Coin.getCoin(x)) * Coin.getCoin(x).getValue();
            }
            else
            {
                break;
            }
        }
        return "Total value:" + totalValue + "\nNumber of coin:" + getNumOfCoin() +"\n" + toString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoinBag coinBag = (CoinBag) o;
        return Objects.equals(toString(), coinBag.toString());
    }

    public CoinBag copy()
    {
        CoinBag copy = new CoinBag();
        for (int x=0;;x++)
        {
            if (Coin.getCoin(x)!=null)
            {
                int num = coinNumMap.get(Coin.getCoin(x));
                copy.addCoin(Coin.getCoin(x),num);
            }
            else
            {
                break;
            }
        }
        return copy;
    }
}
