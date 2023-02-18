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
public class Shape {
    // Deklarasi variabel dengan access modifier private
    private String color;
    private boolean filled;
    
    // 1st Constructor tanpa parameter
    public Shape(){
        color = "green";
        filled = true;
    }
    
    // 2nd Constructor dengan dua parameter
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    // Method toString() akan mengembalikan representasi String dari objek Shape
    public String toString() {
        return "A shape with color of " + getColor() + " and " + isFilled();
    }
}
