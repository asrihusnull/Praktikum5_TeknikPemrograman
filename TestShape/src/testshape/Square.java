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
// Class Square turunan dari class Rectangle
public class Square extends Rectangle{
    // 1st Constructor tanpa parameter
    public Square(){
        super();
    }
    
    // 2nd Constructor dengan satu parameter
    public Square(double side){
        super(side, side);
    }
    
     // 3rd Constructor dengan tiga parameter
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    
    public double getSide(){
        return super.getWidth();
    }
    
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    
    // Method setWidth() akan mengatur lebar Rectangle dengan panjang sisi yang sama
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setWidth(side);
    }
    
    // Method setLength() akan mengatur panjang Rectangle dengan panjang sisi yang sama
    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setLength(side);
    }
    
    @Override
    public double getArea(){
        return getSide() * getSide();
    }
    
    @Override
    public double getPerimeter(){
        return 4*getSide();
    }
    
     // Method toString() akan mengembalikan representasi String dari objek Square
    @Override
    public String toString(){
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
}
