import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JFrame implements ActionListener {
    JButton close;
    JButton start;
    JRadioButton accept;
    Start(){
        setVisible(true);
        setSize(1500,700);
        setLocation(15,10);
        setLayout(null);

        JLabel quizApp = new JLabel("Quiz Application");
        quizApp.setFont(new Font("Bernard MT",Font.BOLD,30));
        quizApp.setBounds(650,5,1500,50);
        quizApp.setForeground(Color.BLUE);
        add(quizApp);

        JLabel message1 = new JLabel("A beginner-level project by");
        message1.setBounds(600,60,300,20);
        message1.setFont(new Font("bahnschrift",Font.PLAIN,20));
        add(message1);

        JLabel ownerName = new JLabel("Manu Paul");
        ownerName.setBounds(850,60,200,19);
        ownerName.setFont(new Font("berlin sans fb",Font.BOLD,20));
        ownerName.setForeground(Color.RED);
        add(ownerName);


        JLabel information = new JLabel("Some information before you close : ");
        information.setBounds(10,120,1000,30);
        information.setFont(new Font("consolas",Font.BOLD,25));
        add(information);

        JLabel infoList = new JLabel(
                "<html>" +
                "1. I have made this project based on my laptops orientation, so it make look weird or misaligned in your laptop<br>"
                +"2. This are the fonts that are used in this project , so make sure you have this font downloaded in your PC or laptop : <br>"
                +"->   In Login.java and Rules.java : consolas , arial black<br>"
                +"->   In Quiz.java : consolas , monospace<br>"
                +"->   In Score.java and Start.java : consolas , berlin sans fb , goudy stout , kristen ITC , bahnschrift , bernard MT<br>"
                +"3. If you found any bug in this project then you can DM me about that in Instagram(You will get the link from github)<br>"
                +"4. When you run this Start.java , it may take 5-10 seconds to render everything"
                +"<html>"
        );
        infoList.setBounds(20,100,1500,300);
        infoList.setFont(new Font("monospace",Font.PLAIN,20));
        add(infoList);

        accept = new JRadioButton("I understand everything");
        accept.setBounds(20,400,300,50);
        accept.setFont(new Font("monospace",Font.BOLD,15));
        add(accept);

        close = new JButton("Close");
        close.setBounds(1000,550,100,50);
        close.setBackground(Color.blue);
        close.setForeground(Color.white);
        close.addActionListener(this);
        add(close);


        start= new JButton("Start");
        start.setBounds(400,550,100,50);
        start.setBackground(Color.blue);
        start.setForeground(Color.white);
        start.addActionListener(this);
        add(start);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== start){
            if(accept.isSelected()){
                setVisible(false);
                new Login();
            }else{
                JOptionPane.showMessageDialog(null,"Please click on \"I understand everything\"");
            }
        }
        if(e.getSource()==close){
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Start();
    }
}
