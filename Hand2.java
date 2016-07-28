/**
 * Created by butesa on 7/28/2016.
 */

package classWork.playingCards.PlayingCards;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {

    List<Card> cards;

    public Hand(List<Card> cards) {
        this.cards = cards;
    }

    public String getHandName(List<Card> cards){

        Collections.sort(cards);

        for(Card card: cards) {
            System.out.println(card.getPip()+" "+card.getSuit());
        }

        if(isRoyalFlush(cards))
            return "Royal Flush";
        else if(isStraightFlush(cards))
            return "Straight Flush";
        else if(isFourOfAKind(cards))
            return "Four of A Kind";
        else if(isFullHouse(cards))
            return "Full House";
        else if(isFlush(cards))
            return "Flush";
        else if(isStraight(cards))
            return "Straight";
        else if(isThreeOfAKind(cards))
            return "Three of a Kind";
        else if(isTwoPair(cards))
            return "Two Pair";
        else
            return highCard(cards);
    }

    private boolean isFullHouse(List<Card> cards) {
        return false;
    }

    private boolean isFlush(List<Card> cards) {
        return false;
    }

    private boolean isStraight(List<Card> cards) {
        return false;
    }

    private boolean isThreeOfAKind(List<Card> cards) {
        return false;
    }

    private boolean isTwoPair(List<Card> cards) {
        return false;
    }

    private String highCard(List<Card> cards) {
        return null;
    }

    private boolean isFourOfAKind(List<Card> cards) {
        return false;
    }

    private boolean isStraightFlush(List<Card> cards) {
        return false;
    }

    private boolean isRoyalFlush(List<Card> cards) {

        ArrayList<Integer> cardsPip = new ArrayList<>();
        int sameSuitCount = getCountOfSameSuit(cards);

        for(Card card: cards)
            cardsPip.add(card.getPip());

        if(cardsPip.contains(1) && cardsPip.contains(10) && cardsPip.contains(11)
                && cardsPip.contains(12) && cardsPip.contains(13) && sameSuitCount >= 5 && )
            return true;
        else
            return false;
    }

    private int getCountOfSameSuit(List<Card> cards) {
        return 0;
    }

}
