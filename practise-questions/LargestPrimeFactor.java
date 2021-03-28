/*
1. Write a function named largestPrimeFactor that will return the largest prime factor of a number. If the
number is <=1 it should return 0. Recall that a prime number is a number > 1 that is divisible only by 1 and
itself, e.g., 13 is prime but 14 is not.
*/

public class LargestPrimeFactor {
  public static void main(String[] args){
    System.out.println(f(6936));
  }

  public static int f(int num){
    boolean found = false;
    int factor = num;
    if(num <= 1)
      return 0;
    while(true){
      if(factor == 2)
        return factor;
      for(int i=2; i<factor; i++){
        if(i==factor-1){
          return factor;
        }
        if(factor%i ==0){
          factor=factor/i;
          break;
        }
      }
    }
  }
}
