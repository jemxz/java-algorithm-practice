/*

*/

public class Square {
  public static void main(String[] args){
    System.out.println(f(0));
  }

  public static int f(int n){
    for(int i=0; i<=n;i++){
      if(i*i==n)
        return 1;
      if(i*i>n)
        break;
    }
    return 0;
  }
}
