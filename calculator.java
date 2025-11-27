import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.util.Set;
import java.awt.*;
import javax.swing.*;

public class calculator extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button10;
    JButton button11;
    JButton button12;
    JButton button13;
    JButton button14;
    JButton button15;
    JButton button16;
    JButton button17;
    JLabel label;
    JLabel label2;
    JPanel panel;
    JPanel panel2;
    JPanel panel3;
    double ergebnis;
    double zahl1;
    double zahl2;
    double zahl3;
    boolean zaehler = true;
    int test = 0;

    public calculator() {
        this.setTitle("Calculator");
        this.setSize(800, 400);
        this.setLocation(250, 140);

        JPanel result = new JPanel();
        JPanel buttons = new JPanel();
        JPanel calculation = new JPanel();

        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setPreferredSize(new Dimension(160, 40));
        label.setOpaque(true);
        label.setBackground(Color.GRAY);

        label2 = new JLabel();
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setPreferredSize(new Dimension(160, 40));
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton mult = new JButton("*");
        JButton div = new JButton("/");
        JButton zeor = new JButton("0");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton calc = new JButton("=");
        JButton comma = new JButton(",");
        JButton reset = new JButton("C");

        plus.addActionListener(this);
        minus.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);
        zeor.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        calc.addActionListener(this);
        comma.addActionListener(this);
        reset.addActionListener(this);

        result.setLayout(new BorderLayout());
        buttons.setLayout(new GridLayout(0, 3));

        buttons.add(plus);
        buttons.add(minus);
        buttons.add(mult);
        buttons.add(div);
        buttons.add(zeor);
        buttons.add(one);
        buttons.add(two);
        buttons.add(three);
        buttons.add(four);
        buttons.add(five);
        buttons.add(six);
        buttons.add(seven);
        buttons.add(eight);
        buttons.add(nine);
        buttons.add(calc);
        buttons.add(comma);
        buttons.add(reset);

        result.add(buttons, BorderLayout.CENTER);
        result.add(calculation, BorderLayout.SOUTH);
        this.add(result);
    }

    public static void main(String[] args) {
        calculator calc = new calculator();
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }

    ActionListener listener = new ActionListener() {
        @Override

        public void actionPerformed(ActionEvent ae) {
            JButton clicked = (JButton) ae.getSource();
            String value = clicked.getText();
        }
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        // handle button clicks here
    }

}