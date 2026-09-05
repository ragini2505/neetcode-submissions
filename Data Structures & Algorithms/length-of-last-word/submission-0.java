class Solution {
    public int lengthOfLastWord(String s) {
        char[] arr = s.toCharArray();
        int i = arr.length - 1;
        while(i >= 0 && arr[i] == ' '){
            i--;
        }
        int length = 0;

        while (i >= 0 && arr[i] != ' ') {
            length++;
            i--;
        }
        return length;
    }
}