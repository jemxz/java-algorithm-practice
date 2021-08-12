/*
2. One word is an anagram of another word if it is a rearrangement of all the letters of
the second word. For example, the character arrays {'s', 'i', 't'} and {'i', 't', 's'} represent
words that are anagrams of one another because "its" is a rearrangement of all the letters
of "sit" and vice versa. Write a function that accepts two character arrays and returns 1 if
they are anagrams of one another, otherwise it returns 0. For simplicity, if the two input
character arrays are equal, you may consider them to be anagrams.
*/

public class AnagramArrays {
  public static void main(String[] args){
    char[] x = {'p','o','l','l'};
    char[] y = {'l','o','o','p'};
    System.out.println(f(x,y));
  }

  public static int f(char[] a, char[] b){
    // special cases
    int lengthOfa = a.length;
    int lengthOfb = b.length;
    if(lengthOfa != lengthOfb)
      return 0;
    for(int i=0; i<lengthOfa; i++){
      int acount = 0;
      int bcount = 0;
      
      for(int j=0;j<lengthOfa;j++)
        if(a[i]==b[j]) acount++;
      
      for(int j=0; j<lengthOfb; j++)
        if(b[i]==a[j]) bcount++;

      if(acount!=bcount) return 0;

    }
    return 1;
  }
}
