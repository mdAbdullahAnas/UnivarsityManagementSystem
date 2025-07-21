 package EntityList;
import Entity.*;
import java.util.List;
import java.util.ArrayList;
import Interfaces.*;

public class StaffList{
	private Staff staffs[];
	public StaffList(){
		staffs = new Staff[5];
	}
	public StaffList(int size){
		staffs = new Staff[size];
	}
	
	public void insert(Staff b){
		boolean flag = false;
		for(int i=0;i<staffs.length;i++){
			if(staffs[i] == null){
				staffs[i] = b;
				flag = true;
				break;
			}
		}
		if(flag){System.out.println("Insertion Successfull");}
		else{System.out.println("Insertion Failed");}
	}
	
	public Staff getById(String id){
		for(int i=0;i<staffs.length;i++){
			if(staffs[i] != null){
				if(staffs[i].getId().equals(id)){
					return staffs[i];
				}
			}
		}
		return null;
	}
	
	public Staff deleteById(String id){
		boolean flag = false;
		for(int i=0;i<staffs.length;i++){
			if(staffs[i] != null){
				if(staffs[i].getId().equals(id)){
					staffs[i] = null;
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
		for(int i=0;i<staffs.length;i++){
			if(staffs[i] != null){
				if(staffs[i].getName().equals(name)){
					System.out.println("+++ Staff Found +++");
					staffs[i].showStaffInfo();
					return;
				}
			}
		}
		System.out.println("-- Staff Not Found ---");
		return;
	}
	
	
		// public Staff getById(String id){
		// for(int i=0;i<staff.length;i++){
			// if(staff[i] != null){
				// if(staff[i].geId().equals(id)){
					// return staff[i];
				// }
			// }
		// }
		// return null;
	// }
	
	
	public void showAll(){
		System.out.println("++++++ List of All Available Staffs ++++++");
		for(int i=0;i<staffs.length;i++){
			if(staffs[i] != null){ //looking for Staff objects
			System.out.println("---------------------");
			 
				staffs[i].showStaffInfo();
			}
		}
		System.out.println("---------------------");
       
	}
	
	public String getAll(){
		String allstaffs = "";
		
		for(int i=0;i<staffs.length;i++){
			if(staffs[i] != null){ //looking for Staff objects
				allstaffs += "------------------------\n";
				allstaffs += " \n";
				 
				allstaffs += staffs[i].getStaffAcademicInfoAsString();
			}
		}
		
		allstaffs += "------------------------\n";
		
		return allstaffs;
	}
	public Staff[] getAllStaffs() {
    List<Staff> availableStaffs = new ArrayList<>();
    
    for (int i = 0; i < staffs.length; i++) {
        if (staffs[i] != null) {
            availableStaffs.add(staffs[i]);
        }
    }
    
    return availableStaffs.toArray(new Staff[0]);
}

	
}