import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    JButton newQuiz,exit;
    Score(int score){

        setSize(700,700);
        setLocation(450,100);
        setLayout(null);
        setVisible(true);

        JLabel scoreText = new JLabel("Score");
        scoreText.setBounds(248,5,700,100);
        scoreText.setFont(new Font("goudy stout",Font.BOLD,40));
        add(scoreText);

        JLabel mainScore = new JLabel(""+score);
        mainScore.setBounds(320,100,700,200);
        mainScore.setFont(new Font("Kristen ITC",Font.BOLD,200));
        mainScore.setForeground(Color.red);
        add(mainScore);

        String message;
        if(score==5){
            message = "maximum";
        }else {
            int percentage = (int) (((float) score /5)*100);
            message = percentage+"%";
        }

        JLabel greetingMessage = new JLabel("Congratulation you have scored "+message+" in the quiz");
        greetingMessage.setBounds(60,300,700,50);
        greetingMessage.setFont(new Font("consolas",Font.ITALIC,20));
        add(greetingMessage);

        newQuiz = new JButton("Start new quiz");
        newQuiz.setBounds(50,400,200,50);
        newQuiz.setBackground(Color.BLUE);
        newQuiz.setForeground(Color.white);
        newQuiz.setFont(new Font("berlin sans fb",Font.BOLD,20));
        newQuiz.addActionListener(this);
        add(newQuiz);

        exit = new JButton("Exit");
        exit.setBounds(450,400,200,50);
        exit.setBackground(Color.BLUE);
        exit.setForeground(Color.white);
        exit.setFont(new Font("berlin sans fb",Font.BOLD,20));
        exit.addActionListener(this);
        add(exit);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newQuiz){
            new Login();
            setVisible(false);
        }
        if(e.getSource()==exit){
            setVisible(false);
        }
    }
}
