package interviewcamp;

public class ReverseWordsInAString {
    
    public static String reverseString(String input) {
        if ( input == null || input.length() <=1) {
            return input;
        }
        String word = "", returnStr = "";
        for (int i = input.length()-1; i >= 0; i--) {
            if( input.charAt(i) != ' ' ) {
                word = input.charAt(i) + word;
            } else {
                returnStr = returnStr + word + input.charAt(i);
                word = "";
            }
        }
        return returnStr + word;
    }

    public static void main(String[] args) {
        System.out.println("null => " + reverseString(null));
        System.out.println("\"\" => " +reverseString(""));
        System.out.println("i => " + reverseString("i"));
        System.out.println("hello => " +reverseString("hello"));
        System.out.println("i live in a house => " + reverseString("i live in a house"));

    }
}
