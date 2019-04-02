 package login;
 
 import loginconfirm.LoginConfirmActivity;
 
 import signup.SignupActivity;  // signup package;
 //import table.TableActivity;
 
 import java.sql.*;
 import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
public class LoginActivity extends JFrame
 {
    
    public LoginActivity() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    public void initComponents() {

	    jLabel0 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(Color.RED);
       // setMinimumSize(new Dimension(1390, 740));
	   
	   setExtendedState(JFrame.MAXIMIZED_BOTH);  // code for full screen size
	   
        getContentPane().setLayout(null);
		
		
		//hostel Management system Label
		jLabel0.setFont(new Font("Copperplate Gothic Light",1,55));
		jLabel0.setForeground(new java.awt.Color(0, 0, 0));
		jLabel0.setText("HOSTEL MANAGEMENT SYSTEM");
		getContentPane().add(jLabel0);
		jLabel0.setBounds(160,20,1100,100);
		jLabel0.setForeground(new java.awt.Color(172, 51, 255));
		//jLabel0.setBackground(new Color(255,0,0));
		//email label
		
        jLabel3.setFont(new Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Email");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 330, 60, 30);

		//email text field
        jTextField1.setBackground(new Color(204, 255, 255));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 330, 200, 32);

		//password label
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); 
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 410, 100, 30);

		//password text field
        jPasswordField.setBackground(new Color(204, 255, 255));
        getContentPane().add(jPasswordField);
        jPasswordField.setBounds(300, 410, 200, 32);

		//heading admin login label
        jLabel4.setFont(new java.awt.Font("High Tower Text", 2, 48)); 
        jLabel4.setForeground(new Color(255, 0, 0));
        jLabel4.setText("Admin Login");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(285, 210, 290, 50);

		//log in button
		
        jButton1.setBackground(new Color(153, 255, 153));
        jButton1.setFont(new Font("Dialog", 1, 14)); 
        jButton1.setForeground(new Color(0, 0, 0));
        jButton1.setText("Login");
        jButton1.addActionListener((ActionEvent evt) -> {
            jButton1ActionPerformed(evt);
            });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 510, 90, 40);

		//sign up button
        jButton2.setBackground(new Color(153, 255, 153));
        jButton2.setFont(new Font("Dialog", 1, 14)); 
        jButton2.setForeground(new Color(0, 0, 0));
        jButton2.setText("Signup");
        jButton2.addActionListener((ActionEvent evt) -> {
            jButton2ActionPerformed(evt);
            });
        getContentPane().add(jButton2);
        jButton2.setBounds(420, 510, 90, 40);

		//icon label
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); 
        jLabel1.setIcon(new javax.swing.ImageIcon("src\\images\\book2.png")); 
       // jLabel1.setText("Email");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(650, 180, 640, 480);
        pack();
    }                       

	//Login Button action
    public void jButton1ActionPerformed(ActionEvent evt) {                                         
        try{
		        String getemail = jTextField1.getText();
			String getpassword =jPasswordField.getText();
			
			Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","proxy");
			Statement st= con.createStatement();
			ResultSet rs = st.executeQuery("select * from admin");
			int flag=0;
			while(rs.next())
			{
				if(getemail.equals(rs.getString(3)) && getpassword.equals(rs.getString(2)))
				{
					flag=1;
                                      
                                        break;
				}
                               
			}
                        
                        if(flag==0)
                             JOptionPane.showMessageDialog(this,"Invalid Email or Password!");
                        else
                        {
                            JOptionPane.showMessageDialog(this,"Login Successful!");
                            new LoginConfirmActivity().setVisible(true);
                            this.setVisible(false);
                        }
		con.close();
      	}
			 catch(Exception  p)
			 {
				 JOptionPane.showMessageDialog(this,p);
				 
				 
			 }
			
    }                                        

	//Sign up Button action
    public void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { 
            	
       new SignupActivity().setVisible(true);
		this.setVisible(false);
		
		
		
    }                                        

    //main() Method
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginActivity().setVisible(true);
            }
        });
    }
                    
    // variable declaration
		
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
	public javax.swing.JLabel jLabel0;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JPasswordField jPasswordField;
                      
}

