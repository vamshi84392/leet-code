public class IntegerPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long reverse = 0, dummy = (long) x;
        while (x != 0) {
            reverse = (reverse*10) + (x % 10);
            x /= 10;
        }
        return reverse == dummy;
    }
    public static void main(String[] args) {
        IntegerPalindrome clazz = new IntegerPalindrome();
        System.out.println(clazz.isPalindrome(121));
    }
}