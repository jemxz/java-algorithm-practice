/*
2. A number n>0 is called cube-powerful if it is equal to the sum of the cubes of its digits.
Write a function named isCubePowerful that returns 1 if its argument is cube-powerful; otherwise it
returns 0.
*/
public class CubePowerful {
  public static void main(String[] args){
    System.out.println(f(370));
  }

  public static int f(int a){
    int r = a;
    int sum = 0;
    int temp = 0;
    if(a<=0)
      return 0;
    while(true){
      temp = r%10;
      sum += temp*temp*temp;
      r = r/10;
      if(r == 0)
        return (sum==a) ? 1 : 0;
    }
  }
}
