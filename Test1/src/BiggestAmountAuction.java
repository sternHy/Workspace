public class BiggestAmountAuction extends Auction {

    public BiggestAmountAuction(Seller s) {
        super(s);
    }

    @Override
    public int payment() {
        return getWinner().getMoney();
    }

}