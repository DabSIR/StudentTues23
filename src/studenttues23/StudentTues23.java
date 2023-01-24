package studenttues23;

/**
 *jan 24 2023
 * @author Dylan
 */
public class StudentTues23 {

    private String studentId;
    private String studentName;
    private String address;
    
    public StudentTues23() {
        studentId = "";
        studentName = "";
    }

    public StudentTues23(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
 
}
