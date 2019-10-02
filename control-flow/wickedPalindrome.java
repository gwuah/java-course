// Let it be known, that I am in no way associated to the algorithm below ;P
// I believe there's a better way, I just dont know many methods, so 
// this is my poor man's approach for checking for palindromes

class Main {
  public static void main(String[] args) {
    System.out.println(isPalindrome("qwertotrewq"));
    System.out.println(isPalindrome("gog"));
    System.out.println(isPalindrome("qwuer"));
  }

  public static boolean isPalindrome(String word) {
    String formatted = word.toLowerCase();
    int reverseIndex = 0;
    for (int i = formatted.length() - 1; i > 0; i--) {
      if (formatted.charAt(i) != formatted.charAt(reverseIndex)) {
        return false;
      }
      reverseIndex++;
    }
    
    return true;
  }
}