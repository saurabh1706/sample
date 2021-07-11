public class SubSequenceChecker {
  public static void main(String[] args) {
    String str1 = "code";
    String str2 = "cportde";
    boolean subSeqFlag = isSubSequenceFound(str1, str2);
    displayResult(str1, str2, subSeqFlag);
    
    str1 = "abc";
    str2 = "bsdafgc";
    subSeqFlag = isSubSequenceFound(str1, str2);
    displayResult(str1, str2, subSeqFlag);
    
    str1 = "knpcode";
    str2 = "isknoppconode";
    subSeqFlag = isSubSequenceFound(str1, str2);
    displayResult(str1, str2, subSeqFlag);

  }
	
  private static boolean isSubSequenceFound(String str1, String str2){
    int j = 0;
    for(int i = 0; i < str2.length(); i++){
      // If char found move to next char
      if(str1.charAt(j) == str2.charAt(i)){
        ++j;
      }
      // Equal means all the characters of str1 are
      // found in str2 in order
      if(j == str1.length()){
        return true;
      }
    }
    return false;
  }
	
  private static void displayResult(String str1, String str2, boolean flag) {
    if(flag)
      System.out.println(str1 + " is a subsequence of " + str2);
    else
      System.out.println(str1 + " is not a subsequence of " + str2);
  }
}