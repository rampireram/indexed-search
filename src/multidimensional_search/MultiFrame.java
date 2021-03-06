/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MultiFrame.java
 *
 * Created on Mar 22, 2014, 7:15:21 PM
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
import java.util.Date;
import javax.swing.table.DefaultTableModel;


public class MultiFrame extends javax.swing.JFrame {

    /** Creates new form MultiFrame */
    public MultiFrame() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(multidimensional_search.Multidimensional_searchApp.class).getContext().getResourceMap(MultiFrame.class);
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N

        jTextField2.setText(resourceMap.getString("jTextField2.text")); // NOI18N
        jTextField2.setName("jTextField2"); // NOI18N

        jTextField3.setText(resourceMap.getString("jTextField3.text")); // NOI18N
        jTextField3.setName("jTextField3"); // NOI18N

        jSpinner1.setModel(new javax.swing.SpinnerDateModel());
        jSpinner1.setName("jSpinner1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "File Name", "Date", "Location", "Count", "Rank"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
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

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField3)
                                        .addComponent(jTextField2)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(6, 6, 6))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton2)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
        new OptFrame().setVisible(true);
}//GEN-LAST:event_jButton1MouseClicked

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

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        kmp_find kk = new kmp_find();
        Connection c = null;
        Statement stmt = null;
        Statement stmt_aux = null;
        String str = jTextField1.getText();
        String pat = jTextField2.getText();
        Date d = (Date) jSpinner1.getValue();
        String struct = jTextField3.getText();
        struct = kk.process(struct);
        //System.out.println("Started");
        DefaultTableModel model1 = (DefaultTableModel)jTable1.getModel();



        ///////// delete the JTable
        int rowCount= model1.getRowCount();
        for(int i = rowCount - 1; i >=0; i--) {
            model1.removeRow(i);
        }
        ///////////// END delete JTable



        try {

            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:files_test.db");
            
            stmt = c.createStatement();
            stmt_aux = c.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS temp_date_sys " +
                    "( name       TEXT      NOT NULL, " +
                    "  time       TEXT      NOT NULL, " +
                    "  diff      NUMBER     NOT NULL,"  +
                    "  count      NUMBER     NOT NULL,"  +
                    "  location   TEXT      NOT NULL,"  +
                     "  rank      NUMBER);";
            stmt.executeUpdate(sql);

            stmt = c.createStatement();
            sql = "CREATE TABLE IF NOT EXISTS temp_struct_sys " +
                    "( name       TEXT      NOT NULL, " +
                    "  path       TEXT      NOT NULL, " +
                    "  match      NUMBER     NOT NULL,"  +
                    "  count      NUMBER     NOT NULL,"  +
                    "  location   TEXT      NOT NULL,"  +
                     "  rank      NUMBER);";
            stmt.executeUpdate(sql);

//System.out.println("tables created");

            ResultSet rs = null;
            ResultSet rs_aux = null;
            stmt = c.createStatement();
            rs = stmt.executeQuery( "SELECT * FROM file_sys where name like '%" + str + "';" );
           // System.out.println("1 que");
            while ( rs.next() ) {
                String  name = rs.getString("name");
                String  time = rs.getString("time");
                int count = rs.getInt("count");
                String path = rs.getString("path");
                String modified = rs.getString("modified");
                String  loc = rs.getString("location");
                //System.out.println(loc);
                int pos = kk.ini(loc,pat);

		if(pos<0)
                {
                  //  System.out.println("Pos = " + pos);
                    continue;
                }

                 long ll = Long.parseLong(modified);
                 long ans = d.getTime();
		   stmt = c.createStatement();
                 //  System.out.println("b4 date tab");
                 sql = "INSERT INTO temp_date_sys (name,time,diff,count,location) " +
                   "VALUES ('" + name + "','" + time + "','" +  Math.abs(ll-ans) + "','" + count + "','"  + loc + "');";
                stmt.executeUpdate(sql);

                int match_ans = kk.matcher(path, struct);

              //  System.out.println("b4 struct tab");
                
                stmt = c.createStatement();
                 sql = "INSERT INTO temp_struct_sys (name,path,match,count,location) " +
                   "VALUES ('" + name + "','"  + path + "','" + match_ans + "','" + count  + "','" + loc +"');";
                stmt.executeUpdate(sql);

              ///  System.out.println("tables created_all");

            }
//System.out.println("b4 2 que");

             stmt = c.createStatement();
            rs = stmt.executeQuery( "SELECT * FROM temp_date_sys order by diff;" );

           // System.out.println("table ins'd");

            int row_id = 1;
            //updating rank
            while ( rs.next() ) {
                String loc = rs.getString("location");
                String  name = rs.getString("name");
                String  time = rs.getString("time");
                int count = rs.getInt("count");
                Double rank = (row_id) + Math.pow(1.414, row_id);
                
                stmt_aux = c.createStatement();
                sql = "UPDATE `temp_date_sys` SET `rank` = " + rank + " WHERE `location` ='" + loc + "';";
                int ans = stmt_aux.executeUpdate(sql);
                //rs_aux.close();


                // model1.addRow(new Object[]{name,time,loc,count,rank});


                row_id++;
            }

            stmt = c.createStatement();
            rs = stmt.executeQuery( "SELECT * FROM temp_struct_sys order by match DESC;" );


            row_id = 1;
            //updating rank
            while ( rs.next() ) {
                String loc = rs.getString("location");
                String  name = rs.getString("name");
                String  time = rs.getString("path");
                int count = rs.getInt("count");
                Double rank = (row_id) + Math.pow(1.414, row_id);

                stmt_aux = c.createStatement();
                sql = "UPDATE `temp_date_sys` SET `rank` = `rank` + " + rank + " WHERE `location` ='" + loc + "';";
                int ans = stmt_aux.executeUpdate(sql);
                //rs_aux.close();


                 model1.addRow(new Object[]{name,time,loc,count,rank});


                row_id++;
            }


            //end of updating rank

            stmt = c.createStatement();
            rs = stmt.executeQuery( "SELECT * FROM temp_date_sys order by rank;" );

             while ( rs.next() ) {
                String loc = rs.getString("location");
                String  name = rs.getString("name");
                String  time = rs.getString("time");
                int count = rs.getInt("count");
                Double rank = rs.getDouble("rank");



                model1.addRow(new Object[]{name,time,loc,count,rank});


                row_id++;
            }


            //clearing unwanted tables
            stmt = c.createStatement();
            stmt.execute("DROP TABLE temp_date_sys;" );

            stmt = c.createStatement();
            stmt.execute("DROP TABLE temp_struct_sys;" );
            //end of clearing


        } catch ( Exception e ) {
            System.out.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultiFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
