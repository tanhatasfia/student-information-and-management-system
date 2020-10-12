import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.*;

public class add_course extends add_information{
    private static String s;
    private JPanel courserapanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JTable table1;
    private JTextField textField3;
    private JButton button2;


    public add_course() {

        super();
        Object [] colomns={"Name","emp ID"," credit"};
        DefaultTableModel model= new DefaultTableModel();
        model.setColumnIdentifiers(colomns);
        table1.setModel(model);
        table1.getColumnModel().getColumn(0).setPreferredWidth(180);
        table1.getColumnModel().getColumn(1).setPreferredWidth(180);
        table1.getColumnModel().getColumn(2).setPreferredWidth(180);
        table1.setRowHeight(40);

        table1.setBackground(Color.cyan);


        Object []rows=new Object[3];
        table1=new JTable();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                rows[0]=textField1.getText();

                rows[1]=textField2.getText();
                rows[2]=textField3.getText();
                model.addRow(rows);
            }
        });


    }


    public JPanel getCourserapanel() {
        return courserapanel;
    }


}

