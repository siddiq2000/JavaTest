import javax.swing.*;

public class MyGuiApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("My GUI Application");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            JButton button = new JButton("Click Me!");
            button.addActionListener(e -> {
                // Your console logic here (e.g., calculations)
                JOptionPane.showMessageDialog(frame, "Button clicked!");
            });

            frame.add(button);
            frame.setVisible(true);
        });
    }
}
