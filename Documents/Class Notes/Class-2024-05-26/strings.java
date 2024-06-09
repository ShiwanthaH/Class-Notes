public class strings {
    public static void main(String[] args) {
        String s = "ABCD efgh efgh efgh";

        System.out.println(s.length()); // 8
        System.out.println(s.toLowerCase()); // abcdefgh
        System.out.println(s.toUpperCase()); // ABCDEFGH
        System.out.println(s.charAt(0)); // A
        System.out.println(s.indexOf("efgh")); // 5

        System.out.println("Hello " + 5); // efgh
    }
}
