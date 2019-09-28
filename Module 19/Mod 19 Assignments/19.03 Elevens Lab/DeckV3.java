import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 *
 *
 *  < Nitin Ramadoss >
 *  < 04/14/19 >
 */
public class DeckV3 {

 /**
  * cards contains all the cards in the deck.
  */
 private List<CardV3> cards;

 /**
  * size is the number of not-yet-dealt cards.
  * Cards are dealt from the top (highest index) down.
  * The next card to be dealt is at size - 1.
  */
 private int size;
 private String[] ranks, suits;
 private int[] values; 

 /**
  * Creates a new <code>Deck</code> instance.<BR>
  * It pairs each element of ranks with each element of suits,
  * and produces one of the corresponding card.
  * @param ranks is an array containing all of the card ranks.
  * @param suits is an array containing all of the card suits.
  * @param values is an array containing all of the card point values.
  */
 public DeckV3(String[] ranks, String[] suits, int[] values) {
  this.ranks = ranks;
  this.suits = suits;
  this.values = values;
  cards = new ArrayList<CardV3>();
  for (int j = 0; j < ranks.length; j++) {
   for (String suitString : suits) {
    cards.add(new CardV3(ranks[j], suitString, values[j]));
   }
  }
  size = cards.size();
  shuffle();
 }


 /**
  * Determines if this deck is empty (no undealt cards).
  * @return true if this deck is empty, false otherwise.
  */
 public boolean isEmpty() {
  return size == 0;
 }

//Accessor method for the size of the undealt cards.
 public int size() {
  return size;
 }

 /**
  * Randomly permute the given collection of cards
  * and reset the size to represent the entire deck.
  */
 public void shuffle() {
  //Traverses array from the last position.
   for(int k = 1; k >= 0; k--) {
            int r = (int)(Math.random() * k);    //Randomizes within the array.
            int temp = this.values[r];
            values[r] = values[k];
            values[k] = temp;         //Replaces value at k with value of the temporary holder.
        }
 }

 /**
  * Deals a card from this deck.
  * @return the card just dealt, or null if all the cards have been
  *         previously dealt.
  */
 public CardV3 deal() {
  if (isEmpty()) {
   return null;
  }
  size--;
  CardV3 c = cards.get(size);
  return c;
 }

 /**
  * Generates and returns a string representation of this deck.
  * @return a string representation of this deck.
  */
 @Override
 public String toString() {
  String rtn = "size = " + size + "\nUndealt cards: \n";

  for (int k = size - 1; k >= 0; k--) {
   rtn = rtn + cards.get(k);
   if (k != 0) {
    rtn = rtn + ", ";
   }
   if ((size - k) % 2 == 0) {
    // Insert carriage returns so entire deck is visible on console.
    rtn = rtn + "\n";
   }
  }

  rtn = rtn + "\nDealt cards: \n";
  for (int k = cards.size() - 1; k >= size; k--) {
   rtn = rtn + cards.get(k);
   if (k != size) {
    rtn = rtn + ", ";
   }
   if ((k - cards.size()) % 2 == 0) {
    // Insert carriage returns so entire deck is visible on console.
    rtn = rtn + "\n";
   }
  }

  rtn = rtn + "\n";
  return rtn;
 }
}