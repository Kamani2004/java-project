import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        int rows = 10;
        int num = 100;
        for (int i = 1; i <= rows; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }
    }
    Scanner scanner = new Scanner(System.in);
}
// public class Pattern {
//     public static void main(String[] args) {
//         int rows = 10;
//         int num = 1;
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println();
//             for (int j = 1; j <= rows - i; j++) {
//                 System.out.print("  ");
//             }
//             for (int j = 1; j <= 2 * (rows - i) - 1; j++) {
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }
