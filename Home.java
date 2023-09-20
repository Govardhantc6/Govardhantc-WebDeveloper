package OJT1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Home extends JFrame {
    private BufferedImage bankLogo,backgroundImage;

    public Home() {
        setTitle("Bank Home Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel l1 = new JLabel("HAPPY BANK OF BENGALURU");
        l1.setFont(new Font("Arial",Font.BOLD,30));
        l1.setForeground(Color.white);
        l1.setBackground(Color.black);
        l1.setBounds(280,60,500,50);
        add(l1);

        JLabel l2 = new JLabel("Banking becomes Happier, wealth grows easier ");
        l2.setFont(new Font("Arial",Font.PLAIN,15));
        l2.setForeground(Color.white);
        l2.setBounds(340,95,500,50);
        add(l2);



        JButton J = new JButton("NEW USER");
        J.setForeground(Color.white);
        J.setBackground(new Color(255,255,255,0));
        J.setOpaque(false);
        J.setFont(new Font("Arial",Font.BOLD,15));
        J.setBounds(30,200,130,50);
        add(J);

        J.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setVisible(false);
                    new Signup();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        JButton fc = new JButton("LOGIN");
        fc.setForeground(Color.white);
        fc.setBackground(new Color(255,255,255,0));
        fc.setOpaque(false);
        fc.setFont(new Font("Arial",Font.BOLD,15));
        fc.setBounds(30,270,130,50);
        add(fc);

        fc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setVisible(false);
                    new Signup();
                }
                catch (IOException ex){
                    throw new RuntimeException();

                }
            }
        });

        JButton pc = new JButton("CREATE ACCOUNT");
        pc.setForeground(Color.white);
        pc.setBackground(Color.red);
        pc.setFont(new Font("Arial",Font.BOLD,15));
        pc.setBounds(30,340,200,50);
        add(pc);

        pc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setVisible(false);
                    new App_form();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        JTextArea cw = new JTextArea(
                "Vision:\n\n" +
                "The vision of Happy Bank of Bengaluru is to be recognized as a leading financial institution \n" +
                "dedicated to enhancing the financial well-being and happiness of our customers, employees, and\n communities." +
                "We aspire to be a trusted partner in our customers' financial journeys, providing \n innovative and" +
                " personalized solutions.\n" +
                "\n" +
                "Purpose:\n\n" +
                "The primary purpose of Happy Bank of Bengaluru is to empower individuals and businesses\n in Bengaluru and" +
                "beyond by offering a comprehensive range of financial services that meet their \n unique needs." +
                "We aim to foster financial literacy and inclusion, making banking accessible to all \n segments of the society.\n" +
                "\n" +

                "Operation:\n\n" +
                "Happy Bank of Bengaluru operates as a full-service bank with a wide array of financial products\n " +
                "and services.\n");
        cw.setBackground(new Color(255,255,255,0));
        cw.setForeground(Color.white);
        cw.setEditable(false);
        cw.setOpaque(false);
        cw.setFont(new Font("Arial",Font.PLAIN,13));
        cw.setBounds(300,220,560,300);
        add(cw);

        JButton exit = new JButton("EXIT");
        exit.setForeground(Color.white);
        exit.setOpaque(false);
        exit.setBackground(new Color(255,255,255,0));
        exit.setBounds(30,420,100,50);
        add(exit);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        try {
            // Load background image
            backgroundImage = ImageIO.read(new File("C:\\Users\\User\\IdeaProjects\\projectojt\\src\\OJT1\\poly_design_background_2409.jpg"));

            // Load bank logo image
            bankLogo = ImageIO.read(new File("C:\\Users\\User\\IdeaProjects\\projectojt\\src\\OJT1\\bank_logo.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create a custom component to display the background image
        JComponent backgroundComponent = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);

            }
        };
        backgroundComponent.setBounds(0, 0, 900, 600);
        add(backgroundComponent);

        // Create a JLabel to display the bank logo
        JLabel logoLabel = new JLabel(new ImageIcon(bankLogo));
        logoLabel.setBounds(100, 10, 150, 150);
        backgroundComponent.add(logoLabel);

        setVisible(true);
        getContentPane();

    }

    public static void main(String[] args) {
            new Home();
    }
}

