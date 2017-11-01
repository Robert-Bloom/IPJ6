

public class LongestPalindromicSubsequence {

    public static void main(String[] args) {
        String phrase = args[0];
        phrase = phrase.replaceAll(" ", "");
        phrase = phrase.toLowerCase();
        String reverse = "";
        String phraseB ="";

        for(int i = 0; i < phrase.length()-1; i++)
        {

          String phraseA =  phrase.substring(i,phrase.length());

            reverse ="";
          for(int j = phraseA.length(); j > 0; j--)
          {
               reverse = reverse + phraseA.substring(j-1,j);

          }

          if(phraseA.equals(reverse)){
              if( phraseA.length() > phraseB.length())
              {
                  phraseB = phraseA;
              }
          }
        }
        if(phraseB.length() > 0) {
            System.out.print(phraseB + " is the longest palindrome");
        }
        else{
            System.out.print("there is no Palindrome");
        }
    }

}
