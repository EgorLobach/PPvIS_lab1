package first_frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by anonymous on 28.02.2017.
 */
public class MainFrame{
    private static final long serialVersionUID = 2269971701250845501L;

    private String title;
    private Dimension d;
    private JFrame headFrame = new JFrame();

    Task1 task1Panel = new Task1();

    Task2 task2Panel = new Task2();

    Task3 task3Panel = new Task3();

    Task4 task4Panel = new Task4();

    Task5 task5Panel = new Task5();

    public MainFrame(String title ,Dimension d)
    {
        this.title=title;
        this.d=d;
        headFrame.setTitle(title);
        headFrame.setSize(d);
        headFrame.setLayout(new GridBagLayout());
        headFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        headFrame.setLocationRelativeTo(null);

    }

    public void init()
    {
        headFrame.add(task1Panel.initTask1(), new GridBagConstraints(0, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 1, 25, 25), 0, 0));

        headFrame.add(task2Panel.initTask2(), new GridBagConstraints(0, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(25, 1, 1, 1), 0, 0));

        headFrame.add(task3Panel.initTask3(), new GridBagConstraints(1, 0, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 25, 25, 1), 0, 0));

        headFrame.add(task4Panel.initTask4(), new GridBagConstraints(1, 1, 1, 1, 1 , 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(25, 25, 1, 1), 0, 0));

        headFrame.add(task5Panel.initTask5(), new GridBagConstraints(2, 0, 1, 2, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(1, 25,1,1), 0,0));

        headFrame.setVisible(true);
        headFrame.pack();

    }
}