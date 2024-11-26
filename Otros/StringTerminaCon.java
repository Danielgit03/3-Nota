public class StringTerminaCon {

    public static boolean terminaCon(String cadena, String sufijo) {
        return cadena.endsWith(sufijo);
    }

    

    public static void main(String[] args) {
        System.out.println(terminaCon("abc", "bc")); // true
        System.out.println(terminaCon("abc", "d"));  // false

        System.out.println(" ");

        System.out.println(terminaCon("hello", "lo"));  // true
    System.out.println(terminaCon("world", "ld")); // true
    System.out.println(terminaCon("java", "va"));  // true
    System.out.println(terminaCon("abc", "x"));    // false
    System.out.println(terminaCon("abc", ""));     // true
    System.out.println(terminaCon("", ""));        // true

    }
}
