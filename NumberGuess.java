


import java.util.Scanner;
import java.util.Random;
public class NumberGuess 
{
public static void main(String args[])
{
    int max=100;
    int min=1;
    Random randomnumber = new Random();
    int a = min + randomnumber.nextInt(max);
    Scanner s=new Scanner(System.in);
    System.out.println("Number Guees game : ");
    System.out.println("enter the number : ");
    int number=s.nextInt();
    
    
    if(number==a)
    {
      System.out.println("Wow you win the game : you guess the right number : ");
    }

    else if(number>a)
    {
      System.out.println("your number is greater : sorry ");
    }
    else if(number<a)
    {
      System.out.println("your number is smaller : sorry");
    }

     System.out.println("Number is   : "+a);


    }

    
}
