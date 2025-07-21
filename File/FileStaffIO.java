package File ;
import Entity.*;
import EntityList.*;
import java.io.*;
import java.util.*;

public class FileStaffIO{
	
	public static void loadFromFile(StaffList staffList){
		try{
			 
		Scanner sc = new Scanner( new File("./File/StaffData.txt"));
		 
		while (sc.hasNextLine()){
			//System.out.println(sc.nextLine());
			 String data[]= sc.nextLine().split(",");
			 Staff t = new Staff(data[0],data[1],data[2],
			         data[3],data[4],data[5],data[6],data[7]);
			 staffList.insert(t);
		}
			sc.close();
		}
		catch (Exception e ){}
	}
	public static void writeStaffInFile(Staff b){
		try {
			FileWriter writer = new FileWriter(new File("./File/StaffData.txt"),true);
			String data = b.getId()+","+b.getName()+","+b.getPhoneNumber()+","+
			b.getEmailAdress()+ ","+ b.getJoining()+","+b.getStaffDepartment()+","+
			b.getRoomNumber()+","+b.getWorkingHour()+"\n";
			
			writer.write(data);
			writer.close();
		}
		
		 
		catch (Exception e){}
		
	}
 
}
 