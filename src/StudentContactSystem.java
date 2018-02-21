import javax.swing.*;
import java.io.*;

public class StudentContactSystem extends JFrame {

    private StudentList studentList;
    private JFileChooser chooser = new JFileChooser();
    private File saveFile = null;
    private boolean changesMade = false;


    public StudentContactSystem() {
        initComponents();

        studentList = new StudentList();
        allStudents.setModel(studentList);
    }


    private void initComponents() {
        jPanel1 = new JPanel();
        jPanel6 = new JPanel();
        jScrollPane1 = new JScrollPane();
        allStudents = new JList<>();
        jPanel3 = new JPanel();
        addNewButton = new JButton();
        deleteButton = new JButton();
        jPanel2 = new JPanel();
        jPanel4 = new JPanel();
        jLabel1 = new JLabel();
        IDTF = new JTextField();
        jLabel2 = new JLabel();
        firstnameTF = new JTextField();
        jLabel3 = new JLabel();
        initsTF = new JTextField();
        jLabel4 = new JLabel();
        lastnameTF = new JTextField();
        jLabel5 = new JLabel();
        courseTF = new JTextField();
        jLabel6 = new JLabel();
        homePhoneTF = new JTextField();
        jLabel7 = new JLabel();
        mobilePhoneTF = new JTextField();
        jLabel8 = new JLabel();
        homeEmailTF = new JTextField();
        jPanel5 = new JPanel();
        commitButton = new JButton();
        cancelButton = new JButton();
        jMenuBar1 = new JMenuBar();
        fileMenu = new JMenu();
        openMenuItem = new JMenuItem();
        jSeparator1 = new JSeparator();
        saveMenuItem = new JMenuItem();
        saveAsMenuItem = new JMenuItem();
        jSeparator2 = new JSeparator();
        closeMenuItem = new JMenuItem();
        findMenu = new JMenu();
        findByIDMenuItem = new JMenuItem();
        findByNameMenuItem = new JMenuItem();
        optionsMenu = new JMenu();
        viewNotesMenuItem = new JMenuItem();
        addNotesMenuItem = new JMenuItem();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 220));
        allStudents.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                allStudentsKeyReleased(evt);
            }
        });

        allStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allStudentsMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(allStudents);

        jPanel6.add(jScrollPane1);

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        addNewButton.setText("Add New");
        addNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewButtonActionPerformed(evt);
            }
        });

        jPanel3.add(addNewButton);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jPanel3.add(deleteButton);

        jPanel1.add(jPanel3, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setPreferredSize(new java.awt.Dimension(250, 220));
        jLabel1.setText("Student ID");
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 17));
        jPanel4.add(jLabel1);

        IDTF.setColumns(15);
        IDTF.setEnabled(false);
        jPanel4.add(IDTF);

        jLabel2.setText("First Name");
        jLabel2.setPreferredSize(new java.awt.Dimension(80, 17));
        jPanel4.add(jLabel2);

        firstnameTF.setColumns(15);
        firstnameTF.setEnabled(false);
        jPanel4.add(firstnameTF);

        jLabel3.setText("Middle Inits");
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 17));
        jPanel4.add(jLabel3);

        initsTF.setColumns(15);
        initsTF.setEnabled(false);
        jPanel4.add(initsTF);

        jLabel4.setText("Last Name");
        jLabel4.setPreferredSize(new java.awt.Dimension(80, 17));
        jPanel4.add(jLabel4);

        lastnameTF.setColumns(15);
        lastnameTF.setEnabled(false);
        jPanel4.add(lastnameTF);

        jLabel5.setText("Course");
        jLabel5.setPreferredSize(new java.awt.Dimension(80, 17));
        jPanel4.add(jLabel5);

        courseTF.setColumns(15);
        courseTF.setEnabled(false);
        jPanel4.add(courseTF);

        jLabel6.setText("Home Phone");
        jLabel6.setPreferredSize(new java.awt.Dimension(80, 17));
        jPanel4.add(jLabel6);

        homePhoneTF.setColumns(15);
        homePhoneTF.setEnabled(false);
        jPanel4.add(homePhoneTF);

        jLabel7.setText("Mobile Phone");
        jLabel7.setPreferredSize(new java.awt.Dimension(80, 17));
        jPanel4.add(jLabel7);

        mobilePhoneTF.setColumns(15);
        mobilePhoneTF.setEnabled(false);
        jPanel4.add(mobilePhoneTF);

        jLabel8.setText("Home Email");
        jLabel8.setPreferredSize(new java.awt.Dimension(80, 17));
        jPanel4.add(jLabel8);

        homeEmailTF.setColumns(15);
        homeEmailTF.setEnabled(false);
        jPanel4.add(homeEmailTF);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        commitButton.setText("Commit");
        commitButton.setEnabled(false);
        commitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitButtonActionPerformed(evt);
            }
        });

        jPanel5.add(commitButton);

        cancelButton.setText("Cancel");
        cancelButton.setEnabled(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jPanel5.add(cancelButton);

        jPanel2.add(jPanel5, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel2, java.awt.BorderLayout.EAST);

        fileMenu.setText("File");
        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });

        fileMenu.add(openMenuItem);
        fileMenu.add(jSeparator1);
        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });

        fileMenu.add(saveMenuItem);
        saveAsMenuItem.setText("Save As...");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });

        fileMenu.add(saveAsMenuItem);
        fileMenu.add(jSeparator2);
        closeMenuItem.setText("Close");
        closeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeMenuItemActionPerformed(evt);
            }
        });

        fileMenu.add(closeMenuItem);
        jMenuBar1.add(fileMenu);
        findMenu.setText("Find");
        findByIDMenuItem.setText("Find By ID");
        findByIDMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findByIDMenuItemActionPerformed(evt);
            }
        });

        findMenu.add(findByIDMenuItem);
        findByNameMenuItem.setText("Find By Name");
        findByNameMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findByNameMenuItemActionPerformed(evt);
            }
        });

        findMenu.add(findByNameMenuItem);
        jMenuBar1.add(findMenu);
        optionsMenu.setText("Options");
        viewNotesMenuItem.setText("View Notes");
        viewNotesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewNotesMenuItemActionPerformed(evt);
            }
        });

        optionsMenu.add(viewNotesMenuItem);
        addNotesMenuItem.setText("Add Notes");
        addNotesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNotesMenuItemActionPerformed(evt);
            }
        });

        optionsMenu.add(addNotesMenuItem);
        jMenuBar1.add(optionsMenu);
        setJMenuBar(jMenuBar1);

        pack();
    }

    private void closeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        saveIfNecessary();

        if (JOptionPane.showConfirmDialog(this, "Really Quit?", "Quit?",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        int returnVal = chooser.showSaveDialog(this);
        if(returnVal != JFileChooser.APPROVE_OPTION) {
            // user hit OK without entering a filename
        } else {
            saveFile = chooser.getSelectedFile();
            try {
                FileOutputStream out = new FileOutputStream(saveFile);
                ObjectOutputStream oOut = new ObjectOutputStream(out);
                oOut.writeObject(studentList);
                oOut.flush();
                oOut.close();
            } catch (Exception e) {
                System.out.print("Error : " + e);
            }
            changesMade=false;
        }
    }

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        if (saveFile == null)
            saveAsMenuItemActionPerformed(null);
        else{
            try {
                FileOutputStream out = new FileOutputStream(saveFile);
                ObjectOutputStream oOut = new ObjectOutputStream(out);
                oOut.writeObject(studentList);
                oOut.flush();
                oOut.close();
            } catch (Exception e) {
                System.out.print("Error : " + e);
            }
            changesMade = false;
        }
    }

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        saveIfNecessary();

        int returnVal = chooser.showOpenDialog(this);
        if(returnVal != JFileChooser.APPROVE_OPTION) {
            // user cancelled, or something went wrong
        } else {
            File selectedFile = chooser.getSelectedFile();
            if (!selectedFile.exists()){
                new JOptionPane().showMessageDialog(this,
                        "Error: File Not Found",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                saveFile = chooser.getSelectedFile();
                try {
                    FileInputStream in = new FileInputStream(saveFile);
                    ObjectInputStream oIn = new ObjectInputStream(in);
                    studentList = (StudentList)oIn.readObject();
                    oIn.close();
                } catch (Exception e) {
                    System.out.print("Error : " + e);
                }

                changesMade = false;
                allStudents.setModel(studentList);
                clearAllFields();
            }
        }

    }

    private void saveIfNecessary(){
        boolean inLoop = changesMade;
        while(inLoop){
            if (JOptionPane.showConfirmDialog(this, "Save Changes?",
                    "Save Changes?",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                saveMenuItemActionPerformed(null);
                inLoop = changesMade;
            } else
                inLoop = false;
        }
    }

    private void allStudentsKeyReleased(java.awt.event.KeyEvent evt) {
        allStudentsMouseClicked(null);
    }

    private void allStudentsMouseClicked(java.awt.event.MouseEvent evt) {
        Student selected = allStudents.getSelectedValue();
        if (selected != null) {
            populateAllTextFields(selected);
        }
    }

    private void addNotesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        Student selected = allStudents.getSelectedValue();
        if (selected == null) {
            JOptionPane.showMessageDialog(this, "Please Select a Student First");
        } else {
            new AddCommentGUI(this, true, selected).setVisible(true);
            changesMade = true;
        }
    }

    private void viewNotesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        Student selected = allStudents.getSelectedValue();
        if (selected == null) {
            JOptionPane.showMessageDialog(this, "Please Select a Student First");
        } else {
            new ShowCommentsGUI(this, true, selected.getMeetingNotes()).setVisible(true);
        }
    }

    private void findByNameMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        Student searchedFor;
        String findName = JOptionPane.showInputDialog(this, "Enter Lastname");

        if (findName != null) {
            searchedFor = studentList.findByLastName(findName);

            if (searchedFor == null) {
                JOptionPane.showMessageDialog(this, "Sorry, Not Found");
            } else {
                populateAllTextFields(searchedFor);
                allStudents.setSelectedValue(searchedFor, true);
            }
        }
    }

    private void findByIDMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        Student searchedFor;
        String findID = JOptionPane.showInputDialog(this, "Enter ID");

        if (findID != null) {
            searchedFor = studentList.findByID(findID);

            if (searchedFor == null) {
                JOptionPane.showMessageDialog(this, "Sorry, Not Found");
            } else {
                populateAllTextFields(searchedFor);
                allStudents.setSelectedValue(searchedFor, true);
            }
        }
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        clearAllFields();
        disableAllFields();
        changeToViewMode();
    }

    private void commitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String newID = IDTF.getText();
        String newFirstname = firstnameTF.getText();
        String newInits = initsTF.getText();
        String newLastname = lastnameTF.getText();
        String newCourse = courseTF.getText();
        String newHomePhone = homePhoneTF.getText();
        String newMobilePhone = mobilePhoneTF.getText();
        String newHomeEmail = homeEmailTF.getText();

        if (newID.equals("") || newFirstname.equals("") ||
                newLastname.equals("") || newCourse.equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Please Enter (at least) ID, Firstname, Lastname, and Course");
        } else {
            studentList.addStudent(newID, newFirstname, newInits, newLastname,
                    newCourse, newHomeEmail, newHomePhone, newMobilePhone);
            disableAllFields();
            changeToViewMode();

            // scroll the student list to the newly added entry
            Student newStudent = studentList.findByID(newID);
            allStudents.setSelectedValue(newStudent, true);
            changesMade = true;
        }
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedIndex = allStudents.getSelectedIndex();

        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Select A Student");
        } else {
            Student toGo = studentList.getElementAt(selectedIndex);
            if (JOptionPane.showConfirmDialog(this, "Really Delete Student: "
                            + toGo, "Delete Confirmation",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                studentList.removeStudent(toGo.getStudentNumber());
                clearAllFields();
                allStudents.clearSelection();
                changesMade = true;
            }
        }
    }



    private void addNewButtonActionPerformed(java.awt.event.ActionEvent evt) {
        enableAllFields();
        clearAllFields();
        changeToEditMode();
    }

    private void changeToEditMode(){
        addNewButton.setEnabled(false);
        deleteButton.setEnabled(false);
        fileMenu.setEnabled(false);
        findMenu.setEnabled(false);
        optionsMenu.setEnabled(false);
        commitButton.setEnabled(true);
        cancelButton.setEnabled(true);
        allStudents.setEnabled(false);
    }

    private void changeToViewMode(){
        addNewButton.setEnabled(true);
        deleteButton.setEnabled(true);
        fileMenu.setEnabled(true);
        findMenu.setEnabled(true);
        optionsMenu.setEnabled(true);
        commitButton.setEnabled(false);
        cancelButton.setEnabled(false);
        allStudents.clearSelection();
        allStudents.setEnabled(true);
    }

    private void enableAllFields(){
        IDTF.setEnabled(true);
        firstnameTF.setEnabled(true);
        initsTF.setEnabled(true);
        lastnameTF.setEnabled(true);
        courseTF.setEnabled(true);
        homePhoneTF.setEnabled(true);
        mobilePhoneTF.setEnabled(true);
        homeEmailTF.setEnabled(true);
    }

    private void disableAllFields(){
        IDTF.setEnabled(false);
        firstnameTF.setEnabled(false);
        initsTF.setEnabled(false);
        lastnameTF.setEnabled(false);
        courseTF.setEnabled(false);
        homePhoneTF.setEnabled(false);
        mobilePhoneTF.setEnabled(false);
        homeEmailTF.setEnabled(false);
    }

    private void clearAllFields(){
        IDTF.setText("");
        firstnameTF.setText("");
        initsTF.setText("");
        lastnameTF.setText("");
        courseTF.setText("");
        homePhoneTF.setText("");
        mobilePhoneTF.setText("");
        homeEmailTF.setText("");
    }

    private void populateAllTextFields(Student s){
        IDTF.setText(s.getStudentNumber());
        firstnameTF.setText(s.getFirstname());
        initsTF.setText(s.getInitials());
        lastnameTF.setText(s.getLastname());
        courseTF.setText(s.getPathway());
        homePhoneTF.setText(s.getTelephoneNo());
        mobilePhoneTF.setText(s.getMobileNo());
        homeEmailTF.setText(s.getHomeEmail());
    }

    private void exitForm(java.awt.event.WindowEvent evt) {
        saveIfNecessary();
        System.exit(0);
    }


    public static void main(String args[]) {
        new StudentContactSystem().setVisible(true);
    }


    private JLabel jLabel8;
    private JLabel jLabel4;
    private JMenuItem addNotesMenuItem;
    private JSeparator jSeparator2;
    private JTextField homePhoneTF;
    private JPanel jPanel4;
    private JScrollPane jScrollPane1;
    private JTextField firstnameTF;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JMenu fileMenu;
    private JTextField initsTF;
    private JButton deleteButton;
    private JMenu optionsMenu;
    private JTextField IDTF;
    private JPanel jPanel3;
    private JLabel jLabel2;
    private JList<Student> allStudents;
    private JMenuItem saveAsMenuItem;
    private JMenuItem saveMenuItem;
    private JPanel jPanel2;
    private JPanel jPanel5;
    private JMenuItem findByIDMenuItem;
    private JMenuItem viewNotesMenuItem;
    private JTextField mobilePhoneTF;
    private JTextField homeEmailTF;
    private JTextField courseTF;
    private JMenuItem openMenuItem;
    private JButton cancelButton;
    private JLabel jLabel7;
    private JButton commitButton;
    private JSeparator jSeparator1;
    private JButton addNewButton;
    private JPanel jPanel1;
    private JPanel jPanel6;
    private JLabel jLabel6;
    private JMenuItem closeMenuItem;
    private JTextField lastnameTF;
    private JMenuItem findByNameMenuItem;
    private JLabel jLabel5;
    private JMenu findMenu;
    private JMenuBar jMenuBar1;

}
