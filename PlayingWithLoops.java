/*
 * Project: PlayingWithLoops.java
 * Description: Reviewing loops
 * Name: Hanmin Yun
 * Date: Sept 21, 2015
 */

import java.util.Scanner;

public class PlayingWithLoops {
  
  public static void main( String[] args ) {
    
    // #1 For loop (nested)
    System.out.println( "Nested for loop example:" );
    for ( int i = 0; i < 5; i++ ) { // 1. Start; 2. Control; 3. Step
      for ( int j = 0; j < 10; j++ ) {
       System.out.print( "*" ); // commands 
      }
      System.out.println();
    }
     System.out.println();
    // #2 While loop
    Scanner s = new Scanner( System.in );
    int total = 0, count = 0, number;
    double average;
    
    System.out.println( "Enter your grades to average them (-1 quits): " );
    number = s.nextInt(); // The first time only
    
    while ( number != -1 ) {
      total += number;
      count ++;
      
      System.out.println( "Enter your grades to average them (-1 quits): " );
      number = s.nextInt();
    }
    
    if ( count != 0) {
      average = (double) total/count;
      System.out.println( "Your GPA is: " + average );
    } else {
      System.out.println( "Nothing was entered." ); 
    }
    // #3 Assignment
    /*
     * 1. Promt the user for 2 ints
     * 2. Display all odd numbers between the ints
     * (Assume 2nd number is greater)
     * (HINT: Round even ints to odd, then use for loop)
     */
    
    System.out.println( "Give me a low number: " );
    int num1 = s.nextInt();
    
    System.out.println( "Give me a big number: ");
    int num2 = s.nextInt();
    
    for ( int q = num1; q < num2; q += 2) {
      System.out.println( q + "," );
    }
  } // end main method
  
} // end class