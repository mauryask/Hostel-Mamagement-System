
package search;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;

public class SearchActivity extends javax.swing.JFrame  {
    
 
    Connection con;
    Statement st;
    ResultSet rs;
    
    public SearchActivity() {
       
               initComponents();
        try{
                        Class.forName("com.mysql.jdbc.Driver");
                         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","proxy");
			 
        }
        catch(Exception ex)
        {
            
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jsearch = new javax.swing.JTextField();
        bsearch = new javax.swing.JButton();
        lsearch = new javax.swing.JLabel();
        lid = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        lrno = new javax.swing.JLabel();
        lbranch = new javax.swing.JLabel();
        lrname = new javax.swing.JLabel();
        lrname1 = new javax.swing.JLabel();
        lrname2 = new javax.swing.JLabel();
        lrname3 = new javax.swing.JLabel();
        ldoj = new javax.swing.JLabel();
        lrdoj = new javax.swing.JLabel();
        lhostel = new javax.swing.JLabel();
        lrhostel = new javax.swing.JLabel();
        ldegree = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        
       /* bback = new JButton();
        bback.setText("Cancel");
        bback.setBounds(5,5,70,30);
        bback.setBackground(Color.YELLOW);
        add(bback);
        bback.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
        });*/

       // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 153));

        jsearch.setBackground(new java.awt.Color(255, 153, 255));
        jsearch.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jsearch.setForeground(new java.awt.Color(0, 0, 0));

        bsearch.setBackground(new java.awt.Color(255, 0, 51));
        bsearch.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bsearch.setForeground(new java.awt.Color(0, 0, 0));
        bsearch.setText("Search");
        bsearch.addActionListener((java.awt.event.ActionEvent evt) -> {
            bsearchActionPerformed(evt);
        });

        lsearch.setBackground(new java.awt.Color(255, 204, 51));
        lsearch.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lsearch.setForeground(new java.awt.Color(0, 0, 0));
        

        lid.setFont(new java.awt.Font("Dialog", 0, 18));
        lid.setForeground(new java.awt.Color(0, 0, 0));
        lid.setText("ID ");
        lid.setVisible(false);
        
        lname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lname.setForeground(new java.awt.Color(0, 0, 0));
        lname.setText("Name");
        lname.setVisible(false);
        
        lrno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lrno.setForeground(new java.awt.Color(0, 0, 0));
        lrno.setText("Room Number");
        lrno.setVisible(false);
        
        lbranch.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbranch.setForeground(new java.awt.Color(0, 0, 0));
        lbranch.setText("Branch");
        lbranch.setVisible(false);

        lrname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lrname.setForeground(new java.awt.Color(0, 0, 0));
        
        lrname1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lrname1.setForeground(new java.awt.Color(0, 0, 0));
       

        lrname2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lrname2.setForeground(new java.awt.Color(0, 0, 0));
        

        lrname3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lrname3.setForeground(new java.awt.Color(0, 0, 0));
        

        ldoj.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ldoj.setForeground(new java.awt.Color(0, 0, 0));
        ldoj.setText("Date of joining");
        ldoj.setVisible(false);
        
        lrdoj.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lrdoj.setForeground(new java.awt.Color(0, 0, 0));
       

        lhostel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lhostel.setForeground(new java.awt.Color(0, 0, 0));
        lhostel.setText("Hostel Name");
        lhostel.setVisible(false);
        
        lrhostel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lrhostel.setForeground(new java.awt.Color(0, 0, 0));
       

        ldegree.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ldegree.setForeground(new java.awt.Color(0, 0, 0));
        ldegree.setText("Degree");
        ldegree.setVisible(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // degree name btech
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
       

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(bsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbranch, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ldegree)
                                    .addComponent(lrno)
                                    .addComponent(ldoj)
                                    .addComponent(lhostel))
                                .addGap(7, 7, 7)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lrname2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(lrname, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lrname3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lrhostel)
                                    .addComponent(lrdoj, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lrname1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(179, 179, 179))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(lsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lid)
                    .addComponent(lrname3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname)
                    .addComponent(lrname2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbranch)
                    .addComponent(lrname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ldegree)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lrno)
                    .addComponent(lrname1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lrdoj, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ldoj, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lhostel)
                    .addComponent(lrhostel))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    public SearchActivity(Connection con, Statement st, ResultSet rs, JButton bno, JButton bsearch, JButton byes, JPanel jPanel1, JTextField jsearch, JLabel lbranch, JLabel lid, JLabel lname, JLabel lrno, JLabel lsearch) {
        this.con = con;
        this.st = st;
        this.rs = rs;
       
        this.bsearch = bsearch;
       
        this.jPanel1 = jPanel1;
        this.jsearch = jsearch;
        this.lbranch = lbranch;
        this.lid = lid;
        this.lname = lname;
        this.lrno = lrno;
        this.lsearch = lsearch;
       
    }

    
    private void bsearchActionPerformed(java.awt.event.ActionEvent evt) {                                        
        try {
                     
                        String getname = jsearch.getText();
			st= con.createStatement();
                          rs = st.executeQuery("select * from hosteler");
			int flag=0;
			while(rs.next())
			{
			 if(getname.equals(rs.getString(1))|| getname.equalsIgnoreCase(rs.getString(2)))	
                         {
                             flag=1;
                             break;
                         } else {
                         }
			}
                        
                        if(flag==1)
                        {
                            lsearch.setText("     Student is found, details are given below");
                            
                            lid.setVisible(true);
                            lrname3.setText(rs.getString(1));
                            
                            ldegree.setVisible(true);
                            jLabel2.setText(rs.getString(4));
                            
                            lname.setVisible(true);
                            lrname2.setText(rs.getString(2));
                            
                            lbranch.setVisible(true);
                            lrname.setText(rs.getString(3));
                                                          
                            lhostel.setVisible(true);
                            lrhostel.setText(rs.getString(5));
                             
                             lrno.setVisible(true);
                             lrname1.setText(rs.getString(6));
                             
                            ldoj.setVisible(true);
                            lrdoj.setText(rs.getString(7));
                        }
                        if(flag==0)
                        {
                            lsearch.setText("                       Student not found");
                            
                            lid.setVisible(false);
                            lrname3.setVisible(false);
                            
                            ldegree.setVisible(false);
                            jLabel2.setVisible(false);
                            
                            lname.setVisible(false);
                            lrname2.setVisible(false);
                            
                            lbranch.setVisible(false);
                            lrname.setVisible(false);
                                                          
                            lhostel.setVisible(false);
                            lrhostel.setVisible(false);
                             
                             lrno.setVisible(false);
                             lrname1.setVisible(false);
                             
                            ldoj.setVisible(false);
                            lrdoj.setVisible(false);
                        } 
   }
        catch(Exception ex)
        {
         JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }                                       
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchActivity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bsearch;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jsearch;
    private javax.swing.JLabel lbranch;
    private javax.swing.JLabel ldegree;
    private javax.swing.JLabel ldoj;
    private javax.swing.JLabel lhostel;
    public javax.swing.JLabel lid;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel lrdoj;
    private javax.swing.JLabel lrhostel;
    private javax.swing.JLabel lrname;
    private javax.swing.JLabel lrname1;
    private javax.swing.JLabel lrname2;
    private javax.swing.JLabel lrname3;
    private javax.swing.JLabel lrno;
    private javax.swing.JLabel lsearch;
  //  private javax.swing.JButton bback;
    // End of variables declaration                   
}

