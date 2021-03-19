/*

Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
*/

public String mixString(String a, String b) {
  String longer = "";
  String shorter = "";
  String together = "";
  int diff = a.length() - b.length();
  if(diff>0){
    longer = a;
    shorter = b;
  }
  else{
    longer = b;
    shorter = a;
  }
  
  for(int i=0; i<shorter.length(); i++){
    together += a.charAt(i);
    together += b.charAt(i);
  }
  for(int i=shorter.length(); i<longer.length(); i++)
    together += longer.charAt(i);

  return together;
}
