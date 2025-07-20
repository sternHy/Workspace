public class NoRepeatsRandomDeck extends RandomDeck {
    private Card preCard;

    @Override
    public Card pull() {
        if (size == 0) return null;
        int rnd = (int) (Math.random() * (size));
        while (cards.get(rnd).compareTo(preCard) == 0) {
            rnd = (int) (Math.random() * (size));
        }
        size--;
        return super.pullFrom(rnd);
    }
}
