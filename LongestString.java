package abc;

	import java.util.*;

	public class LongestString {
	    public int lengthOfLongestSubstring(String s) {
	        Set<Character> set = new HashSet<>();
	        int left = 0, maxLen = 0;

	        for (int right = 0; right < s.length(); right++) {
	            while (set.contains(s.charAt(right))) {
	                set.remove(s.charAt(left++));
	            }
	            set.add(s.charAt(right));
	            maxLen = Math.max(maxLen, right - left + 1);
	        }
	        return maxLen;
	    }

	    public static void main(String[] args) {
	        LongestSubstring obj = new LongestSubstring();
	        System.out.println(obj.lengthOfLongestSubstring("abcabcbb")); 
	    }
	}
