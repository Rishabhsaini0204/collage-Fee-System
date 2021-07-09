import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;

public class fees extends Frame
{
	 JLabel title, studentname, fatherN, roll,email, contact, address, feeLabel,gender, nationality, passingY12, marks12, passingY10, l15; 
      JTextField stnametf, fatherNametf, rolltf, emailtf, contacttf, natuionlitytf, markstf, tf9, tf10; 
      JTextArea area2, addressArea; 
      JRadioButton regularBtn, privateBtn, hostlerBtn,dayBtn, rb5, rb6,rb7; 
      JFileChooser f1; 
	
      fees(){
      
      title = new JLabel("Fee Report Slip"); 
      title.setBounds(550, 50, 800, 30);
      
      studentname = new JLabel( "Student Name:"); 
      studentname.setBounds(50, 150, 250, 20); 

      stnametf = new JTextField(); 
      stnametf.setBounds(250, 150, 250, 20); 

      fatherN = new JLabel( "Father Name:"); 
      fatherN.setBounds(50, 200, 250, 20); 

      fatherNametf = new JTextField(); 
      fatherNametf.setBounds(250, 200, 250, 20); 

      roll = new JLabel("Roll Number:"); 
      roll.setBounds(50, 250, 250, 20); 

      rolltf = new JTextField(); 
      rolltf.setBounds(250, 250, 250, 20); 

      email = new JLabel("Email ID:"); 
      email.setBounds(50, 300, 250, 20); 

      emailtf = new JTextField(); 
      emailtf.setBounds(250, 300, 250, 20); 

      contact = new JLabel("Contact Number:"); 
      contact.setBounds(50, 350, 250, 20); 

      contacttf = new JTextField(); 
      contacttf.setBounds(250, 350, 250, 20); 

      address = new JLabel("Address:"); 
      address.setBounds(50, 400, 250, 20); 

      addressArea = new JTextArea(); 
      addressArea.setBounds(250, 400, 250, 90); 

      gender = new JLabel("Gender:"); 
      gender.setBounds(50, 500, 300, 20); 

      JRadioButton male= new JRadioButton(" Male"); 
      JRadioButton female = new JRadioButton(" Female");
      JRadioButton other=new JRadioButton("other");
     
      male.setBounds(250, 500, 100, 30); 
      female.setBounds(350, 500, 100, 30); 
      other.setBounds(450,500,100,30);
      ButtonGroup bg = new ButtonGroup(); 
      bg.add(male); 
      bg.add(female);
      bg.add(other);

      nationality = new JLabel("Nationality:"); 
      nationality.setBounds(50, 550, 250, 20); 

      natuionlitytf = new JTextField(); 
      natuionlitytf.setBounds(250, 550, 250, 20); 

      passingY10 = new JLabel( "Year of passing 10th"); 
      passingY10.setBounds(50, 600, 250, 20); 

      String language[] = { "2021", "2020", "2019","2018","2017","2016", "2015", "2014","2013","2012"}; 

      final JComboBox cb1= new JComboBox(language); 
      cb1.setBounds(250, 600, 90, 20); 

      passingY12 = new JLabel( "Year of passing 12th"); 
      passingY12.setBounds(50, 650, 250, 20); 

      String languagess[]= { "2021", "2020", "2019","2018","2017","2016", "2015", "2014","2013","2012"}; 

      marks12 = new JLabel(" Marks in 12th:"); 
      marks12.setBounds(50, 700, 250, 20); 

      markstf = new JTextField(); 
      markstf.setBounds(250, 700, 250, 20); 

    
       l15 = new JLabel("", JLabel.CENTER); 
      l15.setBounds(900, 50, 600, 200); 
      
      final JComboBox cb2 = new JComboBox(languagess); 
      cb2.setBounds(250, 650, 90, 20); 
      
      

      regularBtn = new JRadioButton("REGULAR"); 
      regularBtn.setBounds(600, 150, 100, 30); 

      privateBtn = new JRadioButton("PRIVATE"); 
      privateBtn.setBounds(700, 150, 100, 30); 

      ButtonGroup bg1 = new ButtonGroup(); 

      bg1.add(regularBtn); 
      bg1.add(privateBtn); 

      hostlerBtn = new JRadioButton("HOSTELLER"); 
      hostlerBtn.setBounds(800, 250, 100, 30); 

      dayBtn = new JRadioButton("DAY SCHOLAR"); 
      dayBtn.setBounds(900, 250, 120, 30); 

      ButtonGroup bg2 = new ButtonGroup(); 
      bg2.add(hostlerBtn); 
      bg2.add(dayBtn); 

      feeLabel = new JLabel("Course With Fees:"); 
      feeLabel.setBounds(600, 200, 250, 20); 
      
      String languages[]= { "CSE", "ECE","EEE","CIVIL", "MECH" }; 
      
      final JComboBox cb = new JComboBox(languages); 
      cb.setBounds(600, 250, 90, 20); 

      final JLabel label = new JLabel(); 
      label.setBounds(600, 400, 700, 50); 
 
      JButton show = new JButton("Show"); 
      show.setBounds(950, 350, 80, 30); 

      final DefaultListModel<String> li1= new DefaultListModel<>(); 
      li1.addElement("CSE (3, 50, 000)"); 
      li1.addElement("ECE (2, 50, 000)"); 
      li1.addElement("EEE (1, 50, 000)"); 
      li1.addElement("MECH(2, 00, 000)"); 
      li1.addElement("CIVIL(1, 00, 000)"); 
     

      final JList<String> list1 = new JList<>(li1); 
      list1.setBounds(600, 300, 100, 100); 

      DefaultListModel<String> li2 = new DefaultListModel<>(); 

      li2.addElement("2 SHARE(1,50, 000)"); 
      li2.addElement("3 SHARE(1,40, 000)"); 
      li2.addElement("5 SHARE(1,20, 000)"); 
      li2.addElement("8 SHARE(1,10, 000)"); 
      li2.addElement( "bus(40, 000)"); 

      final JList<String> list2 = new JList<>(li2); 
      list2.setBounds( 800, 300, 120, 100); 

      JButton Receipt = new JButton("Generate Receipt"); 
      Receipt.setBounds(600, 450, 150, 30); 
      
      JButton reset = new JButton("Reset"); 
      reset.setBounds(750, 450, 150, 30); 
      
      JButton Print = new JButton("Print"); 
      Print.setBounds(900, 450, 150, 30); 
      
      area2 = new JTextArea(); 
      area2.setBounds(600, 500, 450, 250); 

      add(title); 
      add(studentname); 
      add(fatherN); 
      add(roll); 
      add(email); 
      add(contact); 
      add(address); 
      add(feeLabel); 
      add(gender); 
      add(nationality); 
      add(passingY10); 
      add(passingY12); 
      add(marks12); 
      add(stnametf); 
      add(fatherNametf); 
      add(rolltf); 
      add(emailtf); 
      add(contacttf); 
      add(natuionlitytf); 
      add(markstf); 
      add(addressArea); 
      add(area2); 
       add(l15); 
      add(regularBtn); 
      add(privateBtn); 
      add(hostlerBtn); 
      add(dayBtn); 
      add(male); 
      add(female);
      add(other);
      add(cb); 
      add(cb1); 
      add(cb2); 
      add(list1); 
      add(list2); 
      add(show); 
      add(label); 
      add(Receipt); 
      add(reset); 
      add(Print); 

      show.addActionListener(new ActionListener() {
		@SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent e) {
			String data=" ";
			 if (list1.getSelectedIndex() != -1)
			     { 
                 data = "You had selected the Group:"+ list1.getSelectedValue(); 
                 label.setText(data); 
			     }
			if(list2.getSelectedIndex() !=-1) {
				
				data+=" and Hostel with the" + "facility of:";      
				  
                for (Object frame : 
                	list2.getSelectedValues()) { 
                    data += frame + " "; 
                } 
            } 
			
			else if(list1.getSelectedIndex()==-1 && list1.getSelectedIndex()==-1)
				{data="You Have Not Selected any option ";}
            label.setText(data); 
		}  
  	  
      });
      
