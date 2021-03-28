/*
2. A number is called digit-increasing if it is equal to n + nn + nnn + ... for some digit n between 1 and 9.
For example 24 is digit-increasing because it equals 2 + 22 (here n = 2)
Write a function called isDigitIncreasing that returns 1 if its argument is digit-increasing otherwise, it
returns 0.
*/

public class DigitalIncreasing {
  public static void main(String[] args){
    System.out.println(f(36));
  }

  public static int f(int x){
    String strdig = "";
    String strall = "";
    int sum = 0;
    for(int i=1;i<10;i++){
      strdig = String.valueOf(i);
      strall = strdig;
      sum = 0;
      while(true){
        sum += Integer.parseInt(strall);
        strall += strdig;
        if(sum==x)
          return 1;
        if(sum>x)
          break;
      }
    }
    return 0;
  }
}
