package DesignPattern.Prototype;

public class Client {
    // This method is only to add the prototype in Registry. Outsource the work of client
    public static void fillRegistry(Ragistry stdRegistry){
        //Prototype 1
        Student stdPrototype1 = new Student();
        stdPrototype1.setRollNo(1);
        stdRegistry.add("stdPrototype1", stdPrototype1);

        //Prototype 2
        IntellegentStudent intelligentStdProto =new IntellegentStudent();
        intelligentStdProto.setIq(100);
        stdRegistry.add("intelligentStdProto", intelligentStdProto);
    }
    public static void main(String[] args) {

        Ragistry empRegistry = new Ragistry();
        fillRegistry(empRegistry);

        // Make clone of prototype is main part otherwise we will make changes in prototype;
        Student normalStd = empRegistry.get("stdPrototype1").getClone();
        normalStd.setName("Swapnil");
        System.out.println(normalStd);

        IntellegentStudent std = (IntellegentStudent) empRegistry.get("intelligentStdProto").getClone();
        std.setRollNo(2);
        std.setName("shubham");
        System.out.println(std);


    }
}
