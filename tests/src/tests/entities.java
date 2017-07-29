package tests;
import java.util.ArrayList;
import java.util.Vector;
public class entities {
	 public class person{
    public void Person()
	{
	}
private String name;
private String housename;
private String bloodstatus;
private String school;
public void Person(String newName, String newHousename, String newBloodstatus, String newSchool,String newBirthday )
{
	name = newName;
	housename = newHousename;
	bloodstatus = newBloodstatus;
	school = newSchool;
}
public String getName(){
    return name;
}
public void setName(String newName){
    name = newName;
}
public String getHousename(){
	return housename;
}
public void setHousename(String newHousename){
	housename = newHousename;
}
public String getBloodstatus(){
	return bloodstatus;
}
public void setBloodstatus(String newBloodstatus){
	bloodstatus = newBloodstatus;
}
//class EnumBloodstatus{
	//public enum bloodstatus{ Muggle ,Pure_blood,Half_blood,Muggle_born,Squibb}
//	public static void main (String[]args){
	//	for (bloodstatus A : bloodstatus.value())
			//System.out.println(A);
	//}
public String getSchool(){
	return school;
}
public void setSchool(String newSchool ){
	school = newSchool;
}
	}
class school{
public school()
{
}
private String name;
private int numOfStudent;
private boolean housed;
private Vector <String> professorNames;
private Vector <String> studentNames;
private ArrayList <String> houseName;
private ArrayList <String> courseNames;
public school(String newName,int newNumOfStudent,boolean newHoused){
name = newName;
numOfStudent = newNumOfStudent;
housed = newHoused;
ArrayList<String> houseName = new ArrayList<String>();
    System.out.println(houseName);
ArrayList<String> courseNames = new ArrayList<String>();
    System.out.println(courseNames);
    Vector<String> professorNames = new Vector<String>();
    Vector<String> studentNames = new Vector<String>();
}
public String getName(){
    return name;
}
public void setName(String newName){
	name = newName;
}
public int getnumOfStudent(){
	return numOfStudent;
}
public void setNumOfStudent(int newNumOfStudent){
	numOfStudent = newNumOfStudent;
}
public boolean getHoused(){
	return housed;
}
public void setHoused(boolean newHoused){
	housed = newHoused;
}
 }
class course{
	public course()
	{
	}
	private String name;
	private char minGrade;
	private String professorName;
	private int year;
	private Vector <String> studentNames;
	public course(String newName, char newMinGrade, String newProfessorName,int newYear){
		name = newName;
		minGrade = newMinGrade;
		professorName = newProfessorName;
		year = newYear;
		Vector<String> studentNames = new Vector<String>();
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
	 }
      }
