public class replaceSpaces {
    public static StringBuilder replaceSpaces(StringBuilder str) {
		// Write your code here.
		int n = str.length();
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<n; i++) {
			if(str.charAt(i) != ' ') {
				ans.append(str.charAt(i));
			}
			else {
				ans.append("@40");
			}
		}
		return ans;
	}
    // in-place solution, used GPT for this
    // not the best thing but kya karey
    public static StringBuilder replaceSpaces2(StringBuilder str) {
        int originalLength = str.length();
        // Count spaces in the relevant part of the string
        int spaceCount = 0;
        for (int i = 0; i < originalLength; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        // Calculate the new length of the StringBuilder
        int newLength = originalLength + spaceCount * 2;
        str.setLength(newLength);
        // Iterate backward from the end of the relevant part of the string
        int newIndex = newLength - 1;
        for (int i = originalLength - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                str.setCharAt(newIndex, '0');
                str.setCharAt(newIndex - 1, '4');
                str.setCharAt(newIndex - 2, '@');
                newIndex -= 3;
            } else {
                str.setCharAt(newIndex, ch);
                newIndex--;
            }
        }
        
        return str;
    }
    // gfg problem, can't be done in place as strings are immutable
    String modify(String S)
    {
        // your code here
        int n = S.length();
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<n; i++) {
			if(S.charAt(i) != ' ') {
				ans.append(S.charAt(i));
			}
		}
		return ans.toString();
    }
}
