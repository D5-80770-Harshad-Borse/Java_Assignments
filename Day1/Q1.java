import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        System.out.println("Enter the Number: ");
        int num = new Scanner(System.in).nextInt();
        System.out.println("Binary : "+Integer.toBinaryString(num));
        System.out.println("Ocatal : "+Integer.toOctalString(num));
        System.out.println("Hex : "+Integer.toHexString(num));
    }
}
