/*
Write a method named
encodeNumber what will encode a number n as an array that contains the prime numbers that, when
multipled together, will equal n. So encodeNumber(6936) would return the array {2, 2, 2, 3, 17, 17}. If the
number is <= 1 the function should return null;
*/
import java.util.Arrays;

public class EncodeNumber {
  public static void main(String[] args){
    System.out.println(Arrays.toString(f(1)));
  }

  public static int[] f(int num){
    int size = 0;
    int fact = num;
    boolean over = false;
    if(num<=1)
      return null;
    while(!over){
      for(int i=2;i<fact; i++){
        if(i == fact-1){
          over = true;
          size++;
          break;
         }
        if(fact%i == 0){
          fact = fact/i;
          if(fact == 1)
            over = true;
          size++;
          break;
        }
      }
    }

    int[] factors = new int[size];
    int countdown = size;
    fact = num;
    while(countdown>0){
      for(int i=2;i<fact; i++){
        if(i == fact-1){
          factors[size-countdown] = fact;
          countdown--;
          break;
        }
        if(fact%i == 0){
          factors[size-countdown] = i;
          countdown--;
          fact = fact/i;
          break;
        }
      }
    }
    return factors;
  }
}
