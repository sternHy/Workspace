public class SecondBiggestAmountAuction extends Auction {

    public SecondBiggestAmountAuction(Seller s) {
        super(s);
    }

    @Override
    public int payment() {
        Buyer winner = getWinner();
        int res = 0;
        for (Buyer b : buyers)
            if (b.getMoney() > res && b != winner)
                res = b.getMoney();
        return res;
    }

}