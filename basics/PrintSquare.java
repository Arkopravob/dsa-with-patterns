public class PrintSquare {
    public static void solve(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
        }
        System.out.println();


    }

    public static void main(String[] args) {
        int n = 5;
        solve(n);

    }
}
