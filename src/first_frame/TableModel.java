package first_frame;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

/**
 * Created by anonymous on 01.03.2017.
 */
public class TableModel extends AbstractTableModel {

    private int columnCount = 2;
    private ArrayList<String []> dataArrayList;

    public TableModel()
    {
        dataArrayList = new ArrayList<>();
        for (int i=0; i<dataArrayList.size();i++)
        {
            dataArrayList.add(new String[getColumnCount()]);
        }
    }

    @Override
    public int getRowCount() {
        return dataArrayList.size();
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public String getColumnName(int columnIndex)
    {
        switch (columnIndex)
        {
            case 0: return "#1";
            case 1: return "#2";
        }
        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String []rows = dataArrayList.get(rowIndex);
        return rows[columnIndex];
    }

    public void addData(String []row)
    {
        String []rowTable = new String[getColumnCount()];
        rowTable = row;
        dataArrayList.add(rowTable);
    }

    public void clearData()
    {
        for (int i=0; i<dataArrayList.size();i++)
        {
            dataArrayList.clear();
        }
    }
}