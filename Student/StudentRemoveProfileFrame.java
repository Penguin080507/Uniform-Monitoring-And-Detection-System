package Student;

import Admin.StaffEditProfileFrame;
import Admin.Staff_operation_Frame;
import MailSystem.Sendmail;
import StaffOperations.DigitChecker;
import static Student.StudentEditProfileFrame.str;
import StudentOperation.StudentDBOP;
import avpoly_uniform_detection_system.LoginFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class StudentRemoveProfileFrame extends javax.swing.JFrame {

    public static String str="";

    public StudentRemoveProfileFrame() {
        
        super("Student profile remove for "+str);
        ArrayList<String> temp = StudentDBOP.getStudentData(str);
        System.out.println("==="+temp);
        
        String ERP = temp.get(0);
        String studentname = temp.get(1);
        String studentmobile = temp.get(2);
        String studentemail = temp.get(3);
        String ParentName = temp.get(4);
        String ParentMobile = temp.get(5);
        String ParentEmail = temp.get(6);
        String ParentAC = temp.get(7);
        String Bank = temp.get(8);
        String Photo = temp.get(9);
        
        initComponents();
        
        jLabel11.setText( "<html>"
            + "<div style='text-align:center;'>"
            + "<span style='font-family:Segoe UI, Tahoma, Geneva, Verdana, sans-serif; "
            + "font-size:48pt; font-weight:bold; color:#333;'>"
            + "Remove Profile"
            + "</span><br>"
            + "<hr style='width:1000px; border:30px solid #2a74da; margin-top:5px;'>"
            + "</div>"
            + "</html>"
            );
        
        jLabel13.setText( "<html>"
            + "</span><br>"
            + "<hr style='width:1000px; border:10px solid #2a74da; margin-top:5px;'>"
            + "</div>"
            + "</html>"
            );
        
        
        jTextField1.setEditable(false);
        jTextField1.setText(ERP);
        jTextField2.setText(studentname);
        jTextField3.setText(studentmobile);
        jTextField4.setText(studentemail);
        jTextField5.setText(ParentName);
        jTextField6.setText(ParentMobile);
        jTextField7.setText(ParentEmail);
        jTextField8.setText(ParentAC);
        jTextField9.setText(Bank);
        jTextField10.setText(Photo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/id-card (2).png"))); // NOI18N
        jLabel1.setText("ERP No.");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circle.png"))); // NOI18N
        jLabel2.setText("Student Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/phone-call.png"))); // NOI18N
        jLabel3.setText("Mobile No.");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/email.png"))); // NOI18N
        jLabel4.setText("Email Id.");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circle.png"))); // NOI18N
        jLabel5.setText("Parent Name");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/phone-call.png"))); // NOI18N
        jLabel6.setText("Parent Mobile No.");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/email.png"))); // NOI18N
        jLabel7.setText("Parent Email");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/book-keeping.png"))); // NOI18N
        jLabel8.setText("Parent A/C No.");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bank.png"))); // NOI18N
        jLabel9.setText("Bank Name");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/students.png"))); // NOI18N
        jLabel10.setText("Student Image");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTextField8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTextField9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Remove Profile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 153));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jButton4.setBackground(new java.awt.Color(0, 102, 153));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Browse");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("jLabel11");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Parent/Gurdian Details");

        jLabel13.setText("jLabel13");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(34, 34, 34)))
                                        .addGap(106, 106, 106)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(35, 35, 35)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 30, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(674, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(503, 503, 503))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        RemoveStudentFrame n = new RemoveStudentFrame();
        n.setSize(800,600);
        n.setLocationRelativeTo(null);
        n.setVisible(true);
        n.setResizable(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ERP = jTextField1.getText().trim();
        String StudentName = jTextField2.getText().trim();
        String StudentMobile = jTextField3.getText().trim();
        String StudentEmail = jTextField4.getText().trim();
        String ParentName = jTextField5.getText().trim();
        String ParentMobile = jTextField6.getText().trim();
        String ParentEmail = jTextField7.getText().trim();
        String ParentAC = jTextField8.getText().trim();
        String Bank = jTextField9.getText().trim();
        String Photo = jTextField10.getText().trim();
        
       
        
        
        if(ERP.isEmpty())
            JOptionPane.showMessageDialog(null,"Student ERP should not be empty");
        else if(!DigitChecker.isDigit(ERP))
            JOptionPane.showMessageDialog(null,"Student ERP number should not contain characters");
        
        //Student ERP -/
        
        
        else if(StudentName.isEmpty())
            JOptionPane.showMessageDialog(null,"Student Name should not be empty");
        
        //Student name -/
        
        
        else if(StudentMobile.isEmpty())
            JOptionPane.showMessageDialog(null,"Student Mobile number should not be empty");
        else if(!DigitChecker.isDigit(StudentMobile))
            JOptionPane.showMessageDialog(null,"Student Mobile number should not contain characters");
        else if(StudentMobile.length() != 10)
            JOptionPane.showMessageDialog(null,"Student Mobile number contains only 10 digits");
        
        //Student mobile -/
        
        else if(StudentEmail.isEmpty())
            JOptionPane.showMessageDialog(null,"Student email should not be empty");
        else if(!(StudentEmail.contains("@") && StudentEmail.contains(".") && StudentEmail.contains("com")))
            JOptionPane.showMessageDialog(null,"Student email contains @, ., and com");
        
        //Student email -/
        
        else if(ParentName.isEmpty())
            JOptionPane.showMessageDialog(null,"Parent Name should not be empty");
        
        //Parent name -/
        
        
        else if(ParentMobile.isEmpty())
            JOptionPane.showMessageDialog(null,"Parent Mobile number should not be empty");
        else if(!DigitChecker.isDigit(ParentMobile))
            JOptionPane.showMessageDialog(null,"Parent Mobile number should not contain characters");
        else if(ParentMobile.length() != 10)
            JOptionPane.showMessageDialog(null,"Parent Mobile number contains only 10 digits");
        
        //Parent mobile -/
        
        else if(ParentEmail.isEmpty())
            JOptionPane.showMessageDialog(null,"Parent email should not be empty");
        else if(!(ParentEmail.contains("@") && ParentEmail.contains(".") && ParentEmail.contains("com")))
            JOptionPane.showMessageDialog(null,"Parent email contains @, ., and com");
        
        //Parent email -/
        
        else if(ParentAC.isEmpty())
            JOptionPane.showMessageDialog(null,"Parent A/C Number should not be empty");
        
        //Parent A/C Number -/
        
        else if(Bank.isEmpty())
            JOptionPane.showMessageDialog(null,"Parent Bank Name should not be empty");
        
        //Bank Name -/
        
        else if(Photo.isEmpty())
            JOptionPane.showMessageDialog(null,"Student Photo should not be empty");
        
        //Student Photo -/
        
        
        else{
            System.out.println("StudentERP Number  : "+ERP);
            System.out.println("Student Name : "+StudentName);
            System.out.println("Student Mobile Number : "+StudentMobile);
            System.out.println("Student Email : "+StudentEmail);
            System.out.println("Parent Name : "+ParentName);
            System.out.println("Parent Mobile Number : "+ParentMobile);
            System.out.println("Parent Email : "+ParentEmail);
            System.out.println("Parent A/C Number : "+ParentAC);
            System.out.println("Bank Name : "+Bank);
            System.out.println("Student Photo : "+Photo);
            
            
            if(StudentDBOP.isCanceled(ERP))
            {
              Staff_operation_Frame.jTextArea2.setEditable(false);
              Staff_operation_Frame.jTextArea2.append("Remove the Profile of the Student : "+StudentName);
              
             JOptionPane.showMessageDialog(null,"Student Profile Removed Successfull");
              
             String mail = StudentEmail;
             String subject = "Message From Amrutvaini PolyTechnic";

             String msg1 = "Dear " + StudentName.toUpperCase() + ",\n\nYour Profile of College Uniform Detection OR Monitoring System will be Removed successfully .\n";
             String msg2 = "\n\nThanks and regards,\nAmrutvahini Politechnic";
             String body = msg1 + msg2;

             Sendmail sem = new Sendmail();
             
             sem.sendMailNow(body, subject, mail);
             
             String Mail = ParentEmail;
             String Subject = "Message From Amrutvaini PolyTechnic";

             String Msg1 = "Dear " + ParentName.toUpperCase() + ",\n\nYour Son/Daughter's Profile of College Uniform Detection OR Monitoring System will be Removed successfully .\n";
             String Msg2 = "\n\nThanks and regards,\nAmrutvahini Politechnic";
             String Body = Msg1 + Msg2;

             Sendmail Sem = new Sendmail();
             
             Sem.sendMailNow(Body, Subject, Mail);
                
              
              this.dispose();
              Staff_operation_Frame s = new Staff_operation_Frame();
              Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
              s.setSize(d);
              s.setVisible(true);
              Staff_operation_Frame.jTextArea2.setEditable(false);
              Staff_operation_Frame.jTextArea2.append("Remove the Profile of the Student : "+StudentName);
            }   
            else{
                JOptionPane.showMessageDialog(null,"Student Profile Removed Unsuccessfull");
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        StaffEditProfileFrame s = new StaffEditProfileFrame();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        s.setVisible(true);
        s.setSize(d);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
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
        this.dispose();
        LoginFrame s = new LoginFrame();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        s.setVisible(true);
        s.setSize(d);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRemoveProfileFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
