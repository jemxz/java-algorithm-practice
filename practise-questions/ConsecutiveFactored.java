/*
8. A positive number n is consecutive-factored if and only if it has factors, i and j where i
> 1, j > 1 and j = i + 1. Write a function named isConsecutiveFactored that returns 1 if
its argument is consecutive-factored, otherwise it returns 0.
*/

public class ConsecutiveFactored {
  public static void main(String[] args){
    System.out.println(f(3));
  }

  public static int f(int n){
    for(int i=2; i<n-1;i++)
      if((n%i==0) && (n%(1+i)==0))
        return 1;

    return 0;
  }
}
