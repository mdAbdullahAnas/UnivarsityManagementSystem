package Entity;
public class Teacher extends Person{
 
	
	private String joining;
	private String teacherDepartment;
	private String roomNumber;
	private String conselting;
 
	
	private static int TeacherCounter=0;
	
	public Teacher(){}
	public Teacher(String id,String name,String phoneNumber,
	              String emailAdress,String joining,
				  String teacherDepartment,String roomNumber,String conselting){
		super(id,name,phoneNumber,emailAdress);
		this.joining=joining;
		this.teacherDepartment = teacherDepartment; 
		this.roomNumber = roomNumber;
		this.conselting = conselting;
		TeacherCounter++;
	}
	
	
	public void setJoining(String joining){
		this.joining=joining;
	}
	public String getJoining(){return joining;}
	
	public void setTeacherDepartment(String teacherDepartment){
		this.teacherDepartment = teacherDepartment; 
	}
	public String getTeacherDepartment(){return teacherDepartment;} 
	public void setRoomNumber(String roomNumber){
		this.roomNumber = roomNumber; 
	}
	public String getRoomNumber(){return roomNumber;}
	
	public void setConselting(String conselting){
		this.conselting = conselting; 
	}
	public String   getConselting(){return conselting;} 
	
	
	public void showTeacherInfo(){
	    System.out.println("Teacher Id : " + getId());
        System.out.println("Teacher Name : " + getName());
        System.out.println("Teacher Author : " + getPhoneNumber());
		System.out.println("Teacher Author : " + getEmailAdress());
		
		System.out.println("Teacher Type : "+joining);
		System.out.println("teacherDepartment : "+teacherDepartment );
		System.out.println("teacherDepartment : "+roomNumber );
		System.out.println("teacherDepartment : "+conselting );
	 
	}
		 public String getTeacherAcademicInfoAsString() {
        String TeacherAcademicInfo = "";
        TeacherAcademicInfo = super.getPersonalInfoAsString();
        TeacherAcademicInfo += "   Academic Information \n ";
        TeacherAcademicInfo += "   --------------------------\n";
        TeacherAcademicInfo += "    Joining Date   :" + joining + "\n";
        TeacherAcademicInfo += "    Teacher Department                         :" + teacherDepartment + "\n";
        TeacherAcademicInfo += "    Room Number                         :" + roomNumber + "\n";
        TeacherAcademicInfo += "    Conselting                         :" + conselting + "\n";
 
        return TeacherAcademicInfo;
    }
 
	public static void totalNumberOfUniqueTeachers(){
		//System.out.println("Total Number Of Unique Teachers : " + TeacherCounter);
	    String Teachers = "";
		Teachers+= "Total Number Of Unique Teachers : " + TeacherCounter;
		 
	}
	 

	public String deleteByIdGUI(){
		 
		String Teachers = "";
		Teachers+= "--Deletion Successfull--\n";
		 
		return Teachers;
	
	
		 
	
}
}