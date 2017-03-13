package first_frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by anonymous on 06.03.2017.
 */
public class Task5 {
    private JTextField textFieldOfTask5 = new JTextField(10);
    private JButton addToTableButton = new JButton("Добавить в таблицу");
    private JButton transferredTo2Button = new JButton("Перенести в 2 строку");
    private JButton transferredTo1Button = new JButton("Перенести в 1 строку");
    private JPanel task5Panel = new JPanel(new GridBagLayout());
    private TableModel tableModel = new TableModel();
    private JTable table = new JTable(tableModel);
    private JScrollPane tableScrollPane = new JScrollPane(table);

    public JPanel initTask5()
    {
        table.setRowHeight(20);
        table.setFont(new Font("fontForFieldOFTable", Font.ITALIC, 17));
        textFieldOfTask5.setFont(new Font("fontForFieldOFTask5", Font.ITALIC, 17));
        addToTableButton.addActionListener(new Task5AddToTableActionListener());
        transferredTo2Button.addActionListener(new Task5TransferredTo2ButtonActionListener());
        transferredTo1Button.addActionListener(new Task5TransferredTo1ButtonActionListener());
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
        return task5Panel;
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
                str[1]="";
                tableModel.addData(str);
            }
            textFieldOfTask5.setText("");
            table.updateUI();

        }
    }

    public class Task5TransferredTo2ButtonActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent event) {
            String [] str = new String[2];
            str[1]=(String)tableModel.getValueAt(table.getSelectedRow(), table.getSelectedColumn());
            if (table.getSelectedColumn()==1||str[1].trim().isEmpty())
                return;
            str[0]="";
            tableModel.removeData(table.getSelectedRow());
            tableModel.addData(str, table.getSelectedRow());
            table.updateUI();
        }
    }

    public class Task5TransferredTo1ButtonActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent event) {
            String [] str = new String[2];
            str[0]=(String)tableModel.getValueAt(table.getSelectedRow(), table.getSelectedColumn());
            if (table.getSelectedColumn()==0||str[0].trim().isEmpty())
                return;
            str[1]="";
            tableModel.removeData(table.getSelectedRow());
            tableModel.addData(str, table.getSelectedRow());
            table.updateUI();
        }
    }
}
