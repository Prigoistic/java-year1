import jdk.jfr.Experimental;

import java.util.ArrayList;

public class start {

    Student kunal = new Student();
    Student rahul = new Student();




    static class Student{
        int rno;
        String name;
        float marks = 90;







        Student(int rno, String name, float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
        // calling a constructor from another constructor
        Student (){
            this(13,"default person",100.0f);
        }

    }





}
