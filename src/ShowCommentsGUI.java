import java.util.ArrayList;

public class ShowCommentsGUI extends javax.swing.JDialog {

    public ShowCommentsGUI(java.awt.Frame parent, boolean modal, ArrayList<String> comments) {
        super(parent, modal);
        initComponents();

        // show the comments
        for (String current : comments) {
            listOfComments.append(current + "\n\n\n");
        }
    }


    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listOfComments = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        showDoneButton = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jScrollPane1.setPreferredSize(new java.awt.Dimension(420, 350));
        listOfComments.setColumns(40);
        listOfComments.setEditable(false);
        listOfComments.setRows(20);
        jScrollPane1.setViewportView(listOfComments);

        jPanel1.add(jScrollPane1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        showDoneButton.setText("Done");
        showDoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDoneButtonActionPerformed(evt);
            }
        });

        jPanel2.add(showDoneButton);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pack();
    }
    private void showDoneButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void closeDialog(java.awt.event.WindowEvent evt) {
        setVisible(false);
        dispose();
    }


    public static void main(String args[]) {
        new ShowCommentsGUI(new javax.swing.JFrame(), true, null).setVisible(true);
    }


    private javax.swing.JButton showDoneButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea listOfComments;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel1;

}
