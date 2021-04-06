/*
9. A twin prime is a prime number that differs from another prime number by 2. Write a
function named isTwinPrime with an integer parameter that returns 1 if the parameter is
a twin prime, otherwise it returns 0. Recall that a prime number is a number with no
factors other than 1 and itself.
*/

public class TwinPrime {
  public static void main(String[] args){
    System.out.println(f(53));
  }

  public static int f(int n){
    boolean primePlus = false;
    boolean primeMinus = false;
    // Check if n is prime, return 0 if not a prime
    for(int i=2; i<n; i++)
      if(n%i==0)
        return 0;

    // check if prime-2 is prime, return 1 if its a prime
    for(int i=2; i<n-2; i++){
      if((n-2)%i==0)
        break;
      else if(i==n-3)
        return 1;
    }

    // check if prime+2 is prime, return 1 if its a prime
    for(int i=2; i<n+2; i++){
      if((n+2)%i==0)
        break;
      else if(i==n+1)
        return 1;
    }

    return 0;

  }
}
