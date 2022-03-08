package PartA;

public class Problem6 {
    private static boolean palindrome(String value){
        StringBuilder sb = new StringBuilder(value);
        sb.reverse();
        String rev=sb.toString();
        if (value.equals(rev)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic")); //true
        System.out.println(palindrome("katak")); //true
        System.out.println(palindrome("kasur rusak")); //true
        System.out.println(palindrome("kupu-kupu")); //false
        System.out.println(palindrome("lion")); //false
    }
}
