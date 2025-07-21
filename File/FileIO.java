package File ;
import Entity.*;
import EntityList.*;
import java.io.*;
import java.util.*;
import LoginPage.*;
public class FileIO{
	public static boolean checkUserFromFile(String userName, String userPass) {
    try {
        File file = new File("./File/UserData.txt");
        Scanner sc = new Scanner(file);
            
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] data = line.split(",");
            
            // Ensure the line contains the expected data structure
            if (data.length >= 2) {
                String storedUserName = data[0];
                String storedPassword = data[1];
                
                if (storedUserName.equals(userName) && storedPassword.equals(userPass)) {
                    sc.close();
                    return true; // Credentials match
                }
            } else {
                // Handle lines that don't have the expected format
                System.err.println("Invalid format in file: " + file.getName());
            }
        }
        
        sc.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace(); // Handle file not found error properly
    }
    
    return false; // Credentials not found or error occurred
}
	 
	public static void loadFromFile(StudentList studentList){
		try{
			 
		Scanner sc = new Scanner( new File("./File/StudentData.txt"));
		 
		while (sc.hasNextLine()){
			 
			 String data[]= sc.nextLine().split(",");
			 Student s = new Student(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],
			 Integer.parseInt(data[8]),Double.parseDouble(data[9]));
			 studentList.insert(s);
		}
			sc.close();
		}
		catch (Exception e ){}
	}
    public static void writeStudentInFile(Student b){
		try {
			FileWriter writer = new FileWriter(new File("./File/StudentData.txt"),true);
			String data = b.getId()+","+b.getName()+","+b.getPhoneNumber()+","+
			b.getEmailAdress()+ ","+ b.getStudentDepartment()+","+b.getCourse1()+","+
			b.getCourse2()+","+b.getCourse3()+","+b.getCreditComplete()+","+b.getCgpa()+
			"\n";
			
			writer.write(data);
			writer.close();
		}
		
		 
		catch (Exception e){}
		
	}
}
 