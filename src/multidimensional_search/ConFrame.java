/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ConFrame.java
 *
 * Created on Mar 22, 2014, 7:13:23 PM
 */

package multidimensional_search;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ramchand
 */
public class ConFrame extends javax.swing.JFrame {

    /** Creates new form ConFrame */
    public ConFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(multidimensional_search.Multidimensional_searchApp.class).getContext().getResourceMap(ConFrame.class);
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jTextField1.setName("jTextField1"); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jTextField2.setName("jTextField2"); // NOI18N

        jButton2.setBackground(resourceMap.getColor("jButton2.background")); // NOI18N
        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "File Name", "Date", "Location", "Count"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setName("jTable1"); // NOI18N
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(436, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addContainerGap(57, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(319, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jButton2)))
                    .addContainerGap(284, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
        new OptFrame().setVisible(true);
}//GEN-LAST:event_jButton1MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped

}//GEN-LAST:event_jTextField1KeyTyped

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        kmp_find kk = new kmp_find();
        Connection c = null;
        Statement stmt = null;
        String str = jTextField1.getText();
        String pat = jTextField2.getText();
        DefaultTableModel model1 = (DefaultTableModel)jTable1.getModel();
        ///////// delete the JTable
        int rowCount= model1.getRowCount();
        for(int i = rowCount - 1; i >=0; i--) {
            model1.removeRow(i);
        }
        ///////////// END delete JTable
        try {
            /*
            String url = "jdbc:mysql://localhost:3306/";
            String dbName = "file";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "ramchand";
            String sql = null;
            Class.forName(driver).newInstance();
            c = (Connection) DriverManager.getConnection(url+dbName,userName,password);
            */
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:files_test.db");
            ResultSet rs = null;
            stmt = c.createStatement();
            rs = stmt.executeQuery( "SELECT * FROM file_sys where name like '%" + str + "';" );

            while ( rs.next() ) {
                String  name = rs.getString("name");
                String  time = rs.getString("time");
                int count = rs.getInt("count");
                String  loc = rs.getString("location");
                //System.out.println(loc);
                int pos = kk.ini(loc,pat);

		if(pos<0)
                {
                    System.out.println("Pos = " + pos);
                    continue;
                }

                model1.addRow(new Object[]{name,time,loc,count});

             
            }


           




        } catch ( Exception e ) {
            System.out.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
}//GEN-LAST:event_jButton2MouseClicked

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
}//GEN-LAST:event_jButton2MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        Connection c = null;
        Statement stmt = null;
        String out = "";
        DefaultTableModel model1 = (DefaultTableModel)jTable1.getModel();
        int row = jTable1.rowAtPoint(evt.getPoint());
        int col = jTable1.columnAtPoint(evt.getPoint());
        if (row >= 0 && col >= 0) {
            //System.out.println(row + col);
            out = model1.getValueAt(row, 2).toString();
            //System.out.println(out);
        }
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:files_test.db");
            c.setAutoCommit(true);
            ResultSet rs = null;
            int cn= 0;
            String loc = "";
            String count = "";
            stmt = c.createStatement();
            String sql = "SELECT * FROM file_sys where location = '" + out + "'";

            rs = stmt.executeQuery(sql);
            count = rs.getString("count");
            System.out.print(count);


            cn = rs.getInt("count");
            rs.close();

            cn++;
            System.out.println(cn);
            stmt.close();

            stmt = c.createStatement();
            sql = "UPDATE `file_sys` SET `count` = " + cn + " WHERE `location` ='" + out + "';";
            int ans = stmt.executeUpdate(sql);
            rs.close();
            System.out.println("Ans = " + ans);
            model1.setValueAt(cn, row, 3);
            c.close();


        } catch ( Exception e ) {
            System.out.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}


class kmp_find
{
 public int matcher(String path,String struct)
    {
    int no =0;
    int no_1 = -1;
    int i=0,j=0;
    while( i < path.length() && j < struct.length() )
    {
        if(path.charAt(i) == struct.charAt(j))
        {
            no++;
            i+=2;j+=2;
        }
 else
        {
        if(no >= no_1)
            no_1 = no;
        i+=2;j=0;no=0;
        }
    }
    if(no >= no_1)
            no_1 = no;
    return no_1;
}
void failure(String p,int f[])
	{
		int i=1;
		int j=0;
		 f[0]=0;
		 int m=p.length();
		while (i<m)
		{
			if (p.charAt(j)==p.charAt(i))
			{
				f[i]=j+1;
				i++;
				j++;
			}
			else if(j>0)
				j=f[j-1];
				else
				{
					f[i]=0;
					i++;
				}
		}
	}

public void print_path(String p)
  {

    String tempp = p.charAt(0) + "//";
   // System.out.println(tempp);

}

public String process(String in)
    {
        int i = 1;
        String temp = in.charAt(0) + "";
        while( i < in.length())
        {
            if(in.charAt(i)=='\\')
                temp = temp + '\\' +in.charAt(i+1);
           i++;
        }
        return temp;
    }


	int kmp(String t,String p,int f[])
	{
		failure(p,f);
		int i=0;
		int j=0;
		int n=t.length();
		int m=p.length();
		while (i<n)
		{
			if (p.charAt(j)==t.charAt(i))
			{
				if(j==m-1)
					return i-m+2;
				i++;
				j++;
			}
			else if(j>0)
			j=f[j-1];
			else i++;
		}
		return -1;
	}

    public int ini(String ff,String pat) throws FileNotFoundException, IOException
    {
        File file = new File(ff);
        BufferedReader in = new BufferedReader(new FileReader(file));
        while (in.ready()) {
         String s = in.readLine();
         int[] f= new int[pat.length()];
         int ans = this.kmp(s,pat,f);
         if(ans>=0)
             return 1;
         //System.out.println(ans);
        }
        in.close();
        return -1;
    }


}