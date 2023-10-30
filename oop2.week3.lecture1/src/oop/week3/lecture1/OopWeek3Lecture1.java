package oop.week3.lecture1;

public class OopWeek3Lecture1 {

    public static void main(String[] args) {
        Person p1=new Person();
        p1.age=100;
        p1.name="Sohair";
        p1.sayHello();
        
        Person p2=new Person();
        p2.name="Rawan";
        p2.sayHello();
        
        Person p3=p1;
        p3.sayHello();
        p3.name="kamal";
        p3.sayHello();
        
//        Person p4=null;
//        p4.name="Leen";
//        p4.sayHello();
         
    }
    
}
