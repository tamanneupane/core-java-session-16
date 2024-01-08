package string;

public class Student {//extends Object
    int id;

    public Student(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; //checking for same memory region

        Student check = (Student) obj;
        return this.id == check.id;
    }


//    @Override
//    public boolean equals(Object o) {
////        student1.equals(student2);
//        // this = student1
//        // o = student2
//
//        if (this == o) return true;
//        Student student2 = (Student) o;
//        return this.id == student2.id;
//
////        Student student = (Student) o;
////
////        return id == student.id;
//    }

}
