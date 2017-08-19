package entities;

public class Professor extends person {
	//private Map<Integer,Course> courses;(?!)
	private String notes;
	public Professor(String newNotes){
		notes = newNotes;
		//courses = newCourses;(?!)
	}
public String getNotes(){
	return notes;
}
public void setNotes(String newNotes){
	notes = newNotes;
}
}
