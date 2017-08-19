package entities;
	import java.util.*;
	public class person {
	private String name;
	private String housename;
	private String bloodstatus;
	private String school;
	private Date birthday;
	public void Person(String newName, String newHousename, String newBloodstatus, String newSchool,Date newBirthday )
	{
		name = newName;
		housename = newHousename;
		school = newSchool;
		bloodstatus = newBloodstatus;
		birthday = newBirthday;
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
	public Date getBirthday(){
		return birthday;
	}
	public String getSchool(){
		return school;
	}
	public void setSchool(String newSchool){
		school = newSchool;
	}
	public void setBirthday(Date newBirthday){
		birthday = newBirthday; 
	}
	public String toString()
	{
		String temp = new String();
		temp += name + '\n' + "House Name : " + housename + '\n';
		return temp;
	}
	
	}
