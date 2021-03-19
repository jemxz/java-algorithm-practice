/*
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.


endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
*/
public boolean endOther(String a, String b) {
  String longer = "";
  String shorter = "";
  if(a.length()>b.length()){
    longer = a.toLowerCase();
    shorter = b.toLowerCase();
  }
  else{
    longer = b.toLowerCase();
    shorter = a.toLowerCase();
  }
  
  boolean found = true;
  int diff = longer.length()-shorter.length();
  for(int i=0; i<shorter.length(); i++){
    if(shorter.charAt(i) != longer.charAt(diff+i)){
      found = false;
    }
  }
  
  return found;
    
}
