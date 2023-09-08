import javax.swing.*;  

public class Q12_11 {  
public static void main(String[] args) {  
    JFrame f= new JFrame("Printer");  
 
    JCheckBox checkBox1 = new JCheckBox("Image");  
    checkBox1.setBounds(100,100, 50,50);  
    JCheckBox checkBox2 = new JCheckBox("Text");  
    checkBox2.setBounds(100,150, 50,50);  
    JCheckBox checkBox3 = new JCheckBox("Code");  
    checkBox2.setBounds(100,150, 50,50); 
    f.add(checkBox1);  
    f.add(checkBox2);
    f.add(checkBox3);

    JLabel l1;
    l1=new JLabel("Printer:MyPrinter");  
    l1.setBounds(25,100, 100,30); 
    f.add(l1);
    JButton b1=new JButton("OK");
    JButton b2=new JButton("Cancel");
    JButton b3=new JButton("Setup..");
    JButton b4=new JButton("Help");
    b4.setBounds(300,175,90,30);
    b3.setBounds(300,125,90, 30);
    b2.setBounds(300,75,90, 30);
    b1.setBounds(300,25,90, 30);

          
    f.add(b1); f.add(b2); f.add(b3); f.add(b4);
          
    f.setSize(425,250);
    f.setLayout(null);
    f.setVisible(true);
}  
}  
