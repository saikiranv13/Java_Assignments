public class MessagePrinter {
    // Method to print a message
    public void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        MessagePrinter printer = new MessagePrinter();

        // Call the printMessage method to print a message
        printer.printMessage("Welcome to Java......!");
    }
}
