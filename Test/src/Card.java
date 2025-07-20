public class Card implements Comparable<Card> {
    private int value;
    private char suit;

    public Card(int value, char suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Card c) {
        if (c == null)
            return -1;
        return value - c.value;
    }
}
