import java.util.LinkedList;

public abstract class Auction {
    protected LinkedList<Buyer> buyers;
    protected Seller seller;

    public Auction(Seller s) {
        seller = s;
        buyers = new LinkedList<Buyer>();
    }

    public void add(Buyer b) {
        if (b == null)
            return;
        buyers.add(b);
    }

    public Buyer getWinner() {
        if (buyers.isEmpty())
            return null;
        Buyer res = buyers.getFirst();
        for (Buyer b : buyers)
            if (b.getMoney() > res.getMoney())
                res = b;
        return res;
    }

    public abstract int payment();
}
