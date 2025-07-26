import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton Continue = new JButton("Continue");
    JButton exit = new JButton("Close");
    JTextField userName = new JTextField();

    Login(){
       setSize(1000,500);
       setLocation(350,150);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);

      //main image
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/sample.png"));
       JLabel image = new JLabel(i1);
       image.setBounds(0,0,300,500);
       add(image);

        //main heading
       JLabel heading  = new JLabel("Quiz By Manu");
       heading.setBounds(400,10,500,50);
       heading.setFont(new Font("consolas",Font.ITALIC,50));
       add(heading);

       // name input label
       JLabel name = new JLabel("Enter your name");
       name.setBounds(500,100,300,50);
       name.setFont(new Font("consolas",Font.BOLD,20));
       add(name);

       //Taking username as input
       userName.setBounds(440,140,300,30);
       add(userName);

       //Continue Button
       Continue.setBounds(440,190,100,30);
       Continue.setFont(new Font("arial black",Font.BOLD,12));
       Continue.setBackground(Color.GREEN);
       Continue.setForeground(Color.BLACK);
       Continue.addActionListener(this);
       add(Continue);

      //Exit Button
       exit.setBounds(642,190,100,30);
       exit.setFont(new Font("arial black",Font.BOLD,12));
       exit.setBackground(Color.red);
       exit.setForeground(Color.WHITE);
       exit.addActionListener(this);
       add(exit);



       setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
     if(ae.getSource()==Continue){
         setVisible(false);
         new Rules(userName.getText());
     } else if (ae.getSource()==exit) {
         int result = JOptionPane.showConfirmDialog(null,"Do you want to close the quiz ?","Are you sure",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
         if(result==JOptionPane.YES_OPTION){
             setVisible(false);
         }
     }
    }
}