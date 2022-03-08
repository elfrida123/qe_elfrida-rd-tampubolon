package PartB;

public class Problem5 {
    private static String ubahHuruf(String s){
        int a = 'A';
        int b = 'Z';
        char[] arr = s.toCharArray();
        int total = 0;
        for (char x : arr) {
            if (x >= a && x <= b) {
                int y = ((int) x + 10) % b;
                if (y < a && y != 0)
                    y += a - 1;
                else if (y == 0)
                    y = b;
                arr[total] = (char) y;
            } else
                arr[total] = x;
            total++;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        System.out.println(ubahHuruf("SEPULSA OKE"));
        System.out.println(ubahHuruf("ALTERRA ACADEMY"));
        System.out.println(ubahHuruf("INDONESIA"));
        System.out.println(ubahHuruf("GOLANG"));
        System.out.println(ubahHuruf("PROGRAMMER"));
    }
}

