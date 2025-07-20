import java.util.List;

public abstract class Deck {
    protected int size;
    protected List<Card> cards;

    public Deck(List<Card> c) {
        cards = c;
        size = 0;
    }

    public void addAt(Card card, int at) {
        cards.add(at, card);
    }

    public Card pullFrom(int at) {
        return cards.remove(at);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public abstract void add(Card c);

    public abstract Card pull();
}
