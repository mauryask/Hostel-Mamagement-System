// Hostel Management Signup

package signup;
import loginconfirm.LoginConfirmActivity;
import login.LoginActivity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class SignupActivity extends JFrame implements ActionListener
 {

    public SignupActivity() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

	   //label object
	
        lheading = new JLabel();
        lname = new JLabel();
        lpassword = new JLabel();
        lemail = new JLabel();
        lcontact = new JLabel();
		licon = new JLabel();
		
		//button object
		
        bsignup = new JButton();
        blogin = new JButton();
		
		//textfield object
		
		jname = new JTextField();
        jpassword= new JTextField();
        jemail = new JTextField();
        jcontact = new JTextField();
		
        

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Exit button
		
        setBackground(new Color(255, 255, 153));
        //setMinimumSize(new Dimension(1390, 740));
		
		setExtendedState(JFrame.MAXIMIZED_BOTH); // code for full screen size
		
        getContentPane().setLayout(null);

		//heading label (hostel management)
		
       lheading.setFont(new Font("Dialog", 1, 36)); 
       lheading.setForeground(new Color(255, 0, 0));
       lheading.setText("Hostel Management System");
       getContentPane().add(lheading);
       lheading.setBounds(420, 40, 600, 52);

	   //name label
	   
        lname.setFont(new Font("Dialog", 0, 18)); 
        lname.setForeground(new Color(0, 0, 0));
        lname.setText("Name");
        getContentPane().add(lname);
        lname.setBounds(790, 210, 74, 29);

		//password label
		
        lpassword.setFont(new Font("Dialog", 0, 18)); 
        lpassword.setForeground(new Color(0, 0, 0));
        lpassword.setText("Password");
        getContentPane().add(lpassword);
        lpassword.setBounds(790, 280, 79, 29);

		//email label
		
        lemail.setFont(new Font("Dialog", 0, 18)); 
        lemail.setForeground(new Color(0, 0, 0));
        lemail.setText("Email");
        getContentPane().add(lemail);
        lemail.setBounds(790, 350, 60, 29);
      
	  //name textfield

        jname.setBackground(new Color(153, 204, 255));
        getContentPane().add(jname);
        jname.setBounds(880, 210, 203, 29);

		//contact label
		
        lcontact.setFont(new Font("Dialog", 0, 18)); 
        lcontact.setForeground(new Color(0, 0, 0));
        lcontact.setText("Contact");
        getContentPane().add(lcontact);
        lcontact.setBounds(790, 420, 62, 29);

		// signup button
		
        bsignup.setBackground(new Color(51, 255, 102));
        bsignup.setFont(new Font("Dialog", 0, 18)); 
        bsignup.setForeground(new Color(0, 0, 0));
        bsignup.setText("Signup");
        getContentPane().add(bsignup);
        bsignup.setBounds(880, 500, 90, 40);

		//login button
		
       blogin.setBackground(new Color(102, 255, 102));
       blogin.setFont(new Font("Dialog", 0, 18)); 
       blogin.setForeground(new Color(0, 0, 0));
       blogin.setText("Login");
       getContentPane().add(blogin);
       blogin.setBounds(1000, 500, 90, 40);

	   //pssword textfield
	   
        jpassword.setBackground(new Color(153, 204, 255));
        getContentPane().add(jpassword);
        jpassword.setBounds(880, 280, 203, 29);

		//email textfield
		
        jemail.setBackground(new Color(153, 204, 255));
        getContentPane().add(jemail);
        jemail.setBounds(880, 350, 203, 29);

		//contact textfield
		
        jcontact.setBackground(new Color(153, 204, 255));
        getContentPane().add(jcontact);
        jcontact.setBounds(880, 420, 203, 30);

		//icon label
		
        licon.setIcon(new ImageIcon("src\\images\\book2.png"));
		getContentPane().add(licon);
        licon.setBounds(100, 180, 560, 410);

        pack();
		
		bsignup.addActionListener(this);
		
		blogin.addActionListener(this);
		
    }                        

                                    
    public static void main(String args[]) {
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignupActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }
	
	//sign up  and login button action
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==bsignup)
			
			{
				try
				{
					String n = jname.getText();
					String p = jpassword.getText();
					String em = jemail.getText();
					String c = jcontact.getText();
					
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","proxy");
			
				        PreparedStatement ps=con.prepareStatement("insert into admin values(?,?,?,?)");
                        ps.setString(1, n);
                        ps.setString(2, p);
                        ps.setString(3, em);
                        ps.setString(4, c);
                        int a = ps.executeUpdate();
                        if(a>0)
                        {
                          JOptionPane.showMessageDialog(this,"Signup Successful!");
                            
                          new LoginConfirmActivity().setVisible(true);
                          this.setVisible(false);
                        }
                        else
                            JOptionPane.showMessageDialog(this,"Sign up failed!");
     
                        con.close();
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(this,"Signup failed!");
				}
				
			}
		
		
		else  if(e.getSource()== blogin)
		{
			new LoginActivity().setVisible(true);
			this.setVisible(false);
			
		}
		
	}	

    // Variables declaration - do not modify                     
    private JButton bsignup;
    private JButton blogin;
    private JLabel  lheading;
    private JLabel lname;
    private JLabel lpassword;
    private JLabel lemail;
    private JLabel lcontact;
    private JLabel licon;
    private JTextField jname;
    private JTextField jpassword;
    private JTextField jemail;
    private JTextField jcontact;
    // End of variables declaration                   
}
