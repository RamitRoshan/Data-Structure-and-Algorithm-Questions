package oopsinjava;

public class statickeyword {
    public static void main(String[] args) {
   Students s1 = new Students();
   s1.schoolName = "BPS";

        Students s2 = new Students();
        System.out.println(s2.schoolName);


    Students s3 = new Students();
    s3.schoolName = "avcv";
    /*after s3 , both schoolname will change
     s1 and s2. static object craetes once in memory
     */
}
}
class Students{
    String name;
    int roll;
    //static variable who declare the name of school
    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
