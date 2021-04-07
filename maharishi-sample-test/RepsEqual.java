/*
2. An array can hold the digits of a number. For example the digits of the number 32053 are
stored in the array {3, 2, 0, 5, 3}. Write a method call repsEqual that takes an array and an
integer and returns 1 if the array contains only the digits of the number in the same order that
they appear in the number. Otherwise it returns 0.
*/

public class RepsEqual {
  public static void main(String[] args){
    System.out.println(f(new int[] {3,2,0,5,3},32053));
  }


  public static int f(int[] a, int n) {
    // Special cases
    int p = 1;
    for(int i=a.length-1; i>=0; i--){
      if(a[i] != (n/p)%10)
        return 0;
      p *= 10;
    }

    return 1;
  }

}
