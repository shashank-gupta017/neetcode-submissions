class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> freqMapS = new HashMap<Character, Integer>();
        Map<Character, Integer> freqMapT = new HashMap<Character, Integer>();

        for(int i=0; i<s.length(); i++) {

            freqMapS.put(s.charAt(i), freqMapS.getOrDefault(s.charAt(i), 0) + 1);
            freqMapT.put(t.charAt(i), freqMapT.getOrDefault(t.charAt(i), 0) + 1);
        }

        return freqMapS.equals(freqMapT);
    }
}
