import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class add_information {
    private JPanel panel22;
     JTextField textField1;
     JTextField textField2;
     JTextField textField3;
     JTextField textField4;
     JTextField textField5;
    private JButton addCourseButton;
    private JButton addPaymentButton;
    private JLabel label1;
    private JPanel panelaad;
    private JTextField textField6;
    private JButton submitButton;


    public add_information() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ss=textField4.getText();
                String aaa=textField6.getText();
                if(ss.contains("@") && aaa.length()==11) {

                    JOptionPane.showMessageDialog(null, "successfully added");
                    CSVWriter wr=null;
                    CSVReader ed=null;

                    String aar[]=new String[6];
                    try {
                        wr=new CSVWriter(new FileWriter("temp2.csv",true));


                        aar[0]=textField1.getText();
                        aar[1]=textField2.getText();
                        aar[2]=textField3.getText();
                        aar[3]=textField4.getText();
                        aar[4]=textField5.getText();
                        String s=new String(textField6.getText());
                        aar[5]=s;
                        wr.writeNext(aar);
                        wr.flush();



                    }catch(IOException io){
                        io.printStackTrace();

                    }


                }
                else
                {
                    JOptionPane.showMessageDialog(null,"something wrong with email or phone number ");
                }

            }
        });
        addCourseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                JFrame frame2=new JFrame();
                frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame2.setSize(900,700);


                frame2.add(new add_course().getCourserapanel());
                frame2.setVisible(true);

            }
        });
        addPaymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                    JFrame frame4=new JFrame();
                    frame4.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frame4.setSize(900,700);


                    frame4.add(new add_payment().getPaymentpanel());
                    frame4.setVisible(true);}


        });

    }

    public JPanel getPanelaad() {
        return panelaad;
    }

    public JTextField getTextField4() {
        return textField4;
    }
}
