package entities;
import java.util.*;
public class school {
	private String name;
	private String location;
	private int numOfStudent;
	private boolean housed;
	private Vector <String> professorNames;
	private Vector <String> studentNames;
	private ArrayList <String> houseName;
	private ArrayList <String> courseNames;
	public school(String newName,String newLocation ,int newNumOfStudent,boolean newHoused, Vector<String> newProfessorNames,
    Vector<String> newStudentNames,ArrayList<String> newHouseName,ArrayList<String> newCourseNames){
	name = newName;
	location = newLocation;
	numOfStudent = newNumOfStudent;
	housed = newHoused;
	professorNames = newProfessorNames;
	studentNames = newStudentNames; 
	houseName = newHouseName;
	courseNames = newCourseNames;
	if(studentNames != null)
		numOfStudent = studentNames.size();
	else 
		numOfStudent = 0;
	if(newHouseName == null ||newHouseName.isEmpty())
	    housed = false;
	    else
	    housed = true;
	}
	public String getName(){
	    return name;
	}
	public void setName(String newName){
		name = newName;
	}
	public String getLocation(){
		return location;
	}
	public void setLocation(String newLocation){
		location = newLocation;
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
	public ArrayList<String> getHouseNames() 
	{
		return houseName; 
	}
	public void setHouseNames(ArrayList<String> houses)
	{
		houseName = houses;
	}
	public Vector<String> getProfessorNames()
	{
		return professorNames;
	}
	public void setProfessorNames(Vector<String> professors)
	{
		professorNames = professors;
	}
	public ArrayList<String> getCourseNames() 
	{
		return courseNames; 
	}
	public void setCourseNames(ArrayList<String> courses)
	{
		courseNames = courses;
	}
	 }
	
	