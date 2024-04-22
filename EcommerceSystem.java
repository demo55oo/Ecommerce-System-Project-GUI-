import java.util.Scanner;

public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Ecommerce System!");

        ElectronicProduct smartphone = new ElectronicProduct(1, "smartphone", 599.9f, "Samsung", 1);

        ClothingProduct tShirt = new ClothingProduct(2, "T-shirt", 19.99f, "Medium", "Cotton");

        BookProduct oopBook = new BookProduct(3, "OOP", 39.99f, "O'Reilly", "X Publications");

        System.out.print("Enter your  ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("please enter  your name: ");
        String name = scanner.nextLine();
        System.out.print("please Enter your address: ");
        String address = scanner.nextLine();
        customer customer = new customer(customerId, name, address);

        System.out.print("How many products do you want to order? ");
        int numProducts = scanner.nextInt();
        scanner.nextLine();
        product[] products = new product[numProducts];
        for (int i = 0; i < numProducts; i++) {
            System.out.println("which product do you want to add  " + (i + 1) + ": " + " 1-smartphone  2-T-shist 3-OOP");
            int productId = scanner.nextInt();
            scanner.nextLine();
            switch (productId) {
                case 1:
                    products[i] = smartphone;
                    break;
                case 2:
                    products[i] = tShirt;
                    break;
                case 3:
                    products[i] = oopBook;
                    break;
                default:
                    System.out.println("Invalid product ID. Please try again.");
                    i--;
                    break;
            }
        }
        cart cart = new cart(customerId, numProducts, products);
        float totalPrice = 0;
        for (product product : products) {
            totalPrice += product.getPrice();
        }
        System.out.print("Do you want to place an order for the products in your cart? (Total Price: $" + totalPrice + ") (Y/N) ");

        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            System.out.println("Here is your order summary");


            order order = new order(customerId, 1, products, totalPrice);
            order.printorderinfo();
        } else {
            System.out.println("Order cancelled.");
        }

        scanner.close();
    }
}
