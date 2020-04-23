public class Coin_08_11 {
    private static int waysToChange(int n) {
        int[][] l = new int[4][n+1];
        int[] c = {1,5,10,25};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= n; j++) {
                l[i][j] = 1;
            }
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j <= n; j++) {
                if(j < c[i]){
                    l[i][j] = l[i-1][j];
                }else {
                    l[i][j] = (l[i-1][j] + l[i][j-c[i]])%1000000007;
                }
            }
        }
        return l[3][n];
    }

    public static void main(String[] args) {
        int result = waysToChange(5);
        System.out.println(result);
    }
}
