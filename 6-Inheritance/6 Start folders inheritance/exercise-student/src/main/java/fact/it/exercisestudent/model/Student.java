package fact.it.exercisestudent.model;

public class Student {
    private String name;
    private String studentnumber;
    private String adress;
    private String major;

    public Student(String name, String studentnumber) {
        this.name = name;
        this.studentnumber = studentnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(String studentnumber) {
        this.studentnumber = studentnumber;
    }

    public String getAddress() {
        return adress;
    }

    public void setAddress(String adress) {
        this.adress = adress;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString(){
        return this.studentnumber + " " + this.name + " (" + this.major + ") - Address: " + this.adress;
    }
}
