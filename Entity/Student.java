package Entity;
public class Student extends Person{
 
	
	private String studentDepartment;
	private String course1;
	private String course2;
	private String course3;
	private int creditComplete;
	private double cgpa;
	
	private static int StudentCounter=0;
	
	public Student(){}
	public Student(String id,String name,String phoneNumber,
	              String emailAdress,String studentDepartment,
				  String course1,String course2,String course3,
				  int creditComplete,double cgpa){
		super(id,name,phoneNumber,emailAdress);
		this.studentDepartment=studentDepartment;
		this.course1 = course1; 
		this.course2 = course2;
		this.course3 = course3;
		this.creditComplete= creditComplete;
		this.cgpa=cgpa;
		StudentCounter++;
	}
	
	
	public void setStudentDepartment(String studentDepartment){
		this.studentDepartment=studentDepartment;
	}
	public String getStudentDepartment(){return studentDepartment;}
	
	public void setCourse1(String Course1){
		this.course1 = course1; 
	}
	public String getCourse1(){return course1;} 
	public void setCourse2(String Course2){
		this.course2 = course2; 
	}
	public String getCourse2(){return course2;}
	
	public void setCourse3(String Course3){
		this.course3 = course3; 
	}
	public String getCourse3(){return course3;} 
	
	public void setCreditComplete(int creditComplete){
		this.creditComplete=creditComplete;
	}
	public int getCreditComplete(){return creditComplete;}
	
	public void setCgpa(double cgpa){
		this.cgpa=cgpa;
	}
	public double getCgpa(){return cgpa;}
	
	
	public void showStudentInfo(){
	    System.out.println("Student Id : " + getId());
        System.out.println("Student Name : " + getName());
        System.out.println("Student Author : " + getPhoneNumber());
		System.out.println("Student Author : " + getEmailAdress());
		
		System.out.println("Student Type : "+studentDepartment);
		System.out.println("Course1 : "+course1 );
		System.out.println("Course1 : "+course2 );
		System.out.println("Course1 : "+course3 );
	    System.out.println("cgpa : "+cgpa);
	}
		 public String getStudentAcademicInfoAsString() {
        String studentAcademicInfo = "";
        studentAcademicInfo = super.getPersonalInfoAsString();
        studentAcademicInfo += "   Academic Information \n ";
        studentAcademicInfo += "   --------------------------\n";
        studentAcademicInfo += "    Student Departmen:" + studentDepartment + "\n";
        studentAcademicInfo += "    Course1                         :" + course1 + "\n";
        studentAcademicInfo += "    Course2                         :" + course2 + "\n";
        studentAcademicInfo += "    Course3                         :" + course3 + "\n";
        studentAcademicInfo += "    CreditComplete        :" + creditComplete + "\n";
        studentAcademicInfo += "    CGPA                                :" + cgpa + "\n";

        return studentAcademicInfo;
    }
 
	public static void totalNumberOfUniqueStudents(){
		//System.out.println("Total Number Of Unique Students : " + StudentCounter);
	    String Students = "";
		Students+= "Total Number Of Unique Students : " + StudentCounter;
		 
	}
	 

	public String deleteByIdGUI(){
		 
		String Students = "";
		Students+= "--Deletion Successfull--\n";
		 
		return Students;
	
	
		 
	
}
}