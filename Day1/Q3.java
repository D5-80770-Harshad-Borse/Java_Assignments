import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        boolean Exit = false;
        byte choice = 0;
        int arr[] = new int[10];
        int arr1[] = {20, 30, 25, 15, 30, 30, 40, 250, 150, 120};
        String arr2[] = {"Samosa","kachori","panipuri","vadapav","idlisambar","dosa","zira rice","fried chicken","shwarma : "};

        do {
            System.out.println("-------Menu------");
            System.out.println("1. Add item to cart");
            System.out.println("2. Generate Bill");
            System.out.println("-----------------");
            System.out.print("Enter Choice: ");
            switch (choice = new Scanner(System.in).nextByte()) {
                case 1: {
                    boolean exit = false;

                    System.out.println("0. Samosa --------- 20rs");
                    System.out.println("1. kachori -------- 30rs");
                    System.out.println("2. panipuri ------- 25rs");
                    System.out.println("3. vadapav -------- 15rs");
                    System.out.println("4. idlisambar------ 30rs");
                    System.out.println("5. dosa ----------- 30rs");
                    System.out.println("6. zira rice ------ 40rs");
                    System.out.println("7. burger --------- 250rs");
                    System.out.println("8. fried chicken -- 150rs");
                    System.out.println("9. shwarma ------- 120rs");
                    System.out.println("10. Exit");
                    do {
                        System.out.println("Select the option");
                        int i = new Scanner(System.in).nextInt();
                        if (i != 10) {
                            System.out.println("Enter the quantity: ");
                            arr[i] = new Scanner(System.in).nextInt();
                        } else
                            break;
                    } while (!exit);
                }
                    break;
                case 2: {
                    int total = 0;
                    for (int i = 0; i < arr2.length; i++) {
                    if (arr[i] != 0) {
                        System.out.println(arr2[i]+" : "+arr[i]+ "x" + arr1[i] + "----" + arr[i] * arr1[i]);
                        total = total + arr[i] * arr1[i];
                    }
                }
                    System.out.println("             Total : "+total);
                    Exit = true;
                }
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (!Exit);
    }
}
