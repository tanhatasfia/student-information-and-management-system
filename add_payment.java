import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class add_payment {
    private JPanel paymentpanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    private JTable table1;

    public add_payment() {

        Object[] colomns = {"Name", "emp ID", " credit"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(colomns);
        table1.setModel(model);
        table1.setRowHeight(40);
        table1.setBackground(Color.cyan);

        Object[] rows = new Object[3];
        table1 = new JTable();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                rows[0] = textField1.getText();
                rows[1] = textField2.getText();
                rows[2] = textField3.getText();
                model.addRow(rows);
            }
        });


    }

    public JPanel getPaymentpanel() {
        return paymentpanel;
    }
}