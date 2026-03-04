package batch49;

public class FibopnacciDP {
    static int fib(int n) {
        int fi[] = new int[n+2];
        int i;
        fi[0] = 0;
        fi[1] = 1;
        
        for (i = 2; i <= n; i++) {
            fi[i] = fi[i - 1 ]+ fi[i - 2];
        }
        return fi[n];
    }
    public static void main(String[] args) {
        int N = 10;
        
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " , ");
        }
    }
}
