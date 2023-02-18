/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testshape;

/**
 *
 * @author Asri
 * @version 1.0
 * @since 14/02/2023
 */
public class TestShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat Object Shape
        Shape sh1 = new Shape();
        System.out.println("Shape[color = " + sh1.getColor() + ", filled = " + sh1.isFilled() + "]");
        System.out.println(sh1.toString()+"\n");
        Shape sh2 = new Shape("red", false);
        System.out.println("Shape[color = " + sh2.getColor() + ", filled = " + sh2.isFilled() + "]");
        System.out.println(sh1.toString()+"\n");
        
        // Membuat Object Circle
        Circle c1 = new Circle();
        System.out.println("Circle[Shape[color = " + c1.getColor() + ", filled = " + c1.isFilled() + "]" + ", radius = " + c1.getRadius() + "]");
        System.out.println("Area : " + c1.getArea() + " Perimeter : " + c1.getPerimeter());
        System.out.println(c1.toString()+"\n");
        Circle c2 = new Circle(2.0);
        System.out.println("Circle[Shape[color = " + c2.getColor() + ", filled = " + c2.isFilled() + "]" + ", radius = " + c2.getRadius() + "]");
        System.out.println("Area : " + c2.getArea() + " Perimeter : " + c2.getPerimeter());
        System.out.println(c2.toString()+"\n");
        Circle c3 = new Circle(3.0, "red", false);
        System.out.println("Circle[Shape[color = " + c3.getColor() + ", filled = " + c3.isFilled() + "]" + ", radius = " + c3.getRadius() + "]");
        System.out.println("Area : " + c3.getArea() + " Perimeter : " + c3.getPerimeter());
        System.out.println(c3.toString()+"\n");
        
        // Membuat Object Rectangle
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle[Shape[color = " + r1.getColor() + ", filled = " + r1.isFilled() + "]" + ", width = " + r1.getWidth() + ", length = " + r1.getLength() + "]");
        System.out.println("Area : " + r1.getArea() + " Perimeter : " + r1.getPerimeter());
        System.out.println(r1.toString()+"\n");
        Rectangle r2 = new Rectangle(2.0,2.0);
        System.out.println("Rectangle[Shape[color = " + r2.getColor() + ", filled = " + r2.isFilled() + "]" + ", width = " + r2.getWidth() + ", length = " + r2.getLength() + "]");
        System.out.println("Area : " + r2.getArea() + " Perimeter : " + r2.getPerimeter());
        System.out.println(r2.toString()+"\n");
        Rectangle r3 = new Rectangle(3.0,3.0,"orange",false);
        System.out.println("Rectangle[Shape[color = " + r3.getColor() + ", filled = " + r3.isFilled() + "]" + ", width = " + r3.getWidth() + ", length = " + r3.getLength() + "]");
        System.out.println("Area : " + r3.getArea() + " Perimeter : " + r3.getPerimeter());
        System.out.println(r3.toString()+"\n");
        
         // Membuat Object Square
        Square sq1 = new Square();
        System.out.println("Square[Rectangle[Shape[color = " + sq1.getColor() + ", filled = " + sq1.isFilled() + "]" + ", width = " + sq1.getWidth() + ", length = " + sq1.getLength() + "]" + "]");
        System.out.println("Area : " + sq1.getArea() + " Perimeter : " + sq1.getPerimeter());
        System.out.println(sq1.toString()+"\n");
        Square sq2 = new Square(9.0);
        System.out.println("Square[Rectangle[Shape[color = " + sq2.getColor() + ", filled = " + sq2.isFilled() + "]" + ", width = " + sq2.getWidth() + ", length = " + sq2.getLength() + "]" + "]");
        System.out.println("Area : " + sq2.getArea() + " Perimeter : " + sq2.getPerimeter());
        System.out.println(sq2.toString()+"\n");
        Square sq3 = new Square(7.0,"purple",false);
        System.out.println("Square[Rectangle[Shape[color = " + sq3.getColor() + ", filled = " + sq3.isFilled() + "]" + ", width = " + sq3.getWidth() + ", length = " + sq3.getLength() + "]" + "]");
        System.out.println("Area : " + sq3.getArea() + " Perimeter : " + sq3.getPerimeter());
        System.out.println(sq3.toString()+"\n");
    }
    
}
