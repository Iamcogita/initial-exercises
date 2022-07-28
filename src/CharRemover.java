public class CharRemover {

    public static void main(String[] args) {
        String result = removeChar("lullaby", 1); // should return lllaby
    }

    // Implement a method that removes the character in a given index from a given String
    private static String removeChar(String str, int charIndex) {
        String result;
        String front = str.substring( 0 , charIndex );
        String back = str.substring(charIndex + 1);
        result = front + back;
        System.out.println(result);
        return result;
    }
}
