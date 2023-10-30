/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.week3.lecture1;

/**
 *
 * @author sohair
 */
public class OopWeek3Lecture1 {

    /**
     * @param args the command line arguments
     */
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
