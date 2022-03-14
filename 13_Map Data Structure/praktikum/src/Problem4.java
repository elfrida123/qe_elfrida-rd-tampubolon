public class Problem4 {
    public static void arrayUnique(int a[], int b[], int n, int m) {
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < m; j++)
                if (a[i] == b[j])
                    break;

            if (j == m)
                System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 3, 8 };
        int b[] = { 2, 8 };

        int n = a.length;
        int m = b.length;

        arrayUnique(a, b, n, m);
    }
}