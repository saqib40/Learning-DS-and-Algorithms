public class patternKK {
    // triangle 1
    // iteratively
    void printTI(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    // recursively
    void printTR(int r, int c) {
        if(r==0) {
            return;
        }
        if(c<r) {
            printTR(r, c+1);
            System.out.print("* ");
        } else {
            printTR(r-1, 0);
            System.out.println("");
        }
    }
    void printTR(int n) {
        printTR(n,0);
    }
    // triangle 2
    void printTR2(int r, int c) {
        if(r==0) {
            return;
        }
        if(c<r) {
            System.out.print("* ");
            printTR(r, c+1);
        } else {
            System.out.println("");
            printTR(r-1, 0);
        }
    }
    void printTR2(int n) {
        printTR(n,0);
    }
}
