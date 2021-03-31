/*
2. A positive, non-zero number n is a factorial prime if it is equal to factorial(n) + 1 for some n and it is
prime.
*/

public class FactorialPrime {
  public static void main(String[] args){
    System.out.println(f(9));
  }

  public static int f(int n){
    // special cases
    if(n==2)
      return 1;
    if(n<2)
      return 0;
    // check if its a factorial of a number
    int c = 1;
    int p = 1;
    while(p<n){
      p *= c;
      if(p+1>n)
        return 0;
      if(p+1==n)
        break;
      c++;
    }
    // check if its a prime
    for(int i=2; i<n;i++)
      if(n%i==0)
        return 0;

    return 1;
  }
}
