/*

*/
import java.util.Arrays;
public class ComputeHMS {
  public static void main(String[] args){
    System.out.println(Arrays.toString(f(0)));
  }

  public static int[] f(int t){
    int mph = 60;
    int spm = 60;
    int hour = t/(mph*spm);
    int min = (t-hour*mph*spm)/spm;
    int sec = t-(hour*mph*spm + min*spm);
    int[] time = {hour, min, sec};
    return time;
  }
}
