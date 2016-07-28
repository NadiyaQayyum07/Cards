public class Card{
	private int cardValue; 
	private String cardSuit;
	private String stringValue;
	static final String[] SUIT = {"Clubs", "Diamonds", "Hearts", "Spades", "Joker"}; 
	static final String[] PIP =  {"Ace","Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"}; 



	public Card (int cardS, int cardV){

    		cardSuit = SUIT[cardS]; 
    		stringValue = VALUE[cardV];
	}


	public String getCardSuit(){
        	return cardSuit;
	}


	public String getValue(){
    		return stringValue;
	}

	public String toString() { 
    		return String.format("%s of %s", stringValue, cardSuit); 
	} 

public int compare(Card otherCard) {       
        //compare card
        int cardDiff = card.compareToIgnoreCase(otherCard.card);
        if(cardDiff != 0){
            return cardDiff;
        }else{
		return 0;
		}
	}
public void acceptData(){
	Card card = new Card();
	
    }
  
}
/*
public int compareTo(Card card) {
    if (this.SUIT < card.SUIT) {
      return -1;
    } else if (this.SUIT > card.SUIT) {
      return 1;
    } else {
      // suit is identical: compare number
      if (this. < card.PIP) {
        return -1;
      } else if (this.PIP > card.PIP) {
        return 1;
      } else {
        return 0;
      }
    }
  }
}*?
