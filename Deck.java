public class Deck {
  private Card card;
  private int remainingCards = 52;

  DeckOfCards() {
    Card = new Card();   
  }

  public void shuffle(){
    for (int i = 0; i < deck.length; i++) {
       int index = (int)(Math.random() deck.length);
       int temp = deck[i];
       deck[i] = deck[index];
       deck[index] = temp;
       remainingCards--;
     }
  }

  public void deal(){
    for (int i = 0; i < 52; i++) {
       String suit = suits[deck[i] / 13];
       String rank = ranks[deck[i] % 13];
       System.out.println( rank + " of " + suit);
       System.out.println("Remaining cards: " + remainingCards);
     }
   }
}
