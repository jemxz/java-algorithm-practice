/*
3. An integer number can be encoded as an array as follows. Each digit n of the number is represented by n
zeros followed by a 1. So the digit 5 is represented by 0, 0, 0, 0, 0, 1. The encodings of each digit of a
number are combined to form the encoding of the number. So the number 1234 is encoded as the array {0,
1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1}. The first 0, 1 is contributed by the digit 1, the next 0, 0, 1 is contributed
by the digit 2, and so on.
There is one other encoding rule: if the number is negative, the first element of the encoded array must be -
1, so -201 is encoded as {-1, 0, 0, 1, 1, 0, 1}. Note that the 0 digit is represented by no zeros, i.e. there are
two consecutive ones!
Write a method named decodeArray that takes an encoded array and decodes it to return the number.
*/

public class DecodeArray2 {
  public static void main(String[] args){
    int[] x = {1,1,0,1};
    System.out.println(f(x));
  }

  public static int f(int[] a){
    int total = 0;
    int place = 1;
    int signed = (a[0]==-1) ? 1 : 0 ;
    int counter = 0;
    for(int i=signed; i<a.length; i++){
      counter = 0;
      while((i+counter<a.length) && (a[i+counter]!=1)){
        counter++;
      }
      i += counter;
      total += place*counter;
      place *= 10;
    }
    if(signed == 1)
      return -1*total;
    return total;
  }
}
