package EntityList;
import Entity.*;
import java.util.List;
import java.util.ArrayList;
import Interfaces.*;
 
public class TeacherList{
	private Teacher teachers[];
	public TeacherList(){
		teachers = new Teacher[5];
	}
	public TeacherList(int size){
		teachers = new Teacher[size];
	}
	
	public void insert(Teacher b){
		boolean flag = false;
		for(int i=0;i<teachers.length;i++){
			if(teachers[i] == null){
				teachers[i] = b;
				flag = true;
				break;
			}
		}
		if(flag){System.out.println("Insertion Successfull");}
		else{System.out.println("Insertion Failed");}
	}
	
	public Teacher getById(String id){
		for(int i=0;i<teachers.length;i++){
			if(teachers[i] != null){
				if(teachers[i].getId().equals(id)){
					return teachers[i];
				}
			}
		}
		return null;
	}
	
	public Teacher deleteById(String id){
		boolean flag = false;
		for(int i=0;i<teachers.length;i++){
			if(teachers[i] != null){
				if(teachers[i].getId().equals(id)){
					teachers[i] = null;
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
		for(int i=0;i<teachers.length;i++){
			if(teachers[i] != null){
				if(teachers[i].getName().equals(name)){
					System.out.println("+++ Teacher Found +++");
					teachers[i].showTeacherInfo();
					return;
				}
			}
		}
		System.out.println("-- Teacher Not Found ---");
		return;
	}
		// public Teacher getById(String id){
		// for(int i=0;i<teacher.length;i++){
			// if(teacher[i] != null){
				// if(teacher[i].geId().equals(id)){
					// return teacher[i];
				// }
			// }
		// }
		// return null;
	// }
	
	
	public void showAll(){
		System.out.println("++++++ List of All Available teachers ++++++");
		for(int i=0;i<teachers.length;i++){
			if(teachers[i] != null){ //looking for Teacher objects
			System.out.println("---------------------");
			 
				teachers[i].showTeacherInfo();
			}
		}
		System.out.println("---------------------");
       
	}
	
	public String getAll(){
		String allteachers = "";
		
		for(int i=0;i<teachers.length;i++){
			if(teachers[i] != null){ //looking for Teacher objects
				allteachers += "------------------------\n";
				allteachers += " \n";
				 
				allteachers += teachers[i].getTeacherAcademicInfoAsString();
			}
		}
		
		allteachers += "------------------------\n";
		
		return allteachers;
	}
	public Teacher[] getAllteachers() {
    List<Teacher> availableTeachers = new ArrayList<>();
    
    for (int i = 0; i < teachers.length; i++) {
        if (teachers[i] != null) {
            availableTeachers.add(teachers[i]);
        }
    }
    
    return availableTeachers.toArray(new Teacher[0]);
}

	
}