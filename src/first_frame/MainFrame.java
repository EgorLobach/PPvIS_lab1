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
    private JButton establishRadioButton = new JButton("Установить RadioButton");
    private ButtonGroup groupTask3 = new ButtonGroup();
    private JRadioButton radioButton1ofTask3 = new JRadioButton("1");
    private JRadioButton radioButton2ofTask3 = new JRadioButton("2");
    private JRadioButton radioButton3ofTask3 = new JRadioButton("3");
    private JPanel task3Panel = new JPanel(new GridBagLayout());

    //task4
    private JTextField textFieldOfTask4 = new JTextField(10);
    private JButton establishCheckBox = new JButton("Установить CheckBox");
    private JCheckBox checkBox1ofTask4 = new JCheckBox("1");
    private JCheckBox checkBox2ofTask4 = new JCheckBox("2");
    private JCheckBox checkBox3ofTask4 = new JCheckBox("3");
    private JPanel task4Panel = new JPanel(new GridBagLayout());

    //task5
    private JTextField textFieldOfTask5 = new JTextField(10);
    private JButton addToTableButton = new JButton("Добавить в таблицу");
    private JButton transferredTo2Button = new JButton("Перенести в 2 строку");
    private JButton transferredTo1Button = new JButton("Перенести в 1 строку");
    private JPanel task5Panel = new JPanel(new GridBagLayout());
    private TableModel tableModel = new TableModel();
    private JTable table = new JTable(tableModel);
    private JScrollPane tableScrollPane = new JScrollPane(table);




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
        task3Panel.add(establishRadioButton, new GridBagConstraints(0, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        groupTask3.add(radioButton1ofTask3);
        groupTask3.add(radioButton2ofTask3);
        groupTask3.add(radioButton3ofTask3);
        establishRadioButton.addActionListener(new Task3EstablishRadioButtonActionListener());
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
                new Insets(1, 25, 25, 1), 0, 0));

        //task3end***********************************************

        //task4


        textFieldOfTask4.setFont(new Font("fontForFieldOfTask4", Font.ITALIC,17));
        establishCheckBox.addActionListener(new Task4EstablishCheckBoxActionListener());
        task4Panel.add(textFieldOfTask4, new GridBagConstraints(0, 0, 2, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        task4Panel.add(establishCheckBox, new GridBagConstraints(0, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        task4Panel.add(checkBox1ofTask4, new GridBagConstraints(0, 2, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        task4Panel.add(checkBox2ofTask4, new GridBagConstraints(0, 3, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        task4Panel.add(checkBox3ofTask4, new GridBagConstraints(0, 4, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        add(task4Panel, new GridBagConstraints(1, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(25, 25, 1, 1), 0, 0));

        //task4end***********************************************

        //task5
        table.setRowHeight(20);
        table.setFont(new Font("fontForFieldOFTable", Font.ITALIC, 17));
        textFieldOfTask5.setFont(new Font("fontForFieldOFTask5", Font.ITALIC, 17));
        addToTableButton.addActionListener(new Task5AddToTableActionListener());
        tableScrollPane.setPreferredSize(new Dimension(100,200));
        task5Panel.add(tableScrollPane, new GridBagConstraints(0, 1, 2, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        task5Panel.add(textFieldOfTask5, new GridBagConstraints(0, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        task5Panel.add(addToTableButton, new GridBagConstraints(1, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        task5Panel.add(transferredTo2Button, new GridBagConstraints(0, 2, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        task5Panel.add(transferredTo1Button, new GridBagConstraints(1, 2, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        add(task5Panel, new GridBagConstraints(2, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 25,1,1), 0,0));

        //task5end***********************************************

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



    public class Task3EstablishRadioButtonActionListener implements ActionListener
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


    public class Task4EstablishCheckBoxActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
           /*
            if ((textFieldOfTask4.getText()).trim().isEmpty()) {}
            else
            {
                if(textFieldOfTask4.getText().equals(checkBox1ofTask4.getText()))
                    checkBox1ofTask4.setSelected(true);
                else if(textFieldOfTask4.getText().equals(checkBox2ofTask4.getText()))
                    checkBox2ofTask4.setSelected(true);
                else if(textFieldOfTask4.getText().equals(checkBox3ofTask4.getText()))
                    checkBox3ofTask4.setSelected(true);
                else JOptionPane.showMessageDialog(new JFrame(), "Такой кнопки не существует!!!");
            }
            textFieldOfTask4.setText("");
            */
            if ((textFieldOfTask4.getText()).trim().isEmpty()) {}
            else
            {
                String[] temp = textFieldOfTask4.getText().split(" ");
                for (int i=0;i<temp.length;i++)
                {
                    if (temp[i]==" ") {}
                    else if(temp[i].equals(checkBox1ofTask4.getText()))
                        checkBox1ofTask4.setSelected(true);
                    else if(temp[i].equals(checkBox2ofTask4.getText()))
                        checkBox2ofTask4.setSelected(true);
                    else if(temp[i].equals(checkBox3ofTask4.getText()))
                        checkBox3ofTask4.setSelected(true);
                    else JOptionPane.showMessageDialog(new JFrame(), "Такой кнопки не существует!!!");
                }
            }
            textFieldOfTask4.setText("");
        }
    }

    public class Task5AddToTableActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent event) {
            if ((textFieldOfTask5.getText()).trim().isEmpty()) {}
            else
            {
                String [] str = new String[2];
                str[0]=textFieldOfTask5.getText();
                str[1]=" ";
                tableModel.addData(str);
            }
            textFieldOfTask5.setText("");
            table.updateUI();

        }
    }



    /*public class Task5AddToTableActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent event) {
            addToTableButton.setText(textFieldOfTask5.getSelectedText());
        }
    }
    */
}