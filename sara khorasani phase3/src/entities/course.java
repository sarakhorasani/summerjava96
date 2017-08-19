package entities;
import java.util.*;
public class course {
	private String name;
	private char minGrade;
	private String professorName;
	private int year;
	private Vector<String> studentNames;
	public course(String newName, char newMinGrade, String newProfessorName,int newYear){
		name = newName;
		minGrade = newMinGrade;
		professorName = newProfessorName;
		year = newYear;
	    studentNames = new Vector<String>();
	}
	public String getName(){
	    return name;
	}
	public void setName(String newName){
		name = newName;
	}
	public char getMinGrade(){
		return minGrade;
	}
	public void setMinGrade(char newMinGrade){
		minGrade = newMinGrade;
	}
	public String getProfessorName(){
		return professorName;
	}
	public void setProfessorName(String newProfessorName){
		professorName = newProfessorName;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int newYear){
		year = newYear;
	}
	public Vector<String> getStudentNames()
	{
		return studentNames;
	}
	public void setStudentNames(Vector<String> students)
	{
		studentNames = students;
	}
      }

