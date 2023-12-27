public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2); // Concatenation
        System.out.println("Concatenated string: " + str3);

        String str4 = "Hello World";
        String substr = str4.substring(6); // Substring
        System.out.println("Substring: " + substr);

        int len = str4.length(); // Length
        System.out.println("Length of string: " + len);

        String str5 = "Hello";
        String str6 = "World";
        int result = str5.compareTo(str6); // Comparing strings
        if (result < 0) {
            System.out.println("String 1 is less than String 2");
        } else if (result > 0) {
            System.out.println("String 1 is greater than String 2");
        } else {
            System.out.println("String 1 is equal to String 2");
        }
    }
}
