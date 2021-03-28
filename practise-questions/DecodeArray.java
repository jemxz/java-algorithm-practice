/*
3. A number can be encoded as an integer array as follows. The first element of the array is any number and
if it is negative then the encoded number is negative. Each digit of the number is the absolute value of the
difference of two adjacent elements of the array. The most significant digit of the number is the absolute
value of the difference of the first two elements of the array. For example, the array {2, -3, -2, 6, 9, 18}
encodes the number 51839
*/

public class DecodeArray {
  public static void main(String[] args){
    int[] x = {1, 5, 8, 17, 15};
    System.out.println(f(x));
  }

  public static int f(int[] a){
    int total = 0;
    int diff = 0;
    int p = 1;
    for(int i=a.length-1; i>0; i--){
      diff = a[i]-a[i-1];
      if(diff<0)
        total += -p*diff;
      else
        total += p*diff;
      p *= 10;
    }
    return (a[0]<0) ? -total: total;
  }
}
