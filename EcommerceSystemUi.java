import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcommerceSystemUi extends JFrame implements ActionListener {
    private JTextField customerIdField;
    private JTextField nameField;
    private JTextField addressField;
    private JTextField numProductsField;
    private JButton submitButton;

    public EcommerceSystemUi() {
        setTitle("Ecommerce System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Customer ID:"));
        customerIdField = new JTextField();
        panel.add(customerIdField);

        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("address:"));
        addressField = new JTextField();
        panel.add(addressField);

        panel.add(new JLabel("Number of Products:"));
        numProductsField = new JTextField();
        panel.add(numProductsField);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        panel.add(submitButton);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int customerId = Integer.parseInt(customerIdField.getText());
        String name = nameField.getText();
        String address = addressField.getText();
        int numProducts = Integer.parseInt(numProductsField.getText());

        ElectronicProduct smartphone = new ElectronicProduct(1, "smartphone", 599.9f, "Samsung", 1);

        ClothingProduct t_Shirt = new ClothingProduct(2, "T-shirt", 19.99f, "Medium", "Cotton");

        BookProduct oopBook = new BookProduct(3, "OOP", 39.99f, "O'Reilly", "X Publications");

        product[] products = new product[numProducts];
        for (int i = 0; i < numProducts; i++) {
            int productId = Integer.parseInt(JOptionPane.showInputDialog("Enter product ID for product " + (i + 1) + ":"  + " 1-smartphone  2-T-shist 3-OOP"));
            switch (productId) {
                case 1:
                    products[i] = smartphone;
                    break;
                case 2:
                    products[i] = t_Shirt;
                    break;
                case 3:
                    products[i] = oopBook;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid product ID. Please try again.");
                    i--;
                    break;
            }
        }

        float totalPrice = 0;
        for (product product : products) {
            totalPrice += product.getPrice();
        }

        StringBuilder orderInfo = new StringBuilder();
        orderInfo.append("Order details:\n")
                .append("Customer ID: ").append(customerId).append("\n")
                .append("Name: ").append(name).append("\n")
                .append("Address: ").append(address).append("\n")
                .append("Number of Products: ").append(numProducts).append("\n")
                .append("Total Price: $").append(totalPrice).append("\n")
                .append("Products:\n");
        for (int i = 0; i < numProducts; i++) {
            orderInfo.append(products[i].getName()).append("\n");
        }

        JOptionPane.showMessageDialog(null, orderInfo.toString(), "Order Information", JOptionPane.INFORMATION_MESSAGE);


        dispose();
    }

    public static void main(String[] args) {
        new EcommerceSystemUi();
    }
}
