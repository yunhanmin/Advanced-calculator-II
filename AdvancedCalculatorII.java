/*
 * Project: Advanced Calculator II
 * Description: An exploration into "While" loops with a calculator.
 * Name: Hanmin Yun
 * Date: Sept 16, 2015
 */

import java.util.Scanner;

public class AdvancedCalculatorII {
  
  public static void main( String[] args ) {
    
    // For loop
    int sum = 0, j;
    for ( j=3; j<=79; j++ ) {
     sum = sum + j; 
    }
    System.out.println( "For Sum = " + sum ); // 3157
    
    // For -> While loop
    int sum2 = 0,j2;
    j2 = 3;
    while ( j2<=79 ) {
     sum2 = sum2 + j2; 
     j2++;
    }
    
    // #5
    boolean done = false;
    int i = 10;
    while ( !done ) {
      if ( i < 1 ) {
       done = true;
       System.out.println( "done" );
       break;
      }
      i--;
      System.out.println( "i = " + i );
    }
    
    // #12-2
    int k = 0, boxer = 11;
    while( k<0 ) {
     k++;
     if( k != 5 ) {
      continue; // Skip back to the start of the loop
     }
     boxer = boxer + k; // Run this code when k == 5
    }
    System.out.println( "Boxer = " + boxer ); // 16
    
    // #13
    double m = 92.801;
    int l = 0;
    do  {
      l = l + 2; // 2, 4, 6X
      if ( l > 3 ) {
       continue; // Skip the m+=3
      }
      m += 3;
    } while ( l < 6 );
    System.out.println( "M = " + m );
  
  /*
   * Advanced Calculator II
   * Copy-paste the old calculator cod in,
   * Then using a WHILE loop, only exit if the User enters 'X'
   */

    Scanner s = new Scanner( System.in);
   
    String choice;
    char ch;
    double d1, d2;
    
    System.out.println( "Make your arithmetic choice below:\n" );
    System.out.println( "A. Addition\tS. Subtraction\tM. Multiplication\tD. Division\n" );
    
    choice = s.nextLine();
    ch = choice.charAt(0);
    // ch = Character.toLowerCase(ch);
    // System.out.println( ch );
    
    // if ( ch != 'a' || ch != 's' || ch != 'm' || ch != 'd' ) {
      // System.out.println( "Error. That's not a choice. Only choose A, S, M, or D.\n" );
    // } else {
    
      System.out.println( "Enter the first number: " );
      d1 = s.nextDouble();
      
      System.out.println( "Enter the second number: " );
      d2 = s.nextDouble();
      
      // swithch to choose which operand to use 
      switch ( ch ) {
        case 'A':
        case 'a':
          System.out.println( d1 + " + " + d2 + " = " + (d1+d2) );
          break;
        case 'S':
        case 's':
          System.out.println( d1 + " - " + d2 + " = " + (d1-d2) );
          break;
        case 'M':
        case 'm':
          System.out.println( d1 + " x " + d2 + " = " + (d1*d2) );
          break;
        case 'D':
        case 'd':
          System.out.println( d1 + " / " + d2 + " = " + (d1/d2) );
          break;
        default:
          System.out.println( "Error. That's not a choice. Only choose A, S, M, or D." );
      } // end of switch
      
  } // end main method
  
} // end class