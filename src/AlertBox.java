import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlertBox extends JFrame implements ActionListener {
    JButton yesButton = new JButton("Yes");
    JButton noButton = new JButton("No");
    AlertBox(){

      setSize(500,150);
      setLocation(550,300);
      setBackground(Color.WHITE);
      setLayout(null);
      setVisible(true);

      JLabel heading = new JLabel("Do you want to close the quiz ?");
      heading.setBounds(80,5,500,20);
      heading.setFont(new Font("consolas",Font.BOLD,20));
      add(heading);

      //Yes button
        yesButton.setBounds(50,50,100,20);
        yesButton.addActionListener(this);
        add(yesButton);

      //No button

      noButton.setBounds(350,50,100,20);
      noButton.addActionListener(this);
      add(noButton);

    }
    public static void main(String[] args) {
        new AlertBox();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==yesButton){
            setVisible(false);
        }else if(ae.getSource()==noButton){
            setVisible(false);
            new Login();
        }
    }
}

