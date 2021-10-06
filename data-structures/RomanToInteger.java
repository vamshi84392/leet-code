public class RomanToInteger {
    public int romanToInt(String s) {
        int ans = 0;
        for(int i = s.length() -1; i >= 0; i--) {
            int val = getIntegerVaule(s.charAt(i));
            if (4*val < ans) ans -= val;
            else ans+=val;
        }
        return ans;
    }

    private int getIntegerVaule(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;    
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            default: return 1000;
        }
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("XXIII"));
    }
}
