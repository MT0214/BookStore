
package bookstore;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BookStore {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(660, 850);
        frame.setTitle("Project MT");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        JLabel l = new JLabel();
        l.setBounds(200, 10, 300, 20);
        l.setText("Cinderella's Book Store");
        Font font1 = new Font(" Brush Script MT", Font.BOLD, 24);
        l.setFont(font1);
        l.setForeground(Color.BLACK);
        frame.add(l);

        // book 1
        ImageIcon icon;
        icon = new ImageIcon("img/1.jpg");
        JLabel image = new JLabel();
        image.setBounds(40, 60, 150, 200);
        image.setIcon(icon);
        frame.add(image);

        JLabel l1 = new JLabel();
        l1.setBounds(66, 270, 100, 20);
        l1.setText("The Never King");
        Font fontl1 = new Font(" Brush Script MT", Font.BOLD, 13);
        l1.setFont(fontl1);
        frame.add(l1);

        JLabel l2 = new JLabel();
        l2.setBounds(66, 290, 100, 20);
        l2.setText("Nikki ST. Crowe");
        l2.setForeground(Color.GRAY);
        Font fontl2 = new Font(" Brush Script MT", Font.BOLD, 13);
        l2.setFont(fontl2);
        frame.add(l2);

        JLabel l3 = new JLabel();
        l3.setBounds(84, 315, 100, 20);
        l3.setText("$18.37");
        Font fontl3 = new Font(" Brush Script MT", Font.BOLD, 18);
        l3.setFont(fontl3);
        frame.add(l3);

        // button book 1
        JButton buyNowButton1 = new JButton("Buy Now");
        // Set the button color
        buyNowButton1.setBounds(63, 350, 100, 25);
        Color buttonColor = Color.GRAY.brighter(); // Adjust brightness to your liking
        buyNowButton1.setBackground(buttonColor);

        frame.add(buyNowButton1);

        // book 2
        ImageIcon icon2 = new ImageIcon("img/2.jpg");
        JLabel image2 = new JLabel();
        image2.setBounds(250, 60, 150, 200);
        image2.setIcon(icon2);
        frame.add(image2);

        JLabel l4 = new JLabel();
        l4.setBounds(243, 270, 200, 20);
        l4.setText("I have to tell you Something");
        Font fontl4 = new Font(" Brush Script MT", Font.BOLD, 13);
        l4.setFont(fontl4);
        frame.add(l4);

        JLabel l5 = new JLabel();
        l5.setBounds(295, 290, 100, 20);
        l5.setText("Zara Bas");
        l5.setForeground(Color.GRAY);
        Font fontl5 = new Font(" Brush Script MT", Font.BOLD, 13);
        l5.setFont(fontl5);
        frame.add(l5);

        JLabel l6 = new JLabel();
        l6.setBounds(293, 315, 100, 20);
        l6.setText("$12.10");
        Font fontl6 = new Font(" Brush Script MT", Font.BOLD, 18);
        l6.setFont(fontl6);
        frame.add(l6);

        // button book 2
        JButton buyNowButton2 = new JButton("Buy Now");
        // Set the button color
        buyNowButton2.setBounds(272, 350, 100, 25);
        Color buttonColor2 = Color.GRAY.brighter(); // Adjust brightness to your liking
        buyNowButton2.setBackground(buttonColor2);

        frame.add(buyNowButton2);

        // book 3
        ImageIcon icon3 = new ImageIcon("img/3.jpg");
        JLabel image3 = new JLabel();
        image3.setBounds(460, 60, 150, 200);
        image3.setIcon(icon3);
        frame.add(image3);

        JLabel l7 = new JLabel();
        l7.setBounds(482, 270, 200, 20);
        l7.setText("Learn My Lesson");
        Font fontl7 = new Font(" Brush Script MT", Font.BOLD, 13);
        l7.setFont(fontl7);
        frame.add(l7);

        JLabel l8 = new JLabel();
        l8.setBounds(495, 290, 100, 20);
        l8.setText("Katee Robert");
        l8.setForeground(Color.GRAY);
        Font fontl8 = new Font(" Brush Script MT", Font.BOLD, 13);
        l8.setFont(fontl8);

        frame.add(l8);

        JLabel l9 = new JLabel();
        l9.setBounds(505, 315, 100, 20);
        l9.setText("$11.14");
        Font fontl9 = new Font(" Brush Script MT", Font.BOLD, 18);
        l9.setFont(fontl9);
        frame.add(l9);

        // button book 2
        JButton buyNowButton3 = new JButton("Buy Now");
        // Set the button color
        buyNowButton3.setBounds(485, 350, 100, 25);
        Color buttonColor3 = Color.GRAY.brighter(); // Adjust brightness to your liking
        buyNowButton3.setBackground(buttonColor3);

        frame.add(buyNowButton3);

        // book 4
        ImageIcon icon4 = new ImageIcon("img/4.jpg");
        JLabel image4 = new JLabel();
        image4.setBounds(40, 430, 150, 200);
        image4.setIcon(icon4);
        frame.add(image4);

        JLabel l10 = new JLabel();
        l10.setBounds(57, 640, 150, 20);
        l10.setText("Rich Dad Poor Dad");
        Font fontl10 = new Font(" Brush Script MT", Font.BOLD, 13);
        l10.setFont(fontl10);
        frame.add(l10);

        JLabel l11 = new JLabel();
        l11.setBounds(60, 660, 150, 20);
        l11.setText("Robert T.Kiyosaki");
        l11.setForeground(Color.GRAY);
        Font fontl11 = new Font(" Brush Script MT", Font.BOLD, 13);
        l11.setFont(fontl11);
        frame.add(l11);

        JLabel l12 = new JLabel();
        l12.setBounds(86, 685, 100, 20);
        l12.setText("$14.02");
        Font fontl12 = new Font(" Brush Script MT", Font.BOLD, 18);
        l12.setFont(fontl12);
        frame.add(l12);

//         button book 4
        JButton buyNowButton4 = new JButton("Buy Now");
        buyNowButton4.setBounds(63, 720, 100, 25);
        Color buttonColor4 = Color.GRAY.brighter(); // Adjust brightness to your liking
        buyNowButton4.setBackground(buttonColor4);

        frame.add(buyNowButton4);

        // book 5
        ImageIcon icon5 = new ImageIcon("img/5.jpg");
        JLabel image5 = new JLabel();
        image5.setBounds(250, 430, 150, 200);
        image5.setIcon(icon5);
        frame.add(image5);

        JLabel l13 = new JLabel();
        l13.setBounds(231, 640, 200, 20);
        l13.setText("The Power of Positive Thinking");
        Font fontl13 = new Font(" Brush Script MT", Font.BOLD, 13);
        l13.setFont(fontl13);
        frame.add(l13);

        JLabel l14 = new JLabel();
        l14.setBounds(261, 660, 150, 20);
        l14.setText("Norman Vincent Peale");
        l14.setForeground(Color.GRAY);
        Font fontl14 = new Font(" Brush Script MT", Font.BOLD, 13);
        l14.setFont(fontl14);
        frame.add(l14);

        JLabel l15 = new JLabel();
        l15.setBounds(295, 685, 100, 20);
        l15.setText("$11.27");
        Font fontl15 = new Font(" Brush Script MT", Font.BOLD, 18);
        l15.setFont(fontl15);
        frame.add(l15);

//         button book 5
        JButton buyNowButton5 = new JButton("Buy Now");
        buyNowButton5.setBounds(273, 720, 100, 25);
        Color buttonColor5 = Color.GRAY.brighter(); // Adjust brightness to your liking
        buyNowButton5.setBackground(buttonColor5);

        frame.add(buyNowButton5);

        // book 6
        ImageIcon icon6 = new ImageIcon("img/6.jpg");
        JLabel image6 = new JLabel();
        image6.setBounds(460, 430, 150, 200);
        image6.setIcon(icon6);
        frame.add(image6);

        JLabel l16 = new JLabel();
        l16.setBounds(510, 640, 200, 20);
        l16.setText("Outliers");
        Font fontl16 = new Font(" Brush Script MT", Font.BOLD, 13);
        l16.setFont(fontl16);
        frame.add(l16);

        JLabel l17 = new JLabel();
        l17.setBounds(482, 660, 150, 20);
        l17.setText("Malcolm Gladwell");
        l17.setForeground(Color.GRAY);
        Font fontl17 = new Font(" Brush Script MT", Font.BOLD, 13);
        l17.setFont(fontl17);
        frame.add(l17);

        JLabel l18 = new JLabel();
        l18.setBounds(508, 685, 100, 20);
        l18.setText("$10.16");
        Font fontl18 = new Font(" Brush Script MT", Font.BOLD, 16);
        l18.setFont(fontl18);
        frame.add(l18);

//         button book 6
        JButton buyNowButton6 = new JButton("Buy Now");
        buyNowButton6.setBounds(485, 720, 100, 25);
        Color buttonColor6 = Color.GRAY.brighter(); // Adjust brightness to your liking
        buyNowButton6.setBackground(buttonColor6);

        frame.add(buyNowButton6);

        buyNowButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeliveryDetails details = new DeliveryDetails("The Never King by Nikki ST. Crowe", 18.37);
                frame.dispose();
            }
        });

        buyNowButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeliveryDetails details = new DeliveryDetails("I have to tell you Something by Zara Bas", 12.10);
                frame.dispose();
            }
        });

        buyNowButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeliveryDetails details = new DeliveryDetails("Learn My Lesson by Katee Robert", 11.14);
                frame.dispose();
            }
        });

        buyNowButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeliveryDetails details = new DeliveryDetails("Rich Dad Poor Dad by Robert T.Kiyosaki", 14.02);
                frame.dispose();
            }
        });

        buyNowButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeliveryDetails details = new DeliveryDetails("The Power of Positive Thinking by Norman Vincent Peale", 11.27);
                frame.dispose();
            }
        });

        buyNowButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeliveryDetails details = new DeliveryDetails("Outliers by Malcolm Gladwell", 10.16);
                frame.dispose();
            }
        });

        frame.setVisible(true);

    }

    
}
