package first_frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by anonymous on 28.02.2017.
 */
public class MainFrame extends JFrame {
    private static final long serialVersionUID = 2269971701250845501L;

    private String title;
    private Dimension d;

    //task1
    private JTextField textFieldOfTask1 = new JTextField(10);
    private JButton addButton = new JButton("Добавить");
    private JComboBox<String> task1ComboBox = new JComboBox<>();
    private JPanel task1Panel = new JPanel(new GridBagLayout());

    //task2
    private JTextField textFieldOfTask2 = new JTextField(10);
    private JButton enterButton = new JButton("Занести");
    private JButton exchangeButton = new JButton("Поменять");
    private JPanel task2Panel = new JPanel(new GridBagLayout());

    //task3
    private JTextField textFieldOfTask3 = new JTextField(10);
    private JButton establishButton = new JButton("Установить");
    private ButtonGroup groupTask3 = new ButtonGroup();
    private JRadioButton radioButton1ofTask3 = new JRadioButton("RadioButton1");
    private JRadioButton radioButton2ofTask3 = new JRadioButton("RadioButton2");
    private JRadioButton radioButton3ofTask3 = new JRadioButton("RadioButton3");
    private JPanel task3Panel = new JPanel(new GridBagLayout());



    public MainFrame(String title ,Dimension d)
    {
        this.title=title;
        this.d=d;
    }

    public void init()
    {
        setTitle(title);
        setSize(d);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //task1
        textFieldOfTask1.setFont(new Font("fontForFieldOfTask1", Font.ITALIC,17));
        addButton.addActionListener(new Task1ButtonActionListener());
        task1Panel.add(textFieldOfTask1, new GridBagConstraints(0, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        task1Panel.add(addButton, new GridBagConstraints(1, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        task1Panel.add(task1ComboBox, new GridBagConstraints(0, 1, 2, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(task1Panel, new GridBagConstraints(0, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 25, 25), 0, 0));

        //task1end********************************************

        //task2
        textFieldOfTask2.setFont(new Font("fontForFieldOfTask2", Font.ITALIC,17));
        enterButton.addActionListener(new Task2EnterButtonActionListener());
        exchangeButton.addActionListener(new Task2ExchangeButtonActionListener());
        task2Panel.add(textFieldOfTask2, new GridBagConstraints(0, 0, 2, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        task2Panel.add(enterButton, new GridBagConstraints(0, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        task2Panel.add(exchangeButton, new GridBagConstraints(1, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(task2Panel, new GridBagConstraints(0, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(25, 1, 1, 1), 0, 0));


        //task2end*********************************************

        //task3
        textFieldOfTask3.setFont(new Font("fontForFieldOfTask3", Font.ITALIC,17));

        task3Panel.add(textFieldOfTask3, new GridBagConstraints(0, 0, 2, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        task3Panel.add(establishButton, new GridBagConstraints(0, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        groupTask3.add(radioButton1ofTask3);
        groupTask3.add(radioButton2ofTask3);
        groupTask3.add(radioButton3ofTask3);
        establishButton.addActionListener(new Task3EstablishButtonActionListener());
        task3Panel.add(radioButton1ofTask3, new GridBagConstraints(0, 2, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        task3Panel.add(radioButton2ofTask3, new GridBagConstraints(0, 3, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        task3Panel.add(radioButton3ofTask3, new GridBagConstraints(0, 4, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(task3Panel, new GridBagConstraints(1, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 25, 1, 1), 0, 0));

        //task3end***********************************************

        //task4


        //task4end****************************************************

        setVisible(true);
        pack();

    }

    //ActionListener

    public class Task1ButtonActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {

            if ((textFieldOfTask1.getText()).trim().isEmpty()) {}
            else {
                for (int i = 0; i < task1ComboBox.getItemCount(); i++) {
                    if ((textFieldOfTask1.getText()).equals(task1ComboBox.getItemAt(i))) {
                        JOptionPane.showMessageDialog(new JFrame(), "Такая строка уже существует!!!");
                        return;
                    }
                }
                task1ComboBox.addItem(textFieldOfTask1.getText());
            }
            textFieldOfTask1.setText("");
        }
    }

    public class Task2EnterButtonActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if ((textFieldOfTask2.getText()).trim().isEmpty()) {}
            else {
                exchangeButton.setText(textFieldOfTask2.getText());
            }
            textFieldOfTask2.setText("");
        }
    }

    public class Task2ExchangeButtonActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String temp = exchangeButton.getText();
            exchangeButton.setText(enterButton.getText());
            enterButton.setText(temp);
        }
    }

    public class Task3EstablishButtonActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if ((textFieldOfTask3.getText()).trim().isEmpty()) {}
            else
            {
                if(textFieldOfTask3.getText().equals(radioButton1ofTask3.getText()))
                    radioButton1ofTask3.setSelected(true);
                else if(textFieldOfTask3.getText().equals(radioButton2ofTask3.getText()))
                    radioButton2ofTask3.setSelected(true);
                else if(textFieldOfTask3.getText().equals(radioButton3ofTask3.getText()))
                    radioButton3ofTask3.setSelected(true);
                else JOptionPane.showMessageDialog(new JFrame(), "Такой кнопки не существует!!!");
            }
            textFieldOfTask3.setText("");
        }
    }
}