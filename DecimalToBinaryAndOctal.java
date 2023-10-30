import java.util.Scanner;

public class DecimalToBinaryAndOctal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Decimal Number: ");
        int decimalNumber = s.nextInt();
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("Binary Number = " + binaryNumber);
        String octalNumber = Integer.toOctalString(decimalNumber);
        System.out.println("Octal = " + octalNumber);
    }
}
