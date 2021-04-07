/*
1. Write a function named primeCount with signature
int primeCount(int start, int end);
The function returns the number of primes between start and end inclusive. Recall that a prime is
a positive integer greater than 1 whose only integer factors are 1 and itself.
*/

public class PrimeCount {
  public static void main(String[] args){
    System.out.println(f(10,30));
    System.out.println(f(11,29));
    System.out.println(f(20,22));
    System.out.println(f(1,1));
    System.out.println(f(5,5));
    System.out.println(f(6,2));
    System.out.println(f(-10,6));
  }


  public static int f(int start, int end) {
    // Special cases
    int count = 0;
    for(int i=start; i<= end; i++){
      if(i==2)
        count++;
      for(int j=2; j<i; j++){
        if(i%j==0)
          break;
        if(j==i-1)
          count++;
      }
    }
    return count;
  }
}
