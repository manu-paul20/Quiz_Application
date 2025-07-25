import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame{
    private Timer countDownTimer ;
    Quiz(){
        setSize(1000,800);
        getContentPane().setBackground(Color.WHITE);
        setLocation(250,0);
        setLayout(null);
        setVisible(true);

        JLabel questionLabel = new JLabel("Question: ");
        questionLabel.setFont(new Font("consolas",Font.BOLD,20));
        questionLabel.setBounds(10,250,120,20);
        add(questionLabel);

        JLabel actualQuestion = new JLabel("This is a question");
        actualQuestion.setBounds(120,250,800,20);
        actualQuestion.setFont(new Font("consolas",Font.PLAIN,20));
        add(actualQuestion);



        //creating Radio Button
        JRadioButton opt1 = new JRadioButton("opt1");
        JRadioButton opt2 = new JRadioButton("opt2");
        JRadioButton opt3 = new JRadioButton("opt3");
        JRadioButton opt4 = new JRadioButton("opt4");
        //setting radio button background to white
        opt1.setBackground(Color.white);
        opt2.setBackground(Color.white);
        opt3.setBackground(Color.white);
        opt4.setBackground(Color.white);
        //setting radio button size
        opt1.setBounds(20,300,100,40);
        opt2.setBounds(20,340,100,40);
        opt3.setBounds(20,380,100,40);
        opt4.setBounds(20,420,100,40);
        //giving font to radio button
        opt1.setFont(new Font("monospace",Font.PLAIN,20));
        opt2.setFont(new Font("monospace",Font.PLAIN,20));
        opt3.setFont(new Font("monospace",Font.PLAIN,20));
        opt4.setFont(new Font("monospace",Font.PLAIN,20));
        //adding radio button
        add(opt1);
        add(opt2);
        add(opt3);
        add(opt4);

        //grouping the button
        ButtonGroup optionsGroup = new ButtonGroup();
        optionsGroup.add(opt1);
        optionsGroup.add(opt2);
        optionsGroup.add(opt3);
        optionsGroup.add(opt4);

//        adding timer
        JLabel timer = new JLabel("00:15");
        timer.setBounds(350,10,1000,300);
        timer.setFont(new Font("consolas",Font.BOLD,100));
        add(timer);

        final int[] totalTime = {15};
        countDownTimer = new Timer(1000, new ActionListener(){
          @Override
           public void actionPerformed(ActionEvent e) {
                if(totalTime[0] <10){
                    timer.setText("00:0"+ totalTime[0]);
                    timer.setForeground(Color.red);
                }else {
                    timer.setText("00:"+ totalTime[0]);
                }
                totalTime[0]--;

                if(totalTime[0] <0){
                    countDownTimer.stop();
                    JOptionPane.showMessageDialog(null,"Time's Up");
                   setVisible(false);

                }
           }

       });
        countDownTimer.start();
    }
    public static void main(String[] args) {
        new Quiz();
    }
}
