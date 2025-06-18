public class RandomDeck {
    private Card[] cards;
    private int size;

    public RandomDeck() {
        cards = new Card[52];
        size = 0;
    }

    public void add(Card c) {
        if (size >= cards.length || c == null)
            return;
        int rnd = (int) (Math.random() * (size));
        for (int i = rnd; i < size - 1; i++) {
            Card tmp = cards[i + 1];
            cards[i + 1] = cards[i];
            cards[i + 2] = tmp;
        }
        cards[rnd] = c;
        size++;
    }

    public Card pull() {
        return cards[(int) (Math.random() * (size))];
    }

}
