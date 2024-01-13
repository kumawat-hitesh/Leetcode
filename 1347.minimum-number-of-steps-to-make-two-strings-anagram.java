/*
 * @lc app=leetcode id=1347 lang=java
 *
 * [1347] Minimum Number of Steps to Make Two Strings Anagram
 */

// @lc code=start
import java.util.HashMap;

class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> sHash  = new HashMap<>();
        HashMap<Character, Integer> tHash  = new HashMap<>();
        HashMap<Character, Integer> allHash  = new HashMap<>();

        for (char ch : s.toCharArray()) 
            sHash.put(ch, sHash.getOrDefault(ch, 0) + 1);
        

        for (char ch : t.toCharArray()) 
            tHash.put(ch, tHash.getOrDefault(ch, 0) + 1);
        
        for (char ch : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            int sValue = sHash.getOrDefault(ch,0);
            int tValue = tHash.getOrDefault(ch,0);

            allHash.put(ch, Math.abs(sValue - tValue));
        }
        int sum = 0;
        for(int value : allHash.values()) {
            sum += value;
        }

        return sum / 2;
    }
}
// @lc code=end

