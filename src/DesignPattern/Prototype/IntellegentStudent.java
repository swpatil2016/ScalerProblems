package DesignPattern.Prototype;

public class IntellegentStudent extends Student{
    private int iq;

    public IntellegentStudent(){}
    public IntellegentStudent(IntellegentStudent intellegentStudent){
        super(intellegentStudent);
        this.iq = intellegentStudent.iq; // child class only take care those attribute which are belong to it and for parent
        // attribute parent take care.  By this we can make deep copy of instance
    }

    @Override
    public IntellegentStudent getClone() {
        return new IntellegentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
