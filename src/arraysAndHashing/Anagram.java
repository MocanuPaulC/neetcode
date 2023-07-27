package arraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    boolean isAnagramMySolution(String s, String t){
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer> alphabet= new HashMap<>();
        for(int i = 0; i < s.length();i++){
            if(alphabet.containsKey(s.charAt(i))){
                alphabet.put(s.charAt(i),alphabet.get(s.charAt(i))+1);
            }
            else {
                alphabet.put(s.charAt(i),1);
            }
            if(alphabet.containsKey(t.charAt(i))){
                alphabet.put(t.charAt(i),alphabet.get(t.charAt(i))-1);
            }
            else {
                alphabet.put(t.charAt(i),-1);
            }
        }
        for (Map.Entry<Character, Integer> set :
                alphabet.entrySet()) {
            if(set.getValue()!=0)return false;
        }
        return true;
    }

    boolean isAnagramGoodSolution(String s, String t){
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
}
