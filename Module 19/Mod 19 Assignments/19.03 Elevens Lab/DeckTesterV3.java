/**
 * This class provides a convenient way to test shuffling methods.
 *
 *
 *  < Nitin Ramadoss >
 *  < 04/14/19 >
 */

public class DeckTesterV3
{
   /**
    * The main method in this class checks the Deck operations for consistency.
    * @param args is not usemyDeck.
    */
   public static void main(String[] args)
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      /* Uncomment blocks of code to test the Deck class */

      
      String[] ranks1 = {"queen", "king"};
      String[] suit1 = {"red", "black"};
      int[] value1 = {9, 10};
      
      String[] ranks2 = {"two", "Ace"};
      String[] suit2 = {"spades", "hearts"};
      int[] value2 = {2, 1};
      
      
      DeckV3 myDeck = new DeckV3(ranks1,suit1,value1);
      DeckV3 myDeck2 = new DeckV3(ranks2,suit2,value2);

      System.out.println("**** Original Deck Methods ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After 1 Card Dealt ****");
      System.out.println("  toString:\n" );
      System.out.println("  isEmpty: " );
      System.out.println("  size: " );
      System.out.println();
      System.out.println();

      System.out.println("**** Deal Remaining 5 Cards ****");

      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After All Cards Dealt ****");
      System.out.println("  toString:\n" );
      System.out.println("  isEmpty: " );
      System.out.println("  size: "  );
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card From Empty Deck ****");
      System.out.println("  deal: " );
      System.out.println();
      System.out.println();


      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

       System.out.println("\n**** 52 Card Deck shuffle Tests ****");
       String[] ranks52 = {"ace"};
       String[] suits52 = {"spades"};
       int[] pointValues52 = {1};

       System.out.println("  The Starting Deck ");

       System.out.println("  The Deck After Dealing a Card" );

       System.out.println("  Shuffleing the Deck ");


   }
}