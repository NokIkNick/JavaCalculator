import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application{

    private static JFrame frame;
    private static int numberButtonSize = 50;
    private static int offSet = 50;
    private static JTextPane screen = new JTextPane();
    private static StringBuilder result = new StringBuilder();
    private static boolean error = false;

    public Application(){
        frame = new JFrame("Calculator");
        frame.setResizable(false);
        screen.setEditable(false);
        screen.setBounds(50,100,230,50);
        screen.setFont(new Font("Arial",Font.BOLD,40));

        JButton buttonOne = new JButton("1");
        buttonOne.setBounds(50,200+offSet,numberButtonSize,numberButtonSize);
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validInput() && !error){
                    updateText("1");
                }else {
                    errorText();
                }
            }
        });


        JButton buttonTwo = new JButton("2");
        buttonTwo.setBounds(110,200+offSet,numberButtonSize,numberButtonSize);

        JButton buttonThree = new JButton("3");
        buttonThree.setBounds(170,200+offSet,numberButtonSize,numberButtonSize);

        JButton buttonFour = new JButton("4");
        buttonFour.setBounds(50,260+offSet,numberButtonSize,numberButtonSize);

        JButton buttonFive = new JButton("5");
        buttonFive.setBounds(110,260+offSet,numberButtonSize,numberButtonSize);

        JButton buttonSix = new JButton("6");
        buttonSix.setBounds(170,260+offSet,numberButtonSize,numberButtonSize);

        JButton buttonSeven = new JButton("7");
        buttonSeven.setBounds(50,320+offSet,numberButtonSize,numberButtonSize);

        JButton buttonEight = new JButton("8");
        buttonEight.setBounds(110,320+offSet,numberButtonSize,numberButtonSize);

        JButton buttonNine = new JButton("9");
        buttonNine.setBounds(170,320+offSet,numberButtonSize,numberButtonSize);

        JButton plusButton = new JButton("+");
        plusButton.setBounds(230,200+offSet,50,80);

        JButton minusButton = new JButton("-");
        minusButton.setBounds(230,290+offSet,50,80);

        JButton clearButton = new JButton("C");
        clearButton.setBounds(230,140+offSet,numberButtonSize,numberButtonSize);

        JButton divideButton = new JButton("/");
        divideButton.setBounds(170,140+offSet,numberButtonSize,numberButtonSize);

        JButton multiplyButton = new JButton("*");
        multiplyButton.setBounds(110,140+offSet,numberButtonSize,numberButtonSize);

        JButton allClearButton = new JButton("AC");
        allClearButton.setBounds(50,140+offSet,numberButtonSize,numberButtonSize);

        frame.add(screen);
        frame.add(buttonOne);
        frame.add(buttonTwo);
        frame.add(buttonThree);
        frame.add(buttonFour);
        frame.add(buttonFive);
        frame.add(buttonSix);
        frame.add(buttonSeven);
        frame.add(buttonEight);
        frame.add(buttonNine);
        frame.add(plusButton);
        frame.add(minusButton);
        frame.add(clearButton);
        frame.add(divideButton);
        frame.add(multiplyButton);
        frame.add(allClearButton);

        frame.setLayout(null);
        frame.setSize(360,600);
        frame.setVisible(true);

    }

    private static void updateText(String txt){
        result.append(txt);
        screen.setText(result.toString());
    }

    private static void errorText(){
        result.setLength(0);
        result.append("ERR");
        error = true;
    }

    private static boolean validInput(){
        if(result.length() < 8){
            return true;
        }else {
            return false;
        }
    }
}
