package learninterface;

public class Student implements Comparable<Student> {
    private int rollNo;

    public Student(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public Student setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.rollNo, o.rollNo);
    }
}
