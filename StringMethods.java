public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";
        String str3 = new String("Java");

        // 1. equals()
        System.out.println("1. equals(): " + str1.equals(str2)); // false

        // 2. toUpperCase() and toLowerCase()
        System.out.println("2. toUpperCase(): " + str2.toUpperCase()); // JAVA
        System.out.println("   toLowerCase(): " + str1.toLowerCase()); // java

        // 3. intern()
        System.out.println("3. intern(): " + (str1 == str3.intern())); // true

        // 4. charAt()
        System.out.println("4. charAt(1): " + str1.charAt(1)); // 'a'

        // 5. indexOf()
        System.out.println("5. indexOf('a'): " + str1.indexOf('a')); // 1

        // 6. length()
        System.out.println("6. length(): " + str1.length()); // 4

        // 7. split()
        String sentence = "Java is easy";
        String[] words = sentence.split(" ");
        System.out.println("7. split():");
        for (String word : words) {
            System.out.println(" - " + word);
        }
    }
}