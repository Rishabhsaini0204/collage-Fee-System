import java.awt.*;
import javax.swing.*;
class Welcome implements Runnable

{
	
JFrame frame;
JLabel label1,label2,background;
Thread thread;
Login login;
ImageIcon img;

Welcome()
{
  img=new ImageIcon("youtubr.jpg");
  thread=new Thread(this);
  frame=new JFrame("Welcome");
  frame.getContentPane().setLayout(null);
  frame.getContentPane().setBackground(Color.DARK_GRAY);
  
label1=new JLabel("Collage Fee Software ");
label1.setBounds(250,300,1000,70);
label1.setFont(new Font("Courier new",Font.BOLD,60));
label1.setForeground(Color.white);

label2=new JLabel("  By_Rishabh Saini");
label2.setFont(new Font("Courier new",Font.BOLD,35));
label2.setBounds(400,400,800,40);
label2.setForeground(Color.green);

background=new JLabel("",img,JLabel.CENTER);
background.setBounds(0,0,1200,760);

frame.getContentPane().add(label1);
frame.getContentPane().add(label2);
frame.getContentPane().add(background);
frame.setSize(1366,768);
frame.setVisible(true);
thread.start();
}

public void run()
{
int x=1;
while(x<=5)
{
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
x++;
}
frame.setVisible(false);
 login=new Login();
}

public static void main(String args[])
{
new Welcome();
}
}