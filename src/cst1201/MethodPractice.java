package cst1201;

import javax.swing.JOptionPane;

public class MethodPractice {

    public static void main(String[] args) {
        displayMessage("Message 1", 5);
        displayMessage("Message 2", 1);

        for (int i = 0; i < 10; i++) {
            displayMessage("This message is in a loop", 2);
        }

        String input = JOptionPane.showInputDialog("How was your break?");
        System.out.println(input);

        JOptionPane.showMessageDialog(null, "Hi there argument!");
    }

    /**
     * Shows a message on the console (standard output).
     *
     * @param message The message to display.
     * @param times The number of times to display the message.
     */
    public static void displayMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
