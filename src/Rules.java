import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class Rules extends JFrame{
    JButton start = new JButton("Start");

    Rules(String userName){
       // checking if the username is empty or not
        userName = (userName.isEmpty())?"USER":userName.toUpperCase();

        setSize(800,780);
        setLocation(350,10);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Rules:");
        heading.setBounds(0,50,100,20);
        heading.setFont(new Font("arial black",Font.BOLD,20));
        add(heading);

        JLabel greetingMessage = new JLabel("Hello "+userName+", Here are the rules of the quiz");
        greetingMessage.setBounds(180,3,800,50);
        greetingMessage.setFont(new Font("consolas",Font.ITALIC,20));
        add(greetingMessage);

        JLabel rules = new JLabel(
                "<html>"+
                "1.Only one option is correct among four<br><br>" +
                "2.You will get 15 seconds for each question<br><br>"+
                "3.Dont use ChatGPT or Google<br><br>"+
                "3.Like this project on GitHub and add a comment<br><br>"+
                "<html>"
        );
        rules.setBounds(0,100,800,200);
        rules.setFont(new Font("consolas",Font.PLAIN,20));
        add(rules);

        start.setBounds(350,400,100,50);
        start.setFont(new Font("arial black",Font.BOLD,20));
        start.setBackground(Color.BLUE);
        start.setForeground(Color.white);
        add(start);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Rules("");
    }

}
