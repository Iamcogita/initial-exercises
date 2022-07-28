public class CharacterSwitcher {
    public static void main(String[] args) {
        String result = switchCharacters("cantaloupe"); // should return "eantaloupc"

    }
    // Implement a method that receives a string and switches the first and last characters of said string
    private static String switchCharacters(String str) {
       String result = str.charAt(str.length() - 1 ) + str.substring(1) + str.charAt(0) ;
       System.out.println(result);
       return result;
    }
}

