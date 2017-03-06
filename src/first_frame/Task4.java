package first_frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by anonymous on 06.03.2017.
 */
public class Task4 {
    private JTextField textFieldOfTask4 = new JTextField(10);
    private JButton establishCheckBox = new JButton("Установить CheckBox");
    private JCheckBox checkBox1ofTask4 = new JCheckBox("1");
    private JCheckBox checkBox2ofTask4 = new JCheckBox("2");
    private JCheckBox checkBox3ofTask4 = new JCheckBox("3");
    private JPanel task4Panel = new JPanel(new GridBagLayout());

    public JPanel initTask4()
    {

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
        return task4Panel;
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
}
