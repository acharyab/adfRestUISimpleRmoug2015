package model;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public StudentClient() {
        super();
    }
    
    public List<Student> getStudentsForClass(String id){
        List<Student> students1 = new ArrayList<Student>();
        List<Student> students2 = new ArrayList<Student>();
        List<Student> students;

        students1.add(new Student("eisenhower"));
        students1.add(new Student("nixon"));
        students1.add(new Student("ford"));

        students2.add(new Student("carter"));
        students2.add(new Student("reagan"));
        students2.add(new Student("bush"));
        
        if (id.equals("1"))
            students = students1;
        else
            students = students2;

        return students;
    }
    
}
