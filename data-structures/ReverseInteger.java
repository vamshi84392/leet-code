public class ReverseInteger {
    private static ReverseInteger reverseInteger;

    public int reverse(int x) {
        long result = 0;
        
        while(x !=0){
            result = (result * 10) + (x % 10);
            x /= 10;
        }
        return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0:(int)result;
    }

    public static void main(String[] args) {
        reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(-3124));
    }
}
