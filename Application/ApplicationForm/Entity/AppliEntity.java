package Application.ApplicationForm.Entity;
public class AppliEntity {

    private String name;
    private String birthDate;
    private String emailAddress;
    private String phoneNumber;
    private String gurPhoneNum;
    private String collegeName;
    private String hscResult;
    private String hscRoll;
    private String hscBack;
    private String passingDate;
    private String permanentAddress;
    private String presentAddress;
    private String hobby;

    // Default constructor
    public AppliEntity() {
    }

    // Parameterized constructor
    public AppliEntity(String name, String birthDate, String emailAddress, String phoneNumber,
                       String gurPhoneNum, String collegeName, String hscResult, String hscRoll,
                       String hscBack, String passingDate, String permanentAddress,
                       String presentAddress, String hobby) {
        this.name = name;
        this.birthDate = birthDate;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.gurPhoneNum = gurPhoneNum;
        this.collegeName = collegeName;
        this.hscResult = hscResult;
        this.hscRoll = hscRoll;
        this.hscBack = hscBack;
        this.passingDate = passingDate;
        this.permanentAddress = permanentAddress;
        this.presentAddress = presentAddress;
        this.hobby = hobby;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGurPhoneNum() {
        return gurPhoneNum;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getHscResult() {
        return hscResult;
    }

    public String getHscRoll() {
        return hscRoll;
    }

    public String getHscBack() {
        return hscBack;
    }

    public String getPassingDate() {
        return passingDate;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public String getHobby() {
        return hobby;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGurPhoneNum(String gurPhoneNum) {
        this.gurPhoneNum = gurPhoneNum;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setHscResult(String hscResult) {
        this.hscResult = hscResult;
    }

    public void setHscRoll(String hscRoll) {
        this.hscRoll = hscRoll;
    }

    public void setHscBack(String hscBack) {
        this.hscBack = hscBack;
    }

    public void setPassingDate(String passingDate) {
        this.passingDate = passingDate;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
	
	public void showAppliEntityInfo() {
    System.out.println("Name: " + name);
    System.out.println("Birth Date: " + birthDate);
    System.out.println("Email Address: " + emailAddress);
    System.out.println("Phone Number: " + phoneNumber);
    System.out.println("Guardian's Phone Number: " + gurPhoneNum);
    System.out.println("College Name: " + collegeName);
    System.out.println("HSC Result: " + hscResult);
    System.out.println("HSC Roll: " + hscRoll);
    System.out.println("HSC Background: " + hscBack);
    System.out.println("Passing Date: " + passingDate);
    System.out.println("Permanent Address: " + permanentAddress);
    System.out.println("Present Address: " + presentAddress);
    System.out.println("Hobby: " + hobby);
}

	
	//showAppliEntityInfo
	  public String getAppliEntityInfoAsString() {
        String appliEntityInfo = "";
        appliEntityInfo += "   Applicant's Academic Information \n ";
        appliEntityInfo += "   --------------------------\n";
        appliEntityInfo += "    Name              :" + name + "\n";
        appliEntityInfo += "    Birth Date        :" + birthDate + "\n";
        appliEntityInfo += "    Email Address     :" + emailAddress + "\n";
        appliEntityInfo += "    Phone Number      :" + phoneNumber + "\n";
        appliEntityInfo += "    Guardian Phone    :" + gurPhoneNum + "\n";
        appliEntityInfo += "    College Name      :" + collegeName + "\n";
        appliEntityInfo += "    HSC Result        :" + hscResult + "\n";
        appliEntityInfo += "    HSC Roll          :" + hscRoll + "\n";
        appliEntityInfo += "    HSC Background    :" + hscBack + "\n";
        appliEntityInfo += "    Passing Date      :" + passingDate + "\n";
        appliEntityInfo += "    Permanent Address :" + permanentAddress + "\n";
        appliEntityInfo += "    Present Address   :" + presentAddress + "\n";
        appliEntityInfo += "    Hobby             :" + hobby + "\n";

        return appliEntityInfo;
    }
}
 