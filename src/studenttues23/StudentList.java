/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studenttues23;



/**
 *dylan
 * @author Dylan
 */
public class StudentList {

    public static void main(String[] args) {
        StudentTues23 s1 = new StudentTues23("s1", "Dylan");
        StudentTues23[] studentList = new StudentTues23[3];
        studentList[0] = s1;
        studentList[1] = new StudentTues23("s2", "Mike");
        studentList[2] = new StudentTues23("s3", "Tom");
        
        for(int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i].getStudentName());
            System.out.println(studentList[i].getStudentId());
        }
        
        
    } //end of main
    
} //end of class
