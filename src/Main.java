import java.awt.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FRAMES and PANNELS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setPreferredSize(new Dimension(800, 600));
        frame.setLocationRelativeTo(null);

        frame.getContentPane().setBackground(Color.GREEN);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setBackground(Color.MAGENTA);
        panel.setPreferredSize(new Dimension(700, 500));
        JLabel jlabel = new JLabel("Hello World");
        jlabel.setFont(new Font("Verdana",1,60));
        panel.add(jlabel);
        frame.add(panel);


//        JPanel panel2 = new JPanel();
//        panel2.setBackground(Color.BLUE);
//        panel2.setPreferredSize(new Dimension(100, 100));
//        frame.add(panel2);
          frame.pack();
          System.out.println("Hello World");

    }
}