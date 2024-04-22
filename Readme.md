### Ecommerce System Project (GUI)

This project is developed as an assignment for FCDS College in 2024. It is a Java application for an Ecommerce System that allows users to order products. The project includes two main classes: one for running the application in the command line (CMD) and the other for the graphical user interface (GUI).

#### Main Classes

1. **EcommerceSystemCMD**: This class contains the main method for running the Ecommerce System in the command line. It allows users to input their customer ID, name, address, and the number of products they want to order. Based on the user input, the application creates electronic, clothing, and book products, adds them to the cart, and prints the order information.

2. **EcommerceSystemGUI**: This class represents the graphical user interface (GUI) for the Ecommerce System. It provides a form for users to enter their customer ID, name, address, and the number of products they want to order. The GUI then prompts the user to enter the IDs of the products they wish to order and displays the order information using a message dialog.

#### Main Methods

1. **EcommerceSystemCMD**
    - `main(String[] args)`: The entry point for running the application in the command line. Handles the overall flow of the application, including user input and order processing.

2. **EcommerceSystemGUI**
    - `main(String[] args)`: The entry point for running the GUI application. Initializes and displays the GUI components.

    - `actionPerformed(ActionEvent e)`: Handles user actions, such as button clicks, in the GUI. Processes user input, creates products, and displays the order information.

#### Functionality

- **Product Creation**: The application allows users to create electronic, clothing, and book products with predefined specifications.
- **Order Placement**: Users can place orders by selecting the products they want to order and entering their customer information.
- **Total Price Calculation**: The application calculates the total price of the order based on the selected products.
- **Order Information Display**: The application displays the order information, including the customer details, selected products, and total price.

#### How to Run

To run the Ecommerce System application, follow these steps:

1. **Command Line (CMD)**: Compile and run the `EcommerceSystemCMD` class to run the application in the command line. Follow the on-screen instructions to place an order.

2. **Graphical User Interface (GUI)**: Compile and run the `EcommerceSystemGUI` class to run the application with a graphical user interface. Fill in the form with your customer information and product IDs to place an order.

#### Dependencies

This project uses the `javax.swing` library for creating the graphical user interface (GUI) components.

#### Contributors

- Adham mansour

#### License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
