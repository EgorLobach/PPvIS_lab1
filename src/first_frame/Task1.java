package first_frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by anonymous on 06.03.2017.
 */
public class Task1 {
    private JTextField textFieldOfTask1 = new JTextField(10);
    private JButton addButton = new JButton("Добавить");
    private JComboBox<String> task1ComboBox = new JComboBox<>();
    private JPanel task1Panel = new JPanel(new GridBagLayout());

    public JPanel initTask1()
    {
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
        return task1Panel;
    }
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
}
