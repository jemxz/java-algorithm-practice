/*
1. Write a function named largestAdjacentSum that iterates through an array computing the sum of
adjacent elements and returning the largest such sum. You may assume that the array has at least 2
elements.
*/

public class CheckContenatedSum {
  public static void main(String[] args){
    System.out.println(f(9,1));
  }

  public static int f(int a, int c){
    int sum = 0;
    String dig = "";
    String numstr = String.valueOf(a);
    for(int i=0; i<numstr.length(); i++){
      dig = "";
      for(int j=0; j<c; j++)
        dig += ""+numstr.charAt(i);
      sum += Integer.parseInt(dig);
    }
    if(sum == a)
      return 1;
    return 0;
  }
}
