package first_frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by anonymous on 06.03.2017.
 */
public class Task2 {
    private JTextField textFieldOfTask2 = new JTextField(10);
    private JButton enterButton = new JButton("Занести");
    private JButton exchangeButton = new JButton("Поменять");
    private JPanel task2Panel = new JPanel(new GridBagLayout());

    public JPanel initTask2()
    {
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
        return task2Panel;


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

}
