package first_frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by anonymous on 14.03.2017.
 */
public class AdditionalTask{


    private JButton runAndStopButton = new JButton("Запустить");
    private JButton changeDirectionButton= new JButton("Изменить направление");
    private JPanel task5Panel = new JPanel(new GridBagLayout());
    private TableModel tableModel = new TableModel();
    private JTable table = new JTable(tableModel);
    private JScrollPane tableScrollPane = new JScrollPane(table);
    private boolean runOrStop = false;
    private boolean direction = true;
    private Thread thrd;
    private String[] temp={"", ""};
    private String[] strForColumn1={"qwerty", ""};

    public JPanel initAdditionalTask()
    {
        table.setRowHeight(20);
        table.setFont(new Font("fontForFieldOFTable", Font.ITALIC, 17));

        runAndStopButton.addActionListener(new RunAndStopButtonActionListener());
        changeDirectionButton.addActionListener(new ChangeDirectionButtonActionListener());

        tableScrollPane.setPreferredSize(new Dimension(100,623));

        task5Panel.add(tableScrollPane, new GridBagConstraints(0, 1, 2, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        task5Panel.add(runAndStopButton, new GridBagConstraints(0, 0, 2, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));
        task5Panel.add(changeDirectionButton, new GridBagConstraints(0, 2, 2, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 1, 1), 0, 0));

        initTable();

        Runnable myThread = new Runnable() {
            @Override
            public void run() {
                try
                {
                    for (;;)
                    {
                        Thread.sleep(50);
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                motion();
                            }
                        });
                    }
                }
                catch (InterruptedException e)
                {
                    System.out.println(e);
                }

            }
        };

        thrd = new Thread(myThread);
        thrd.start();

        return task5Panel;
    }

    private void initTable()
    {
        tableModel.addData(strForColumn1);
        for (int i =0;i<29;i++)
            tableModel.addData(temp);
        table.updateUI();
    }

    public void motion()
    {
        if(runOrStop)
        {
            if(direction) {
                int indexOfColumn1 = 0;
                while (((String) tableModel.getValueAt(indexOfColumn1, 0)).isEmpty())
                    indexOfColumn1++;
                if (indexOfColumn1 == tableModel.getRowCount() - 1) {
                    tableModel.changeData(indexOfColumn1, temp);
                    tableModel.changeData(0, strForColumn1);
                } else {
                    tableModel.changeData(indexOfColumn1, temp);
                    tableModel.changeData(indexOfColumn1 + 1, strForColumn1);
                }
                table.updateUI();
            }
            else {
                int indexOfColumn1 = 0;
                while (((String) tableModel.getValueAt(indexOfColumn1, 0)).isEmpty())
                    indexOfColumn1++;
                if (indexOfColumn1 == 0) {
                    tableModel.changeData(indexOfColumn1, temp);
                    tableModel.changeData(tableModel.getRowCount()-1, strForColumn1);
                } else {
                    tableModel.changeData(indexOfColumn1, temp);
                    tableModel.changeData(indexOfColumn1 - 1, strForColumn1);
                }
                table.updateUI();

            }
        }
    }


    public class RunAndStopButtonActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (!runOrStop)
            {
                runOrStop=true;
                runAndStopButton.setText("Остановить");
            }
            else
            {
                runOrStop=false;
                runAndStopButton.setText("Запустить");
            }
        }
    }

    public class ChangeDirectionButtonActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event){
            if (!direction)
                direction=true;
            else direction=false;
        }
    }


}
