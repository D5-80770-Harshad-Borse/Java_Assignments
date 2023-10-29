import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Double Value: ");
        if(sc.hasNextDouble()){
            System.out.println("Value is Double");
        }
        else{
            System.out.println("Value is not Double");
        }
    }
}
