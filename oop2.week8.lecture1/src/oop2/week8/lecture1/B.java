package oop2.week8.lecture1;


public class B {
    private C c=new C();
   public void process(String s){
       c.m1(s);
   }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
   
}
