import java.util.ArrayList;

public class EndAboveDeck extends Deck {

    public EndAboveDeck() {
        super(new ArrayList<Card>(52));
    }

    @Override
    public void add(Card c) {
        if (size >= 52 || c == null)
            return;
        super.addAt(c, 0);
        size++;
    }

    @Override
    public Card pull() {
        return pullFrom(--size);
    }
}