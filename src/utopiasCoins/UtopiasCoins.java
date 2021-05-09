package utopiasCoins;

import java.util.ArrayList;

public class UtopiasCoins {
    private int totalValue;
    private int minNumOfCoin = -1;
    private ArrayList<CoinBag> solutionList;

    public UtopiasCoins(int totalValue)
    {
        this.totalValue = totalValue;
    }

    public int getMinNumOfCoin() {
        return minNumOfCoin;
    }

    public void updateMinNumOfCoin(int num)
    {
        if (num<minNumOfCoin||minNumOfCoin==-1)
        {
            minNumOfCoin = num;
            solutionList.clear();
        }
    }

    public ArrayList<CoinBag> getSolution()
    {
        solutionList = new ArrayList<>();
        for (int x=0;;x++)
        {
            if (Coin.getCoin(x)!=null)
            {
                ArrayList<CoinBag> returnSolutionList = Coin.getCoin(x).getCoinsForMinNum(totalValue,this,0);
                for (int i=0;i<returnSolutionList.size();i++)
                {
                    if (minNumOfCoin==-1)
                    {
                        minNumOfCoin = returnSolutionList.get(i).getNumOfCoin();
                    }
                    if (returnSolutionList.get(i).getNumOfCoin()==minNumOfCoin)
                    {
                        if (!solutionList.contains(returnSolutionList.get(i)))
                        {
                            solutionList.add(returnSolutionList.get(i));
                        }
                    }
                    else if (returnSolutionList.get(i).getNumOfCoin()<minNumOfCoin)
                    {
                        updateMinNumOfCoin(returnSolutionList.get(i).getNumOfCoin());
                        solutionList.add(returnSolutionList.get(i));
                    }
                }
            }
            else
            {
                break;
            }
        }
        return solutionList;
    }
}
