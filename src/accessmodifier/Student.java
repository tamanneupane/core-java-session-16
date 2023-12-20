package accessmodifier.package1;

public class Student {
    private String name; //private access modifier
    int rollNo; // default access modifier
    protected String grade; // protected access modifier
    public String address; // public access modifier

    public Student() {
        name = "ashish";
        rollNo = 1;
        grade = "A";
    }
}
