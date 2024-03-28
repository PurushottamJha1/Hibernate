package HibernateCrudOperations.Crud.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InformationTechnologyDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Student_ID;
    private String Student_Name;
    private String Student_Email;

    public long getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(long Student_ID) {
        this.Student_ID = Student_ID;
    }

    public String getStudent_Name() {
        return Student_Name;
    }

    @Override
    public String toString() {
    	String s="InformationTechnologyStudents :\n" +
                "Student_ID=" + Student_ID +
                "\nStudent_Name= " + Student_Name  +
                "\nStudent_Email= "+Student_Email ;
        return  s;
                  }

    public void setStudent_Name(String Student_Name) {
        this.Student_Name = Student_Name;
    }

    public String getStudent_Email() {
        return Student_Email;
    }

    public void setStudent_Email(String Student_Email) {
        this.Student_Email = Student_Email;
    }
}