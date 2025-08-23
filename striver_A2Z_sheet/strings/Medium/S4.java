public class S4 {
    public int myAtoi(String s) {
        // let's write for a simple one
        int ans = 0;
        for(int i=0; i<s.length(); i++) {
            int val = Character.getNumericValue(s.charAt(i));
            int exponent = (int) Math.pow(10,i);
            ans += (val*exponent);
        }
        return ans;
    }
}
