package utopiasCoins;

import java.util.ArrayList;

public class Coin {
    private static ArrayList<Coin> coinList;
    private final int value;

    public static Coin getCoin(int index) {
        if (coinList == null)
        {
            coinList = new ArrayList<>();
            int[] valueList = new int[]{22, 10, 7, 1};
            for (int x = 0; x < valueList.length; x++)
            {
                coinList.add(new Coin(valueList[x]));
            }
        }
        if (index >= 0 && index < coinList.size())
        {
            return coinList.get(index);
        }
        return null;
    }

    private Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ArrayList<CoinBag> getCoinsForMinNum(int totalValue,UtopiasCoins utopiasCoins,int numberOfCoin) {
        ArrayList<CoinBag> coinBagList = new ArrayList<>();
        if (totalValue >= value&&numberOfCoin<utopiasCoins.getMinNumOfCoin()||totalValue >= value&&utopiasCoins.getMinNumOfCoin()==-1)
        {
            for (int x = 0; x < coinList.size(); x++)
            {
                if (totalValue-value > 0)
                {
                    ArrayList<CoinBag> returnBagList = coinList.get(x).getCoinsForMinNum(totalValue - value,utopiasCoins,numberOfCoin+1);
                    for (int i=0;i<returnBagList.size();i++)
                    {
                        returnBagList.get(i).addCoin(this);
                        coinBagList.add(returnBagList.get(i));
                    }
                }
                else if (totalValue-value == 0)
                {
                    CoinBag coinBag = new CoinBag();
                    coinBag.addCoin(this);
                    coinBagList.add(coinBag);
                    utopiasCoins.updateMinNumOfCoin(numberOfCoin+1);
                    break;
                }
                else
                {
                    break;
                }
            }
        }
        return coinBagList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return value == coin.value;
    }

    @Override
    public String toString() {
        return "Coin:" + value;
    }
}
