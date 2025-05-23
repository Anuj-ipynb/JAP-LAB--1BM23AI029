import java.util.Scanner;

public class StringBufferHandling3B {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        System.out.println("Capacity of StringBuffer object sb1: " + sb1.capacity());

        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println("Capacity of StringBuffer object sb2: " + sb2.capacity());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        StringBuffer reversedBuffer = new StringBuffer(inputString);
        reversedBuffer.reverse();
        String reversedUpperCase = reversedBuffer.toString().toUpperCase();
        System.out.println("Reversed string in uppercase: " + reversedUpperCase);

        System.out.print("Enter a string to append: ");
        String appendString = scanner.nextLine();
        reversedBuffer.append(appendString);
        System.out.println("String after appending: " + reversedBuffer);

        scanner.close();
    }
}
/*Output
Capacity of StringBuffer object sb1: 16
Capacity of StringBuffer object sb2: 21
Enter a string: welcome
Reversed string in uppercase: EMOCLEW
Enter a string to append: BACK
String after appending: EMOCLEWBACK
    */

