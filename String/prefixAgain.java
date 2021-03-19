/*

Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().


prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
*/

public boolean prefixAgain(String str, int n) {
  String pre = "";
  boolean found = true;
  for(int i=0; i<n; i++)
    pre += str.charAt(i);
  for(int i=n;i<=str.length()-n;i++){
    found = true;
    for(int j=0;j<n;j++){
      if(str.charAt(i+j) != pre.charAt(j)){
        found = false;
        break;
      }
    }
    if(found)
      return true;
  }
  return false;
}
