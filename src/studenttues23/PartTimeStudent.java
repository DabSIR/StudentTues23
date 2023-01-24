/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studenttues23;

/**
 *
 * @author Dylan
 */
public class PartTimeStudent extends StudentTues23 {
    private int numOfCourse;

    public PartTimeStudent(int numOfCourse) {
        this.numOfCourse = numOfCourse;
    }

    public PartTimeStudent(int numOfCourse, String studentId, String studentName) {
        super(studentId, studentName);
        this.numOfCourse = numOfCourse;
    }

    public int getNumOfCourse() {
        return numOfCourse;
    }

    public void setNumOfCourse(int numOfCourse) {
        this.numOfCourse = numOfCourse;
    }
    
    
    
    
    
}
