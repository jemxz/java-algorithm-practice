/*

Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.


repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
*/
public String repeatSeparator(String word, String sep, int count) {
  String ret = "";
  if(count == 0) return ret;
  for(int i=0; i<count-1; i++){
    ret += word;
    ret += sep;
  }
  ret += word;
  return ret;
}
