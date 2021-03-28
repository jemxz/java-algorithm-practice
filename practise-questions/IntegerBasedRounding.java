/*
1. Define the n-based integer rounding of an integer k to be the nearest multiple of n to k. If two multiples
of n are equidistant use the greater one. For example
the 4-based rounding of 5 is 4 because 5 is closer to 4 than it is to 8,
the 5-based rounding of 5 is 5 because 5 is closer to 5 that it is to 10,
the 4-based rounding of 6 is 8 because 6 is equidistant from 4 and 8, so the greater one is used,
the 13-based rounding of 9 is 13, because 9 is closer to 13 than it is to 0,
Write a function named doIntegerBasedRounding that takes an integer array and rounds all its positive
elements using n-based integer rounding.
*/
import java.util.Arrays;

public class IntegerBasedRounding {
  public static void main(String[] args){
    int[] x = {-18, 1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(f(x,4)));
  }

  public static int[] f(int[] nums, int mul){
    if(mul<=0)
      return nums;
    int num = 0;
    int[] app = new int[nums.length];
    for(int i=0; i<nums.length; i++){
      num = nums[i];
      int ratio = num/mul;
      if(num<0)
        app[i] = num;
      else if((num-mul*ratio)<(mul*(ratio+1)-num))
        app[i] = mul*ratio;
      else
        app[i] = mul*(ratio+1);
    }
    return app;
  }
}
