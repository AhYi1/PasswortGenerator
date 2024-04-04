import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PasswortErzeuger {
    private JPanel PWErzeuger;
    private JButton drückMichButton;
    private JTextField textField1;

    public PasswortErzeuger() {
        drückMichButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                String zeichen = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!§$%&/()=?+*#,;.:";

                int len = random.nextInt(8,14);

                char [] pass = new char[len];

                for(int i =0; i<len; i++)
                {
                    pass[i] = zeichen.charAt(random.nextInt(zeichen.length()));
                }

                textField1.setText(new String(pass));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PasswortErzeuger");
        frame.setContentPane(new PasswortErzeuger().PWErzeuger);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
