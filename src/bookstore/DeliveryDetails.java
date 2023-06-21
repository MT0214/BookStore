
package bookstore;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DeliveryDetails {

    DeliveryDetails(String ProjectName, double price) {
        JFrame frame = new JFrame();
        frame.setSize(660, 600);
        frame.setTitle(ProjectName);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        JLabel l = new JLabel();
        l.setBounds(230, 10, 300, 30);
        l.setText("Delivery Details");
        Font font = new Font(" Brush Script MT", Font.BOLD, 24);
        l.setFont(font);
        l.setForeground(Color.BLACK);
        frame.add(l);

        JLabel l2 = new JLabel();
        l2.setBounds(40, 60, 200, 20);
        l2.setText("Customer Name");
        Font font2 = new Font(" Brush Script MT", Font.BOLD, 16);
        l2.setFont(font2);
        l2.setForeground(Color.BLACK);
        frame.add(l2);

        JTextField t1 = new JTextField();
        t1.setBounds(40, 90, 250, 30);
        Font fontt1 = new Font("Brush Script MT", Font.PLAIN, 17);
        t1.setFont(fontt1);
        frame.add(t1);

        JLabel l3 = new JLabel();
        l3.setBounds(320, 60, 200, 20);
        l3.setText("Email");
        Font font3 = new Font(" Brush Script MT", Font.BOLD, 16);
        l3.setFont(font3);
        l3.setForeground(Color.BLACK);
        frame.add(l3);

        JTextField t2 = new JTextField();
        t2.setBounds(320, 90, 250, 30);
        Font fontt2 = new Font("Brush Script MT", Font.PLAIN, 17);
        t2.setFont(fontt2);
        frame.add(t2);

        JLabel l4 = new JLabel();
        l4.setBounds(40, 150, 200, 20);
        l4.setText("Contact Number");
        Font font4 = new Font(" Brush Script MT", Font.BOLD, 16);
        l4.setFont(font4);
        l4.setForeground(Color.BLACK);
        frame.add(l4);

        JTextField t3 = new JTextField();
        t3.setBounds(40, 180, 250, 30);
        Font fontt3 = new Font("Brush Script MT", Font.PLAIN, 17);
        t3.setFont(fontt3);
        frame.add(t3);

        JLabel l5 = new JLabel();
        l5.setBounds(320, 150, 200, 20);
        l5.setText("City");
        Font font5 = new Font(" Brush Script MT", Font.BOLD, 16);
        l5.setFont(font5);
        l5.setForeground(Color.BLACK);
        frame.add(l5);

        String[] options = {"Silicon Vally", "Toronto", "New York", "California", "Las Vegas"};

        JComboBox<String> comboBox = new JComboBox<>(options);
        comboBox.setBounds(320, 180, 250, 30);
        Font fontcb1 = new Font("Brush Script MT", Font.PLAIN, 17);
        comboBox.setFont(fontcb1);
        frame.add(comboBox);

        JLabel l6 = new JLabel();
        l6.setBounds(320, 230, 200, 20);
        l6.setText("Number of Copy");
        Font font6 = new Font(" Brush Script MT", Font.BOLD, 16);
        l6.setFont(font6);
        l6.setForeground(Color.BLACK);
        frame.add(l6);

        Integer[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        JComboBox<Integer> comboBox2 = new JComboBox<>(num);
        comboBox2.setBounds(320, 260, 50, 30);
        Font fontcb2 = new Font("Brush Script MT", Font.PLAIN, 17);
        comboBox2.setFont(fontcb2);
        frame.add(comboBox2);

        JLabel l7 = new JLabel();
        l7.setBounds(40, 230, 200, 20);
        l7.setText("Street Address");
        Font font7 = new Font(" Brush Script MT", Font.BOLD, 16);
        l7.setFont(font7);
        l7.setForeground(Color.BLACK);
        frame.add(l7);

        JTextField t4 = new JTextField();
        t4.setBounds(40, 260, 250, 30);
        Font fontt4 = new Font("Brush Script MT", Font.PLAIN, 17);
        t4.setFont(fontt4);
        frame.add(t4);

        JButton btn = new JButton("Place Your Order");
        btn.setBounds(230, 350, 200, 30);
        Font fontbt1 = new Font("Brush Script MT", Font.PLAIN, 18);
        btn.setFont(fontbt1);
        frame.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double p = (((Integer) comboBox2.getSelectedItem()).intValue() * price) + 20;
                String formatedPrice = String.format("%.2f", p);
                JOptionPane.showMessageDialog(frame, "Your order has been placed!" + "\n\n" + "Billing Details: \n" + "Name: " + t1.getText() + "\nAddress: " + t4.getText() + ", " + comboBox.getSelectedItem() + "\nPhone: " + t3.getText() + "\nEmail: " + t2.getText() + "\nOrder Total: " + comboBox2.getSelectedItem() + "\nDelivery fee: " + "$20" + "\nTotal Discount (VAT Incl): $0" + "\nTotal Payment : " + formatedPrice + "\nPayment Type: cash on delivery" + ", Estimated Delivery Time: 2-5 Days" + "\n\n");
                frame.dispose();
            }
        });
        frame.setVisible(true);

    }
}
