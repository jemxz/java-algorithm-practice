/*
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.


xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
*/
public boolean xyzMiddle(String str) {
  if(str.length()<3) return false;
  int middle = 0;
  if(str.length()%2==1){
    middle = (str.length()-3)/2;
    if(str.charAt(middle)=='x' && str.charAt(middle+1)=='y' && str.charAt(middle+2)=='z')
      return true;
    else
      return false;
  }
  
  else {
    middle = (str.length()-3-1)/2;
    if(str.charAt(middle)=='x' && str.charAt(middle+1)=='y' && str.charAt(middle+2)=='z')
      return true;
    middle = (str.length()-3+1)/2;
    if(str.charAt(middle)=='x' && str.charAt(middle+1)=='y' && str.charAt(middle+2)=='z')
      return true;    
  }
  return false;
}
