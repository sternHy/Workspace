public class WarGame {
    Deck p1Deck, p2Deck;

    public void shuffle() {
        char[] c = { 'c', 'd', 'h', 's' };
        for (char i : c) {
            for (int j = 1; j < 14; j++) {
                if (Math.round(Math.random()) == 1) {
                    p1Deck.add(new Card(j, i));
                } else {
                    p2Deck.add(new Card(j, i));
                }
            }
        }
    }

    public void start() {
        shuffle();
        while (!p1Deck.isEmpty() || !p2Deck.isEmpty()) {
            
        }
    }

}
