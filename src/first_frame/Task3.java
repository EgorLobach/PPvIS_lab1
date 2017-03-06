package first_frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by anonymous on 06.03.2017.
 */
public class Task3 {
    private JTextField textFieldOfTask3 = new JTextField(10);
    private JButton establishRadioButton = new JButton("Установить RadioButton");
    private ButtonGroup groupTask3 = new ButtonGroup();
    private JRadioButton radioButton1ofTask3 = new JRadioButton("1");
    private JRadioButton radioButton2ofTask3 = new JRadioButton("2");
    private JRadioButton radioButton3ofTask3 = new JRadioButton("3");
    private JPanel task3Panel = new JPanel(new GridBagLayout());

    public JPanel initTask3()
    {
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
        return task3Panel;
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
}
