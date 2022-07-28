public class ReverseString {

    public static void main(String[] args) {
       String reversed = reverse("message to you");
       String reversedDec = reverseDecrement("message to you");
    }

    // Implement a method that receives a String and returns the same String reversed
    // NOTE: method is returning null because it has to return something and null is the default type of String
    private static String reverse(String strToReverse) {
        char charHolder ;
        String reversed = "";
        for (int i = 0; i < strToReverse.length() ; i++) {
            charHolder = strToReverse.charAt(i);
            reversed = charHolder + reversed ;
        }
        System.out.println(reversed);
        return reversed;
    }
    private static String reverseDecrement(String strToReverseDec){
        char charHolder ;
        String reversedDec = "";
        for (int i = strToReverseDec.length() - 1; i >= 0 ; i--) {
            charHolder = strToReverseDec.charAt(i);
            reversedDec = reversedDec + charHolder;
        }
        System.out.println(reversedDec);
        return reversedDec;
    }

}
