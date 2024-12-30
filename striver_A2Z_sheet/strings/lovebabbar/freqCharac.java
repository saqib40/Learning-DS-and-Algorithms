import java.util.HashMap;

public class freqCharac {
    // method 1; using nested loops
    // method 2; using hashmap
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int n = line.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            char ch = line.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            }
            else {
                map.put(ch, 1);
            }
        }
        // now print your hashmap
        int maxFreq = 1;
        char ans = line.charAt(0);
        for(HashMap.Entry<Character,Integer> y : map.entrySet()) {
            //System.out.println(y.getKey() + " " + y.getValue());
            if(y.getValue() > maxFreq) {
                maxFreq = y.getValue();
                ans = y.getKey();
            }
            if (y.getValue() == maxFreq) {
                if(y.getKey() < ans) {
                    ans = y.getKey();
                }
            }
        }
        return ans;
    }
}
