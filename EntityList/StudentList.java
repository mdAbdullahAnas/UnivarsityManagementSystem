package EntityList;
import Entity.*;
import java.util.List;
import java.util.ArrayList;
import Interfaces.*;
 
public class StudentList{
	private Student students[];
	public StudentList(){
		students = new Student[5];
	}
	public StudentList(int size){
		students = new Student[size];
	}
	
	public void insert(Student s){
		boolean flag = false;
		for(int i=0;i<students.length;i++){
			if(students[i] == null){
				students[i] = s;
				flag = true;
				break;
			}
		}
		if(flag){System.out.println("Insertion Successfull");}
		else{System.out.println("Insertion Failed");}
	}
	
	public Student getById(String id){
		for(int i=0;i<students.length;i++){
			if(students[i] != null){
				if(students[i].getId().equals(id)){
					return students[i];
				}
			}
		}
		return null;
	}
	
	public Student deleteById(String id){
		boolean flag = false;
		for(int i=0;i<students.length;i++){
			if(students[i] != null){
				if(students[i].getId().equals(id)){
					students[i] = null;
					flag = true;
					break;
				}
			}
		}
		if(flag){System.out.println("Deletion Successfull");}
		else{System.out.println("Deletion Failed");}
		return null;
	}
	
	
	public void searchByName(String name){
		for(int i=0;i<students.length;i++){
			if(students[i] != null){
				if(students[i].getName().equals(name)){
					System.out.println("+++ Student Found +++");
					students[i].showStudentInfo();
					return;
				}
			}
		}
		System.out.println("-- Student Not Found ---");
		return;
	}
	
	
 
	
	public void showAll(){
		System.out.println("++++++ List of All Available Students ++++++");
		for(int i=0;i<students.length;i++){
			if(students[i] != null){ //looking for Student objects
			System.out.println("---------------------");
			 
				students[i].showStudentInfo();
			}
		}
		System.out.println("---------------------");
       
	}
	
	public String getAll(){
		String allStudents = "";
		
		for(int i=0;i<students.length;i++){
			if(students[i] != null){ //looking for Student objects
				allStudents += "------------------------\n";
				allStudents += " \n";
				 
				allStudents += students[i].getStudentAcademicInfoAsString();
			}
		}
		
		allStudents += "------------------------\n";
		
		return allStudents;
	}
	public Student[] getAllStudents() {
    List<Student> availableStudents = new ArrayList<>();
    
    for (int i = 0; i < students.length; i++) {
        if (students[i] != null) {
            availableStudents.add(students[i]);
        }
    }
    
    return availableStudents.toArray(new Student[0]);
}

	
}