package model;

import java.util.ArrayList;
import java.util.List;

public class CardManager {

    private CardManager() {
        cards = new ArrayList<Card>();
        cards.add(new Card(1, "1st Card Name", "1st card description"));
        cards.add(new Card(2, "2nd Card Name", "2nd card description"));
        cards.add(new Card(3, "3rd Card Name", "3rd card description"));

    }

    private List<Card> cards;
    private static CardManager instance;

    public static CardManager getInstance() {
        if (instance == null) {
            instance = new CardManager();
        }

        return instance;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

}
