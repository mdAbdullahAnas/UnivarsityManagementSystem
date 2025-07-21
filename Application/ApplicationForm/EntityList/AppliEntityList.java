package Application.ApplicationForm.EntityList;
import Application.ApplicationForm.Entity.*; 
import  Application.ApplicationForm.FileIO.*;

import java.util.List;
import java.util.ArrayList;

public class AppliEntityList{
	private AppliEntity appliEntity[];
	public AppliEntityList(){
		appliEntity = new AppliEntity[5];
	}
	public AppliEntityList(int size){
		appliEntity = new AppliEntity[size];
	}
	
	public void insert(AppliEntity b){
		boolean flag = false;
		for(int i=0;i<appliEntity.length;i++){
			if(appliEntity[i] == null){
				appliEntity[i] = b;
				flag = true;
				break;
			}
		}
		if(flag){System.out.println("Insertion Successfull");}
		else{System.out.println("Insertion Failed");}
	}
	
	 
	 
	 
	public void showAll(){
		System.out.println("++++++ List of All Available appliEntity ++++++");
		for(int i=0;i<appliEntity.length;i++){
			if(appliEntity[i] != null){ //looking for AppliEntity objects
			System.out.println("---------------------");
			 
				appliEntity[i].showAppliEntityInfo();
			}
		}
		System.out.println("---------------------");
       
	}
	
	public String getAll(){
		String allappliEntity = "";
		
		for(int i=0;i<appliEntity.length;i++){
			if(appliEntity[i] != null){ //looking for AppliEntity objects
				allappliEntity += "---1234 \n";
				allappliEntity += " \n";
				 
				allappliEntity += appliEntity[i].getAppliEntityInfoAsString();
			}
		}
		
		allappliEntity += "------111111111--\n";
		
		return allappliEntity;
	}
	public AppliEntity[] getAllappliEntity() {
    List<AppliEntity> availableappliEntity = new ArrayList<>();
    
    for (int i = 0; i < appliEntity.length; i++) {
        if (appliEntity[i] != null) {
            availableappliEntity.add(appliEntity[i]);
        }
    }
    
    return availableappliEntity.toArray(new AppliEntity[0]);
}

	
}