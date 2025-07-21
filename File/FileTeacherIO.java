package File ;
import Entity.*;
import EntityList.*;
import java.io.*;
import java.util.*;

public class FileTeacherIO{
	
	public static void loadFromFile(TeacherList teacherList){
		try{
			 
		Scanner sc = new Scanner( new File("./File/TeacherData.txt"));
		 
		while (sc.hasNextLine()){
			//System.out.println(sc.nextLine());
			 String data[]= sc.nextLine().split(",");
			 Teacher t = new Teacher(data[0],data[1],data[2],
			         data[3],data[4],data[5],data[6],data[7]);
			 teacherList.insert(t);
		}
			sc.close();
		}
		catch (Exception e ){}
	}
	
	public static void writeTeacherInFile(Teacher b){
		try {
			FileWriter writer = new FileWriter(new File("./File/TeacherData.txt"),true);
			String data = b.getId()+","+b.getName()+","+b.getPhoneNumber()+","+
			b.getEmailAdress()+ ","+ b.getJoining()+","+b.getTeacherDepartment()+","+
			b.getRoomNumber()+","+b.getConselting()+"\n";
			
			writer.write(data);
			writer.close();
		}
		
		 
		catch (Exception e){}
		
	}
 
}
 