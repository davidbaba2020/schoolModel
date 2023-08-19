package models;

public class Applicant {
    private int id;
    private String  name;
    private String emailAddress;
    private String phoneNo;
    private int age;


    public Applicant() {
    }

    public Applicant(int id, String name, String emailAddress, String phoneNo, int age) {
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNo = phoneNo;
        this.age = age;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", age=" + age +
                '}';
    }
}