      reset.addActionListener( new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			 { 
                 area2.setText(""); 
                 addressArea.setText(" "); 
                 stnametf.setText(""); 
                 fatherNametf.setText(""); 
                 rolltf.setText(""); 
                 emailtf.setText(""); 
                 contacttf.setText(""); 
                 natuionlitytf.setText(" "); 
                 markstf.setText("");
             } 
		} }); 
      
      Print.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			  try {
				  area2.print();
				  
			  }
			  catch(java.awt.print.PrinterException a)
			  {
				  System.err.format("No Priner Found", a.getMessage());
				  
			  }
			
		}});
      
      
      
      
      Receipt.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			area2.setText( 
                    "--------------------------------"
                    + "--------------------------"
                    + "--------------------------"
                    + "--------------------------"
                    + "-------------------\n"
                    + "Receipt By :- Rishabh saini,MCA(2021)\n"
                    + "--------------------------------"
                    + "-----------FEE RECEIPT----"
                    + "--------------------------"
                    + "--------------------------"
                    + "-------------------\n"); 
			area2.setText(area2.getText()
					+"Student Name: "
					+stnametf.getText()
					+"\n");
            area2.setText(area2.getText() 
                    + "Father's Name: "
                    + fatherNametf.getText() 
                    + "\n"); 
            if(male.isSelected()) {
            	area2.setText(area2.getText()+"Gender: male"+"\n");
            	
            }
            if(female.isSelected()) {
            	area2.setText(area2.getText()+"Gender: female"+"\n");
            	
            }
            if(other.isSelected()) {
            	area2.setText(area2.getText()+"Gender: other"+"\n");
            	
            }
           area2.setText(area2.getText() 
                    + "Roll Number: "
                    + rolltf.getText() 
                    + "\n"); 
           area2.setText(area2.getText() 
                    + "Email ID: "
                    + emailtf.getText() 
                    + "\n"); 
           area2.setText(area2.getText() 
                    + "Contact Number: "
                    + contacttf.getText() 
                    + "\n"); 
      
          area2.setText(area2.getText() 
                    + "You Chosen : "
                    + cb.getSelectedItem().toString() 
                    + "\n"); 
         
       
          
      if (regularBtn.isSelected())
      { 
          area2.setText(area2.getText()+"Wants to Join : Regular"+"\n");
			
      }	
      if(privateBtn.isSelected())
      {
    	  area2.setText(area2.getText()+"Wants to Join : Private"+"\n");
      }
      
      if(hostlerBtn.isSelected()) {
    	    
    	  area2.setText(area2.getText()+"Want to be: Hostile"+"\n");
      }
      if(dayBtn.isSelected())
      {
    	  area2.setText(area2.getText()+"Want to  :By Collage Bus" +"\n");
      }
	    
      area2.setText(area2.getText()+"Had Choosen: "+ list1.getSelectedValue().toString()+" \t And " + list2.getSelectedValue().toString()+"\n" );
  
      
      int index1=list1.getSelectedIndex();
      
      int index2=list2.getSelectedIndex();
      
  if((index1==0)&&(index2==0))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =5,00,00");
  }
     
  if((index1==0)&&(index2==1))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =4,90,000");
  }
  if((index1==0)&&(index2==2))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =4,70,00 ");
  }
  if((index1==0)&&(index2==3))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =4,60,000 ");
  }
      
  if((index1==0)&&(index2==4))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =3,90,000 ");
  }
  
  
  
  if((index1==1)&&(index2==0))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =4,00,00");
  }
     
  if((index1==1)&&(index2==1))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =3,90,000");
  }
  if((index1==1)&&(index2==2))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =3,70,00 ");
  }
  if((index1==1)&&(index2==3))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =3,60,000 ");
  }
      
  if((index1==1)&&(index2==4))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =2,90,000 ");
  }
      
  
  
    if((index1==2)&&(index2==0))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =3,00,00");
  }
     
  if((index1==2)&&(index2==1))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =2,90,000");
  }
  if((index1==2)&&(index2==2))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =2,70,00 ");
  }
  if((index1==2)&&(index2==3))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =2,60,000 ");
  }
      
  if((index1==2)&&(index2==4))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =1,90,000 ");
  }
      
  
  
  if((index1==3)&&(index2==0))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =3,50,00");
  }
     
  if((index1==3)&&(index2==1))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =3,40,000");
  }
  if((index1==3)&&(index2==2))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =3,20,00 ");
  }
  if((index1==3)&&(index2==3))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =3,10,000 ");
  }
      
  if((index1==3)&&(index2==4))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =2,40,000 ");
  }
      
  
  if((index1==4)&&(index2==0))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =2,50,00");
  }
     
  if((index1==4)&&(index2==1))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =2,40,000");
  }
  if((index1==4)&&(index2==2))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =2,20,00 ");
  }
  if((index1==4)&&(index2==3))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =2,10,000 ");
  }
      
  if((index1==4)&&(index2==4))
  {
	  area2.setText(area2.getText()+"Total Amount To be Paid =1,40,000 ");
	  
  }
      
  if (e.getSource() == Receipt) { 
      try { 
          FileWriter fw = new FileWriter("D:\\java.txt", true); 
                fw.write(area2.getText()); 
                 fw.close(); 
      } 
      catch (Exception ae) { 
          System.out.println(ae); 
      } 
  } 
  JOptionPane.showMessageDialog(area2,"DATA SAVED SUCESSFULLY");
    
		};
});
      
      
      addWindowListener( new WindowAdapter() { 
          public void windowClosing( 
              WindowEvent we) 
          {  System.exit(0); 
          }  }); 
    
      
    setSize(1366,768); 
    setLayout(null);
    setVisible(true); 
    setBackground(Color.orange); 
	
	
      }
	/*
	public static void main(String[] args) {
         	new  fees();

	}*/

}
