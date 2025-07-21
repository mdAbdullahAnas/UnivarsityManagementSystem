 package Entity;
public class Staff extends Person{
 
	
	private String joining;
	private String staffDepartment;
	private String roomNumber;
	private String workingHour ;
 
	
	private static int StaffCounter=0;
	
	public Staff(){}
	public Staff(String id,String name,String phoneNumber,
	              String emailAdress,String joining,
				  String staffDepartment,String roomNumber,String workingHour ){
		super(id,name,phoneNumber,emailAdress);
		this.joining=joining;
		this.staffDepartment = staffDepartment; 
		this.roomNumber = roomNumber;
		this.workingHour  = workingHour ;
		StaffCounter++;
	}
	
	
	public void setJoining(String joining){
		this.joining=joining;
	}
	public String getJoining(){return joining;}
	
	public void setStaffDepartment(String staffDepartment){
		this.staffDepartment = staffDepartment; 
	}
	public String getStaffDepartment(){return staffDepartment;} 
	public void setRoomNumber(String roomNumber){
		this.roomNumber = roomNumber; 
	}
	public String getRoomNumber(){return roomNumber;}
	
	public void setWorkingHour (String workingHour ){
		this.workingHour  = workingHour ; 
	}
	public String getWorkingHour(){return workingHour ;} 
	
	
	public void showStaffInfo(){
	    System.out.println("Staff Id : " + getId());
        System.out.println("Staff Name : " + getName());
        System.out.println("Staff Author : " + getPhoneNumber());
		System.out.println("Staff Author : " + getEmailAdress());
		
		System.out.println("Staff Type : "+joining);
		System.out.println("staffDepartment : "+staffDepartment );
		System.out.println("staffDepartment : "+roomNumber );
		System.out.println("staffDepartment : "+workingHour  );
	 
	}
		 public String getStaffAcademicInfoAsString() {
        String StaffAcademicInfo = "";
        StaffAcademicInfo = super.getPersonalInfoAsString();
        StaffAcademicInfo += "   Others Information \n ";
        StaffAcademicInfo += "   --------------------------\n";
        StaffAcademicInfo += "    Joining Date               :" + joining + "\n";
        StaffAcademicInfo += "    Staff Department       :" + staffDepartment + "\n";
        StaffAcademicInfo += "    Room Number             :" + roomNumber + "\n";
        StaffAcademicInfo += "    Working Hour            :" + workingHour  + "\n";
 
        return StaffAcademicInfo;
    }
 
	public static void totalNumberOfUniqueStaffs(){
		//System.out.println("Total Number Of Unique Staffs : " + StaffCounter);
	    String Staffs = "";
		Staffs+= "Total Number Of Unique Staffs : " + StaffCounter;
		 
	}
	 

	public String deleteByIdGUI(){
		 
		String Staffs = "";
		Staffs+= "--Deletion Successfull--\n";
		 
		return Staffs;
	
	
		 
	
}
}