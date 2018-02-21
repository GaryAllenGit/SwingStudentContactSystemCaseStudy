public class AddCommentGUI extends javax.swing.JDialog {

    Student student;

    public AddCommentGUI(java.awt.Frame parent, boolean modal, Student s) {
        super(parent, modal);
        initComponents();

        student = s;
    }


    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        commentDateTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        commentTimeTF = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentTextTF = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        commitCommentButton = new javax.swing.JButton();
        cancelCommentButton = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jLabel1.setText("Date");
        jPanel1.add(jLabel1);

        commentDateTF.setColumns(12);
        jPanel1.add(commentDateTF);

        jLabel2.setText("          Time");
        jPanel1.add(jLabel2);

        commentTimeTF.setColumns(12);
        jPanel1.add(commentTimeTF);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(420, 350));
        commentTextTF.setColumns(40);
        commentTextTF.setRows(15);
        jScrollPane1.setViewportView(commentTextTF);

        jPanel2.add(jScrollPane1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        commitCommentButton.setText("Commit");
        commitCommentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitCommentButtonActionPerformed(evt);
            }
        });

        jPanel3.add(commitCommentButton);

        cancelCommentButton.setText("Cancel");
        cancelCommentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelCommentButtonActionPerformed(evt);
            }
        });

        jPanel3.add(cancelCommentButton);

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        pack();
    }

    private void cancelCommentButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void commitCommentButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String commentDate = commentDateTF.getText();
        String commentTime = commentTimeTF.getText();
        String commentText = commentTextTF.getText();
        String fullComment = "DATE: " + commentDate + " TIME: " + commentTime + "\n" + commentText;
        student.addMeetingNote(fullComment);
        this.dispose();
    }

    private void closeDialog(java.awt.event.WindowEvent evt) {
        setVisible(false);
        dispose();
    }


    public static void main(String args[]) {
        new AddCommentGUI(new javax.swing.JFrame(), true, null).setVisible(true);
    }


    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton commitCommentButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton cancelCommentButton;
    private javax.swing.JTextArea commentTextTF;
    private javax.swing.JTextField commentTimeTF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField commentDateTF;

}
