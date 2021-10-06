import java.util.HashMap;
import java.util.Map;

public class Anadrom {
    private static Anadrom anadrom;

    int changeToAnadrome(String word) {
        if(word == null || word.length() == 0) {
            return 0;
        }

        int[] count = new int[26];
        for(char ch : word.toCharArray()) {
            count[ch - 'a']++;
        }

        int oddCount = 0;
        for(int i=0; i<26; i++) {
            if(count[i] % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount - 1;

    }

    private int changeToAnadromeMap(String word) {
        if(word == null || word.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char ch : word.toCharArray()) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch).intValue()+1);
            } else {
                map.put(ch, 1);
            }
        }
        int result = 0;
        for(char ch: map.keySet()) {
            if (map.get(ch) % 2 != 0) {
                result++;
            }
        }
        if (result>0) {
            result--;
        }
        return result;
    }

    public static void main(String[] args) {
        anadrom = new Anadrom();
        System.out.println(anadrom.changeToAnadromeMap("tatoo"));
    }
}
