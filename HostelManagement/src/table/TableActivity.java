package table;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class TableActivity 
{
   
    
	JFrame f;
	public TableActivity ()
	{
		
		DefaultTableModel model = new DefaultTableModel();
		JTable jt = new JTable(model);
		

		
		jt.setBounds(30,40,400,400);
		jt.setRowHeight(26);
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Branch");
		model.addColumn("Degree");
		model.addColumn("Hostel Name");
		model.addColumn("Room Number");
                model.addColumn("Date of Allocation");
                model.addColumn("Gender");
                
                
		jt.setEnabled(false);
        jt.setGridColor(new java.awt.Color(0, 0, 0));
        jt.setRowHeight(26);
        jt.setRowMargin(3);
		
		
		f=  new JFrame();	
		
		//database related activity
		
	try{
	  Class.forName("com.mysql.jdbc.Driver");
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","proxy");
		PreparedStatement st = con.prepareStatement("Select * from hosteler");
		ResultSet rs = st.executeQuery();
		while(rs.next())
		{
	   model.addRow(new Object[]{rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
		}
                con.close();
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}	
		//database end
		
		
		JScrollPane js = new JScrollPane(jt);
		f.add(js);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
                f.setTitle("Students Detail");
		f.setVisible(true);
	}
	
	
	public static void main(String [] args)
	{
		new TableActivity();
	}

    public void setVisible(boolean b) {
        try{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        catch(UnsupportedOperationException ex)
        {
        }
        }

   
}

