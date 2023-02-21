// ZEYNEP CINDEMIR - 201401012
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    JButton[] numBtns = new JButton[10];
    JButton[] funcBtns = new JButton[7];
    JButton addBtn, mulBtn, subBtn, divBtn;
    JButton CBtn, dotBtn, equBtn;
    JPanel panel;
    JPanel txtPanel;
    JPanel text;
    double num1 = 0, num2 = 0, res = 0;
    char opr;
    String str = "";

    public Calculator() {

        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 1000);
        setResizable(false);

        setLayout(null);

        addBtn = new JButton("+");
        mulBtn = new JButton("x");
        subBtn = new JButton("-");
        divBtn = new JButton("÷");
        CBtn = new JButton("C");
        dotBtn = new JButton(".");
        equBtn = new JButton("=");

        funcBtns[0] = addBtn;
        funcBtns[1] = mulBtn;
        funcBtns[2] = subBtn;
        funcBtns[3] = divBtn;
        funcBtns[4] = CBtn;
        funcBtns[5] = dotBtn;
        funcBtns[6] = equBtn;

        for (JButton b : funcBtns) {
            b.addActionListener(this);
            b.setFocusable(false);
            b.setBackground(Color.BLUE);
        }

        for (int i = 0; i < numBtns.length; i++) {
            numBtns[i] = new JButton(String.valueOf(i));
            numBtns[i].addActionListener(this);
            numBtns[i].setFocusable(false);
            numBtns[i].setBackground(Color.BLUE);
        }

        CBtn.setBounds(50, 135, 650, 75);

        txtPanel = new JPanel();
        txtPanel.setBounds(50, 50, 650, 75);
        txtPanel.setBackground(Color.WHITE);
        txtPanel.setLayout(null);

        panel = new JPanel();
        panel.setBounds(50, 230, 650, 500);
        panel.setLayout(new GridLayout(4, 4, 20, 20));

        panel.add(numBtns[7]);
        panel.add(numBtns[8]);
        panel.add(numBtns[9]);
        panel.add(addBtn);
        panel.add(numBtns[4]);
        panel.add(numBtns[5]);
        panel.add(numBtns[6]);
        panel.add(subBtn);
        panel.add(numBtns[1]);
        panel.add(numBtns[2]);
        panel.add(numBtns[3]);
        panel.add(mulBtn);
        panel.add(numBtns[0]);
        panel.add(dotBtn);
        panel.add(equBtn);
        panel.add(divBtn);

        add(CBtn);
        add(txtPanel);
        add(panel);

        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numBtns[i]) {
                str = str.concat(String.valueOf(i));

                if(str.length() > 10)
                    str = str.substring(0,10);
            }
        }

        if (e.getSource() == dotBtn) {
            str = str.concat(".");
        }

        txtPanel.removeAll();
        text = new MyPanel(str, 620, 0);
        txtPanel.add(text);
        text.setBounds(0, 30, 650, 100);
        txtPanel.revalidate();
        txtPanel.repaint();


        if (e.getSource() == addBtn) {
            if(!str.equals(""))
                num1 = Double.parseDouble(str);
            opr = '+';

            repaint();
            str = "";
        }


        if (e.getSource() == subBtn) {
            if(!str.equals(""))
                num1 = Double.parseDouble(str);
            opr = '-';

            repaint();
            str = "";
        }

        if (e.getSource() == mulBtn) {
            if(!str.equals(""))
                num1 = Double.parseDouble(str);
            opr = 'x';

            repaint();
            str = "";
        }
        if (e.getSource() == divBtn) {
            if(!str.equals(""))
                num1 = Double.parseDouble(str);
            opr = '÷';

            repaint();
            str = "";
        }
        if (e.getSource() == equBtn) {
            if (!str.equals("")) {
                num2 = Double.parseDouble(str);

                switch (opr) {
                    case '+' -> res = num1 + num2;
                    case '-' -> res = num1 - num2;
                    case 'x' -> res = num1 * num2;
                    case '÷' -> res = num1 / num2;
                }

                if (res == Math.floor(res))
                    str = Integer.toString((int) res);
                else
                    str = Double.toString(res);


                if (str.length() > 10)
                    str = str.substring(0,10);

                txtPanel.removeAll();
                text = new MyPanel(str, 620, 0);
                txtPanel.add(text);
                text.setBounds(0, 30, 650, 100);
                txtPanel.revalidate();
                txtPanel.repaint();

                num1 = res;
            }
        }

        if (e.getSource() == CBtn) {
            str = "";
            res = 0;
            num1 = 0;
            num2 = 0;

            txtPanel.removeAll();
            txtPanel.repaint();
        }

    }
}


