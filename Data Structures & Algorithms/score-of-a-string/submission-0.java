class Solution {
    public int scoreOfString(String s) {
      int score = 0;
      int n = s.length();
      for(int i=0; i<n-1; i++){
        int currChar = s.charAt(i);
        int adjChar = s.charAt(i+1);

        int currVal = currChar;
        int adjVal = adjChar;

        int difference = Math.abs(adjVal - currVal);

        score = score + difference;
      }  
      return score;
    }
}