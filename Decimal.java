import java.util.*;
class Decimal
{
public static void main(String arg[])
{
int dec;
Scanner input=new Scanner(System.in);
System.out.println("Enter decimal value");
dec=input.nextInt();
String bin=Integer.toBinaryString(dec);
String oct=Integer.toOctalString(dec);
System.out.println("Binary number = "+bin);
System.out.print("octal number = "+oct);
}
}