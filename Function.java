public class Function {
    public static void main(String[] args) {
        String str ="hello java ";
        
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(4));
        System.out.println(str.trim());
        System.out.println(str.substring(1, 4));
        System.out.println(str.replace('o', 'a'));
        System.out.println(str.trim());
        // concatenation
        String str1 = "well come ";
        String str2 = "to my code ";
        System.out.println(str1 + " " + str2);
        System.out.println(str1.concat(" ").concat(str2));
        
    }
}
