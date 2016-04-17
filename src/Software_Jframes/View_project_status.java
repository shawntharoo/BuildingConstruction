
package Software_Jframes;


public class View_project_status extends javax.swing.JInternalFrame {

    public View_project_status() {
        initComponents();
       
        jProgressBar1.setValue(50);
        jTextField27.setEditable(false);
        
        load load = new load();
        load.load_project_ids(jComboBox1);
        
        load.load_table_cost(jComboBox1, jComboBox2, jTable5, jTextField27);
        

        
         String pid= jComboBox1.getSelectedItem().toString();
         chart chart = new chart();
         chart.piechart(jDesktopPane1,pid);
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton3 = new javax.swing.JButton();

        setBorder(null);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel8.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 200, 20));

        jLabel12.setText("Customer ID");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 80, 20));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Goods Name", "Project Name", "Cost"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jPanel8.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 720, 280));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel8.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 200, 20));

        jButton7.setText("Print Report");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 120, 30));

        jButton8.setText("Print Table");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 110, 30));

        jLabel60.setText("Total Cost");
        jPanel8.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, 20));

        jTextField27.setText("0");
        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 200, 20));

        jButton13.setText("Sub Contractor");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 120, 30));

        jProgressBar1.setBackground(new java.awt.Color(0, 102, 102));
        jProgressBar1.setForeground(new java.awt.Color(51, 204, 0));
        jProgressBar1.setStringPainted(true);
        jPanel8.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 440, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Project Progress");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 100, 20));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("Project Costs");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jPanel8.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 450, 30));

        jLabel14.setText("Project Level");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Overall Project History");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jPanel8.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 720, 30));

        jLabel16.setText("Projects");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 22, -1, 20));

        jLabel17.setText("Location :");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, 20));

        jLabel18.setText("Malabe");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, 20));

        jLabel19.setText("Project ID");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 20));

        jLabel20.setText("Type :");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, 20));

        jLabel21.setText("Apartment");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, 20));

        jLabel22.setText("Complete");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, 20));

        jLabel23.setText("Status :");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, 20));

        jLabel24.setText("Est.Completion Date :");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, 20));

        jLabel25.setText("Apartment");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, 20));

        jButton1.setText("Add Project Cost");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 120, 30));

        jButton2.setText("View Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 120, 30));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel8.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 440, 300));

        jButton3.setText("Excel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1257, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 1257, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        chart chart = new chart();
        chart.auto_print(jTable5);
        
      

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Sub_contractor s = new Sub_contractor();
        s.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
         load ld = new load();
         
         
         jLabel12.setText(jComboBox1.getSelectedItem().toString());

         ld.load_table_cost(jComboBox1, jComboBox2, jTable5, jTextField27);
        
         ld.load_level_from_project(jComboBox1, jComboBox2, jLabel12);
         
         String pid= jComboBox1.getSelectedItem().toString();
         
         
         chart chart = new chart();
         chart.piechart(jDesktopPane1,pid);
         
         set set = new set();
         set.set_project_progress(jComboBox1, jProgressBar1);
         
       //  setprg();
       // loadlevel();
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
       
        load load = new load();
        load.load_table_cost(jComboBox1, jComboBox2, jTable5, jTextField27);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       AddProjectCost a = new AddProjectCost();
       a.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
        chart chart = new chart();
        chart.print_pdf_report(jTable5);
       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Access ac = new Access();
        ac.openReport();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Access ac = new Access();

        chart chart = new chart();
        chart.print_excel_report(jTable5);
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField27;
    // End of variables declaration//GEN-END:variables

  

    
}
