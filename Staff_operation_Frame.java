
package Admin;


import Daily.DailyDataFrame;
import StaffOperations.DashboardChart;
import StaffOperations.StaffDBOP;
import StaffOperations.createcard;
import Student.EditStudentFrame;
import Student.RemoveStudentFrame;
import Student.SudentRegistrationFrame;
import StudentOperation.StudentDBOP;
import avpoly_uniform_detection_system.LoginFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

public class Staff_operation_Frame extends javax.swing.JFrame {

    public static String str="";
    public static String Name="";

    
    public Staff_operation_Frame() {
        super("Staff Operation Frame");
        initComponents();
        jTextArea1.setEditable(false);
        jTextArea2.setEditable(false);
        
        
        jTextArea2.append("\n\n\n\n\n");
        jTextArea1.append("\n\n\n\n\nNow "+Name+" are Loged In the System ");

        jPanel2.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 30)); // center, hgap=20, vgap=20
        jPanel2.setBackground(Color.WHITE);

        int staffRow = StaffDBOP.getRowCount();
        int studentRow = StudentDBOP.getRowCount();
        String StaffRowCount = String.valueOf(staffRow);
        
        String StudentRowCount = String.valueOf(studentRow);

        
        jPanel2.add(createcard.createCard("TOTAL STUDENTS", StudentRowCount+"+", new Color(52, 152, 219)));
        jPanel2.add(createcard.createCard("TOTAL STAFF", StaffRowCount+"+", new Color(46, 204, 113)));
        jPanel2.add(createcard.createCard("PENDING APPROVALS", "0", new Color(241, 196, 15)));
        jPanel2.add(createcard.createCard("DAILY ATTENDANCE", "0%", new Color(155, 89, 182)));

        jPanel2.revalidate();
        jPanel2.repaint();

        jPanel3.add(new DashboardChart(), BorderLayout.CENTER);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Recent Login");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1260, 390, 385, 42);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(70, 70, 1750, 210);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(720, 320, 10, 10);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(1050, 390, 790, 210);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Recent Staff Activity");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1200, 630, 530, 70);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(1050, 640, 790, 210);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jPanel3);
        jPanel3.setBounds(70, 390, 820, 460);

        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/circle.png"))); // NOI18N
        jMenu1.setText("Manage profile          ");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMenuItem1.setText("Edit Profile");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMenuItem7.setText("Cancel Profile");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/students.png"))); // NOI18N
        jMenu2.setText("Student          ");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMenuItem2.setText("Add");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMenuItem3.setText("Edit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMenuItem4.setText("Remove");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/journal.png"))); // NOI18N
        jMenu3.setText("Report          ");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMenuItem5.setText("Daily");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/log-out_1.png"))); // NOI18N
        jMenu4.setText("Exit          ");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMenuItem6.setText("LogOut");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        StaffEditProfileFrame s = new StaffEditProfileFrame();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        s.setVisible(true);
        s.setSize(d);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        SudentRegistrationFrame s = new SudentRegistrationFrame();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        s.setVisible(true);
        s.setSize(d);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        EditStudentFrame n = new EditStudentFrame();
        n.setSize(800,600);
        n.setLocationRelativeTo(null);
        n.setVisible(true);
        n.setResizable(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        RemoveStudentFrame n = new RemoveStudentFrame();
        n.setSize(800,600);
        n.setLocationRelativeTo(null);
        n.setVisible(true);
        n.setResizable(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        LoginFrame s = new LoginFrame();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        s.setVisible(true);
        s.setSize(d);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jPanel3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3AncestorAdded

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        StaffCancelProfileFrame s = new StaffCancelProfileFrame();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        s.setVisible(true);
        s.setSize(d);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      DailyDataFrame s = new DailyDataFrame();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        s.setVisible(true);
        s.setSize(d);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff_operation_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
