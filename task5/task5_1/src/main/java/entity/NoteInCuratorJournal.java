package entity;

public class NoteInCuratorJournal {
    private String studentName;
    private String studentSecondName;
    private String address;
    private String phone;
    private String birthdayDate;

    public NoteInCuratorJournal(String studentName, String secondName, String birthDate, String phone, String address){
        this.studentName = studentName;
        this.studentSecondName = secondName;
        this.address = address;
        this.phone = phone;
        this.birthdayDate = birthDate;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSecondName() {
        return studentSecondName;
    }

    public void setStudentSecondName(String studentSecondName) {
        this.studentSecondName = studentSecondName;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }
}
