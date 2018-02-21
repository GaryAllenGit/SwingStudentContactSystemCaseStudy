import javax.swing.DefaultListModel;

public class StudentList extends DefaultListModel<Student> {

    public StudentList(){
        super();
    }

    public void addStudent(String id, String fn, String inits, String ln,
                           String course, String email, String homePhone,
                           String mobilePhone){
        super.addElement(new Student(id, fn, inits, ln,
                course, email, homePhone, mobilePhone));
    }

    public Student findByID(String id){
        Student temp;
        int indexLocation = -1;
        for (int i = 0; i < super.size(); i++) {
            temp = super.elementAt(i);
            if (temp.getStudentNumber().equals(id)){
                indexLocation = i;
                break;
            }
        }

        if (indexLocation == -1) {
            return null;
        } else {
            return super.elementAt(indexLocation);
        }
    }

    public Student findByLastName(String name){
        Student temp;
        int indexLocation = -1;
        for (int i = 0; i < super.size(); i++) {
            temp = super.elementAt(i);
            if (temp.getLastname().equals(name)){
                indexLocation = i;
                break;
            }
        }

        if (indexLocation == -1) {
            return null;
        } else {
            return super.elementAt(indexLocation);
        }
    }

    public void removeStudent(String id){
        Student toGo = this.findByID(id);
        super.removeElement(toGo);
    }

}
