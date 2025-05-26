import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VehicleRentalApp extends JFrame {
    private JLabel nameLabel;
    private JTextField nameTextField;
    private JLabel vehicleTypeLabel;
    private JComboBox<String> vehicleTypeComboBox;
    private JButton bookNowButton;
    public VehicleRentalApp() {
        setTitle("Easy Vehicle Rental");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10,
                10));
        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Tell Us Your Details"));

                nameLabel = new JLabel("Your Name:");
        nameTextField = new JTextField(20);

        vehicleTypeLabel = new JLabel("Vehicle Type:");
        String[] vehicleChoices = {"Car", "Bike", "Truck"};
        vehicleTypeComboBox = new JComboBox<>(vehicleChoices);

        inputPanel.add(nameLabel);
        inputPanel.add(nameTextField);
        inputPanel.add(vehicleTypeLabel);
        inputPanel.add(vehicleTypeComboBox);

        mainPanel.add(inputPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bookNowButton = new JButton("Book Now!");
        buttonPanel.add(bookNowButton);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);

        bookNowButton.addActionListener(new BookingButtonListener());
    }

    private class BookingButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String customerName = nameTextField.getText();
            String selectedVehicle = (String)
                    vehicleTypeComboBox.getSelectedItem();

            if (customerName.trim().isEmpty()) {
                JOptionPane.showMessageDialog(VehicleRentalApp.this,
                        "Oops! Please enter your name first.",
                        "Missing Name",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            String message = String.format("Great!\n\nYou've booked a %s for: %s",
            selectedVehicle, customerName);

            JOptionPane.showMessageDialog(VehicleRentalApp.this,
                    message,
                    "Booking Confirmed!",
                    JOptionPane.INFORMATION_MESSAGE);

            nameTextField.setText("");
            vehicleTypeComboBox.setSelectedIndex(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VehicleRentalApp().setVisible(true);
        });
    }
}
