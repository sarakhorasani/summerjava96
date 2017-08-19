package entities;
import java.util.*;
public class House {
private String name;
private school school; 
private Vector<Student> students;
private Professor headTeacher;
private ArrayList<String> qualities;
//private Map <Integer,Student> perfects; (?!)
public House(String newName,school newSchool
,Professor newHeadTeacher,ArrayList <String> newQualities, Map <Integer , Student>perfects){
name = newName;
school = newSchool;
students = new Vector <Student>();
headTeacher = newHeadTeacher;
qualities = newQualities;
//HashMap<Integer,Student> perfects = new HashMap<Integer,Student>(); (?!)
}
public String getName(){
    return name;
}
public void setName(String newName){
	name = newName;
}
public school getSchool(){
	return school;
}
public void setSchool(school newSchool){
	school = newSchool;
}
public Professor getHeadTeacher(){
	return headTeacher;
}
public void setHeadTeacher(Professor newHeadTeacher){
	headTeacher = newHeadTeacher;
}
public Vector<Student> getStudents()
{
	return students;
}
public void setStudents(Vector<Student> student)
{
	students = student;
}
public ArrayList<String> getQualities() 
{
	return qualities; 
}
public void setQualities(ArrayList<String> qual)
{
	qualities = qual;
}
}
