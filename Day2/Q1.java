import java.util.Scanner;

class Invoice {
    private String part_number;
    private String part_description;
    private int quantity;
    private double price;

    Invoice() {
        this.part_number = "";
        this.part_description = "";
        this.price = 0;
        this.quantity = 0;
    }

    void setPartNumber(String num) {
        this.part_number = num;
    };

    void setPartDescription(String desc) {
        this.part_description = desc;
    };

    void setPartQuantity(int quan) {
        this.quantity = quan;
    };

    void setPartPrice(double price) {
        this.price = price;
    };

    String getPartNumber() {
        return this.part_number;
    };

    String getPartDescription() {
        return this.part_description;
    };

    int getPartQuantity() {
        return this.quantity;
    };

    double getPartPrice() {
        return this.price;
    };

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Number : ");
        this.part_number = sc.nextLine();
        System.out.println("Enter Product Descrption : ");
        this.part_description = sc.nextLine();
        System.out.println("Enter Product Quantity : ");
        this.quantity = sc.nextInt();
        System.out.println("Enter Product Price : ");
        this.price = sc.nextDouble();
    }
}

public class Q1 {
    public static void main(String[] args) {
        Invoice arr[] = new Invoice[5];
        boolean Exit = false;
        byte counter = 0;
        double total = 0;
        do {
            System.out.println(":options:");
            System.out.println("1 . Add product");
            System.out.println("2 . Generate Invoice");
            System.out.println("Enter choice: ");
            switch (new Scanner(System.in).nextInt()) {
                case 1: {
                    arr[counter] = new Invoice();
                    arr[counter++].acceptDetails();
                    System.out.println("Product Added!");
                }
                    break;
                case 2: {
                    System.out.println("Invoice:");
                    for (int i = 0; i < counter; i++) {
                        System.out.println("-------------------------");
                        System.out.println("Product Number: " + arr[i].getPartNumber());
                        System.out.println("Product Description: " + arr[i].getPartDescription());
                        System.out.println("Product quantity: " + arr[i].getPartQuantity());
                        System.out.println("Product Price: " + arr[i].getPartPrice());
                        total = total + arr[i].getPartQuantity() * arr[i].getPartPrice();
                        System.out.println("-------------------------");
                    }
                    System.out.println("Total: " + total);
                    Exit = true;
                }
                    break;
            }
        } while (!Exit);
    }
}
