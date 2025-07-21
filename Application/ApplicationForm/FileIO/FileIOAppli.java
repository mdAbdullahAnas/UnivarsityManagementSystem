package Application.ApplicationForm.FileIO ;
import Application.ApplicationForm.Entity.*;
import Application.ApplicationForm.EntityList.*;
import java.io.*;
import java.util.*;

public class FileIOAppli{
	
	public static void loadFromFile(AppliEntityList appliEntityList){
		try{
			 
		Scanner sc = new Scanner( new File("./Application/ApplicationForm/FileIO/ApplicationData.txt"));
		 
		while (sc.hasNextLine()){
			//System.out.println(sc.nextLine());
			 String data[]= sc.nextLine().split(",");
			 AppliEntity b = new AppliEntity(data[0],data[1],data[2],
			         data[3],data[4],data[5],data[6],data[7],data[88],data[9],
					 data[10],data[11],data[12]);
			 appliEntityList.insert(b);
		}
			sc.close();
		}
		catch (Exception e ){}
	}
 
}
 