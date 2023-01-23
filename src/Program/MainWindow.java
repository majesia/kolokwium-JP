package Program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    public static JLabel stan;

    public static int kind=0;

        public MainWindow() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
            int ww = 450, wh = 310;
            setBounds((screen.width-ww)/2, (screen.height-wh)/2, ww, wh);
            JPanel contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);
            setBackground(Color.WHITE);

            MainPanel kanwa = new MainPanel();
            kanwa.setBounds(10, 11, 422, 219);
            contentPane.add(kanwa);
            SwingUtilities.invokeLater(() -> kanwa.initialize());

            JRadioButton rbAdd = new JRadioButton("Dodawanie");
            rbAdd.setBounds(10,230,100,30);
            contentPane.add(rbAdd);

            rbAdd.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    kind=1;
                }
            });

            JRadioButton rbMultiplication = new JRadioButton("Mnożenie");
            rbMultiplication.setBounds(150,230,100,30);
            contentPane.add(rbMultiplication);

            rbMultiplication.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    kind=1;

                }
            });

            ButtonGroup group= new ButtonGroup();
            group.add(rbAdd);
            group.add(rbMultiplication);

            stan = new JLabel();
            stan.setBounds(300,230,100,30);
            contentPane.add(stan);
            stan.setText("Stan: ");




        }

        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        MainWindow frame = new MainWindow();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

    }

