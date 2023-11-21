package bg.smg;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

public class InitialFrame extends JFrame implements ActionListener {
    private  JLabel aLbl;
    private JLabel bLbl;
            private JLabel clbl;
    private JTextField aTfld;
    private JTextField bTfld;
    private JTextField cTfld;
    private JButton calculate;
    private JTextArea result;

public InitialFrame(){
    this.setTitle("Квадратно уравнение");
    this.setSize(400,240);
this.setLayout(null);

    aLbl=new JLabel("a= ");
    bLbl=new JLabel("b= ");
    clbl=new JLabel("c= ");
 aTfld=new JTextField();
 bTfld=new JTextField();
 cTfld=new JTextField();
 calculate=new JButton("Изчислете корените");
 result=new JTextArea();

     aLbl.setBounds(10,10,20,15);
 aTfld.setBounds(50,10,50,15);
 bLbl.setBounds(150, 10,20,15);
 bTfld.setBounds(170,10,50,15);
    clbl.setBounds(250, 10,20,15);
    cTfld.setBounds(270,10,50,15);
    calculate.setBounds(100, 50,150,20);
 result.setBounds(20,90,340,100);


    this.add(aLbl);
    this.add(aTfld);
    this.add(bLbl);
    this.add(bTfld);
    this.add(clbl);
    this.add(cTfld);
 this.add(calculate);
     this.add(result);
   /*   this.add();*/




    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);




    calculate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            double a = Double.parseDouble(aTfld.getText());
            double b = Double.parseDouble(bTfld.getText());
            double c = Double.parseDouble(cTfld.getText());
            double d = b * b - 4 * a * c;
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                result.setText("x1= " + x1 + "\n x2= " + x2);
            } else if (d < 0) {
                double x = (-b) / (2 * a);
                result.setText("x= " + x);
            } else {
                result.setText("There arent any solutions");
            }
        }
    });


    }
}