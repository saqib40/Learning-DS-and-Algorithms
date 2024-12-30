public class S7 {
    // attempt 1
    public boolean isPalindrome1(String s) {
        int n = s.length();
        // make the string into lower case
        String sNew = s.toLowerCase();
        // remove what isn't alphabet
        StringBuilder original = new StringBuilder(n);
        for(int i=0; i<n; i++) {
            // a = 97 and z = 122
            if (sNew.charAt(i) >= 97 && sNew.charAt(i) <= 122 || sNew.charAt(i) >= 48 && sNew.charAt(i) <= 57) {
                original.append(sNew.charAt(i));
            }
        }
        System.out.println(original.toString());
        // now reverse the string
        int l = original.length();
        StringBuilder reversed = new StringBuilder(l);
        for(int i=l-1; i>=0; i--) {         
            reversed.append(original.charAt(i));
        }
        System.out.println(reversed.toString());
        if(reversed.toString().equals(original.toString())) {
            return true;
        }
        return false;
    }
    // attempt 2
    public boolean isPalindrome2(String s) {
        int n = s.length();
        // make the string into lower case
        String sNew = s.toLowerCase();
        // remove what isn't alphanumeric
        StringBuilder original = new StringBuilder(n);
        for(int i=0; i<n; i++) {
            // a = 97 and z = 122, 0 = 48 and 9 = 57
            if (sNew.charAt(i) >= 97 && sNew.charAt(i) <= 122 || sNew.charAt(i) >= 48 && sNew.charAt(i) <= 57) {
                original.append(sNew.charAt(i));
            }
        }
        int low = 0;
        int high = original.length()-1;
        while(low<=original.length()/2) {
            if(original.charAt(low) != original.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
