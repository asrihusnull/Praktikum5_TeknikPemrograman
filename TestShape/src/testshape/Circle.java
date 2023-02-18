/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testshape;

/**
 *
 * @author Asri
 * @version 1.0
 * @since 14/02/2023
 */
// Class Circle turunan dari class Shape
public class Circle extends Shape{
    // Deklarasi variabel dengan access modifier private
    private double radius;
    
    // 1st Constructor tanpa parameter
    public Circle(){
        radius = 1.0;
    }
    
    // 2nd Constructor dengan satu parameter
    public Circle(double radius){
        this.radius = radius;
    }
    
     // 3rd Constructor dengan tiga parameter
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    // Method getArea() akan mengembalikan nilai luas lingkaran
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    // Method getPerimeter() akan mengembalikan nilai keliling lingkaran
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    
    // Method toString() akan mengembalikan representasi String dari objek Circle
    @Override
    public String toString(){
        return "A circle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }
}
