package Entity;
public class Person{
	private String id;
	private String name;
	private String phoneNumber;
	private String emailAdress;
	
	
	public Person(){}
	public Person(String id,String name,String phoneNumber,
	              String emailAdress){
		this.id=id;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.emailAdress = emailAdress;
		
	}
	public void setId(String id){
		this.id=id;
	}
	public String getId(){return id;}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){return name;}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	public String getPhoneNumber(){return phoneNumber;}
	
	
	public void setEmailAdress(String emailAdress){
		this.emailAdress=emailAdress;
	}
	public String getEmailAdress(){return emailAdress;}
 public String getPersonalInfoAsString() {
        String personalInfo = "";

        personalInfo += "   Personal Information \n";
        personalInfo += "   --------------------------\n";
        personalInfo += "    Id                              :" + id + "\n";
        personalInfo += "    Name                       :" + name + "\n";
        personalInfo += "    Phone Number  :" + phoneNumber + "\n";
        personalInfo += "    Email Address   :" + emailAdress + "\n";

        return personalInfo;
    }
	
	
}