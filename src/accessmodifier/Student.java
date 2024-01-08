package accessmodifier;

public class Student {
    private String name; //private access modifier
    int rollNo; // default access modifier
    protected String grade; // protected access modifier
    public String address; // public access modifier
    public int scoreInEnglish;
    public int scoreInMath;

    public Student() {
        name = "ashish";
        rollNo = 1;
        grade = "A";
    }

    /**
     * This is calc method that calculates the marks of student
     *
     * @return int
     * @author Ashish Khatiwada
     * @version 1.0.0
     */
    public int calc() {
        /*Hi my name is ashish
         * i have a dog*/
//        This sums the marks in english and math
        int result = scoreInEnglish + scoreInMath; // this is adding two integer number
        return result;
    }
}
