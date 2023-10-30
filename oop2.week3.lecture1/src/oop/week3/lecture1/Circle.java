/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.week3.lecture1;
import java.lang.Math.*;
/**
 *
 * @author sohair
 */
public class Circle {
    int radius;
    
    public double getRound(){
        return 2*Math.PI*radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
