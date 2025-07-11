import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int j = 0;
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // while(map.containsKey(ch)) {
            // map.remove(s.charAt(j));
            // j++;
            // }
            if (map.containsKey(ch)) {
                j = Math.max(j, map.get(ch) + 1);
            }
            length = Math.max(length, i - j + 1);
            map.put(ch, i);
        }
        return length;
    }
}

public class LongestSubstringWithoutRepeatingCharacters {

}
