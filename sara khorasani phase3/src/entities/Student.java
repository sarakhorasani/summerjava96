package entities;

import java.util.Vector;

public class Student extends person{
	private Vector<course> courses;
	private Vector<finishedCourse> reportCard;
	
	/*			CONSTRUCTORS			*/
	public Student(String newName, House newHouse, Bloodstatus newBloodStatus, school newSchool, String newBirthday,
			Vector<course> newCourses, Vector<finishedCourse> newReportCard)
	{
		name = newName;
		house = newHouse;
		bloodStatus = newBloodStatus;
		school = newSchool;
		birthday = newBirthday;
		courses = newCourses;
		reportCard = newReportCard;
	}

	public Student(String name) {
		this(name, null, Bloodstatus.Muggle, null, "00.00.0000",
				new Vector<course>(), new Vector<finishedCourse>());

	}
	
	/*				GETTERS				*/
	public Vector<course> getCourses()
	{
		return courses;
	}
	public Vector<finishedCourse> getReportCard()
	{
		return reportCard;
	}

	/*				SETTERS				*/
	public void setCourses(Vector<course> newCourses)
	{
		courses = newCourses;
	}
	public void setReportCard(Vector<finishedCourse> newReportCard)
	{
		reportCard = newReportCard;
	}
	
}
