/*
Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).


repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"
*/

public String repeatFront(String str, int n) {
  String repeat = "";
  for(int i=0; i<n; i++)
    repeat += str.charAt(i);
  
  String total = "";  
  for(int i=n; i>0; i--){
    for(int j=0; j<i;j++)
      total += repeat.charAt(j);
  }
  
  return total;
}
