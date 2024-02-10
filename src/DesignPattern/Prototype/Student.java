package DesignPattern.Prototype;

public class Student implements Cloneabl<Student>{
    private int rollNo;
    private String name;
    private int unique; // No getter and setter for this. only for internal use of this class. But we also want this to copy

    public Student(){}
    public Student(Student std){
        this.rollNo = std.rollNo;
        this.name = std.name;
        this.unique = std.unique;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", unique=" + unique +
                '}';
    }

    @Override
    public Student getClone() {
        return new Student(this);
    }
}
