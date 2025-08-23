public class S2 {
    public int maxDepth(String s) {
        //int maxDep = Integer.MIN_VALUE;
        int maxDep = 0;
        int dep = 0;
        for(int i=0; i<s.length(); i++) {
            //if (s.charAt(i) != '(' && s.charAt(i) != ')') {
            //    continue;
            //}
            if(s.charAt(i) == '(') {
                dep++;
                maxDep = Math.max(dep, maxDep);
            }
            if(s.charAt(i) == ')') {
                dep--;
            }
        }
        //return (maxDep == Integer.MIN_VALUE) ? 0 : maxDep;
        return maxDep;
    }
}
