import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Quiz extends JFrame implements ActionListener{
    JButton next = new JButton("Next");
    JLabel questionLabel,actualQuestion;
    JRadioButton opt1,opt2,opt3,opt4;
    String[][] questions;
    String[] answers;
    int row;
    private boolean isWindowOpen = true;
    private boolean isWindowVisible = true;
    String[] userAnswers = new String[5];
    ButtonGroup optionsGroup;
    int finalScore;
    Quiz(int i,int score){

        //window size.
        setSize(1000,800);
        getContentPane().setBackground(Color.WHITE);
        setLocation(250,0);
        setLayout(null);
        setVisible(true);

        //adding questions
        questions = new String[5][5];
        answers = new String[5];

        //First question
        questions[0][0] = "What is a correct syntax to output \"Hello World\" in Java?";
        questions[0][1] = "System.out.println(\"Hello World\")";
        questions[0][2] = "print(\"Hello World\")";
        questions[0][3] = "console.log(\"Hello World\")";
        questions[0][4] = "printf(\"Hello World\")";
        //second question
        questions[1][0] = "How to write comment in java ?";
        questions[1][1] = "/*This is a comment";
        questions[1][2] = "//This is a comment";
        questions[1][3] = "#This is a comment";
        questions[1][4] = "/+This is a comment";
        //third question
        questions[2][0] = "Which data type is used to create a variable that should store text in Java?";
        questions[2][1] = "text";
        questions[2][2] = "myString";
        questions[2][3] = "char";
        questions[2][4] = "String";
        //fourth question
        questions[3][0] = "How do you create a variable with the floating number 2.8?";
        questions[3][1] = "float a = 2.8f";
        questions[3][2] = "float a = 2.8";
        questions[3][3] = "num a = 2.8";
        questions[3][4] = "a = 2.8f";
        //fifth question
        questions[4][0] = "Which method can be used to find the length of a string?";
        questions[4][1] = "len()";
        questions[4][2] = "len";
        questions[4][3] = " .length";
        questions[4][4] = " .length()";

        //answers
        answers[0] = "System.out.println(\"Hello World\")";
        answers[1] = "//This is a comment";
        answers[2] = "String";
        answers[3] = "float a = 2.8f";
        answers[4] = " .length()";

        //question structure
        questionLabel = new JLabel("Question: ");
        questionLabel.setFont(new Font("consolas",Font.BOLD,20));
        questionLabel.setBounds(10,250,120,20);
        add(questionLabel);

        actualQuestion = new JLabel("This is a question");
        actualQuestion.setBounds(120,245,800,20);
        actualQuestion.setFont(new Font("monospace",Font.PLAIN,20));
        add(actualQuestion);



        //creating Radio Button
        opt1 = new JRadioButton("opt1");
        opt2 = new JRadioButton("opt2");
        opt3 = new JRadioButton("opt3");
        opt4 = new JRadioButton("opt4");
        //setting radio button background to white
        opt1.setBackground(Color.white);
        opt2.setBackground(Color.white);
        opt3.setBackground(Color.white);
        opt4.setBackground(Color.white);
        //setting radio button size
        opt1.setBounds(20,300,800,40);
        opt2.setBounds(20,340,800,40);
        opt3.setBounds(20,380,800,40);
        opt4.setBounds(20,420,800,40);
        //giving font to radio button
        opt1.setFont(new Font("consolas",Font.PLAIN,20));
        opt2.setFont(new Font("consolas",Font.PLAIN,20));
        opt3.setFont(new Font("consolas",Font.PLAIN,20));
        opt4.setFont(new Font("consolas",Font.PLAIN,20));
        //adding radio button
        add(opt1);
        add(opt2);
        add(opt3);
        add(opt4);

        //grouping the button
        optionsGroup = new ButtonGroup();
        optionsGroup.add(opt1);
        optionsGroup.add(opt2);
        optionsGroup.add(opt3);
        optionsGroup.add(opt4);

        //adding timer
        JLabel timer = new JLabel("00:15");
        timer.setBounds(350,10,1000,300);
        timer.setFont(new Font("consolas",Font.BOLD,100));
        add(timer);

        //timer logic
        final int[] totalTime = {15};
        //checking is Window open or not
        Timer countDownTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (totalTime[0] < 10) {
                    timer.setText("00:0" + totalTime[0]);
                    timer.setForeground(Color.red);
                } else {
                    timer.setText("00:" + totalTime[0]);
                }
                totalTime[0]--;
                //checking is Window open or not
                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        isWindowOpen = false;
                    }
                });

                if (totalTime[0] == -1) {
                    if (isWindowOpen && isWindowVisible) {
                        if (i == 4) {
                            new Score((finalScore+1));
                            setVisible(false);
                            return;
                        }
                        if (optionsGroup.getSelection() == null) {
                            userAnswers[i] = "";
                        }
                        new Quiz(i + 1, score);
                        setVisible(false);
                    }
                }

            }

        });
        countDownTimer.start();

        //next button
        next.setBounds(450,550,100,50);
        next.setBackground(Color.BLUE);
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);

        addQuestion(i);
        finalScore = score;
    }

    //function to add question dynamically
    public void addQuestion(int currentRow){
        actualQuestion.setText(questions[currentRow][0]);
        opt1.setText(questions[currentRow][1]);
        opt1.setActionCommand(questions[currentRow][1]);
        opt2.setText(questions[currentRow][2]);
        opt2.setActionCommand(questions[currentRow][2]);
        opt3.setText(questions[currentRow][3]);
        opt3.setActionCommand(questions[currentRow][3]);
        opt4.setText(questions[currentRow][4]);
        opt4.setActionCommand(questions[currentRow][4]);

        if(currentRow == 4){
            next.setText("Submit");
        }
        optionsGroup.clearSelection();
        row = currentRow;
    }

    //function to add button logic
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==next){
            if(row == 4){
                if(optionsGroup.getSelection() == null){
                    userAnswers[row] = "";
                }else {
                    userAnswers[row] = optionsGroup.getSelection().getActionCommand();
                }
                if(userAnswers.equals(answers[row])){
                    finalScore++;
                }
               new Score(finalScore+1);
                setVisible(false);
                isWindowVisible = false;
                return;
            }
            if(optionsGroup.getSelection() == null){
                userAnswers[row] = "";
            }else {
                userAnswers[row] = optionsGroup.getSelection().getActionCommand();
            }
            if(userAnswers[row].equals(answers[row])){
                finalScore++;
            }
            new Quiz(row+1,finalScore);
            isWindowVisible = false;
            setVisible(false);
        }
    }

}
