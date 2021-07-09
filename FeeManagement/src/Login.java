import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Login implements ActionListener
{
JFrame frame;
JLabel label1,label2,label3;
JTextField textField1;
JPasswordField passwordField;
JButton Login,Cancel;
fees F;
Login()
{
frame=new JFrame("Login");
frame.getContentPane().setLayout(null);
frame.getContentPane().setBackground(Color.black);

label3=new JLabel("Login ");
label3.setForeground(Color.white);
label3.setBounds(700,150,200,50);
label3.setFont(new Font("Courier new",Font.BOLD,40));

label1=new JLabel("User Name");
label1.setForeground(Color.yellow);
label1.setBounds(450,350,200,30);
label1.setFont(new Font("Courier new",Font.BOLD,20));

label2=new JLabel("Password");
label2.setForeground(Color.yellow);
label2.setBounds(450,400,200,30);
label2.setFont(new Font("Courier new",Font.BOLD,20));

textField1=new JTextField(10);
textField1.setForeground(Color.blue);
textField1.addActionListener(this);
textField1.setBounds(650,350,200,30);


passwordField=new JPasswordField(10);
passwordField.setForeground(Color.blue);
passwordField.setEchoChar('*');
passwordField.addActionListener(this);
passwordField.setBounds(650,400,200,30);

Login=new JButton("Login");
Login.setForeground(Color.BLACK);
Login.addActionListener(this);
Login.setBounds(650,470,80,30);


Cancel=new JButton("Cancel");
Cancel.setForeground(Color.BLACK);
Cancel.addActionListener(this);
Cancel.setBounds(780,470,80,30);


frame.getContentPane().add(label1);
frame.getContentPane().add(label2);
frame.getContentPane().add(textField1);
frame.getContentPane().add(passwordField);
frame.getContentPane().add(Login);
frame.getContentPane().add(Cancel);
frame.getContentPane().add(label3);
frame.setSize(1366,768);
frame.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==Login)
{
if(textField1.getText().length()==0||passwordField.getText().length()==0)
{
JOptionPane.showMessageDialog(null,"Fields are empty");
}
else if(textField1.getText().equals("rishabh") && passwordField.getText().equals("1234"))
{
frame.setVisible(false);
F=new fees();
}
else
{
JOptionPane.showMessageDialog(null,"Invalid User Name or Password");
}
}
if(e.getSource()==Cancel)
{
frame.setVisible(false);
System.exit(0);
}
}


}





