/*
 * 
 * 
 * 
 */
package structure;

import java.util.*;
public class Structure {
public static void main(String[] args)
    {
        double price=0.99;
    //setting the length, width and area of one standard brick
    double width = 3.625 + 0.375;
    //double height=2.25;
    double length =8.00 + 0.375; 
    //find the area
    double areaft;//sq ft=(width+0.375)*(length+3/8)//divided by 144 to convert 
    //in^2 to ft^2
    double areain;
    areain=(length*width)/144;//width which corresponds to length * height acc. to i-net
    System.out.println("The area of the brick in inches: "+length*width);
    System.out.print("The calculation conversion from"
            + " area sq.in to area sq.ft.for a brick is: ");
    System.out.printf("%,6.4f\n",areain);
    System.out.println("How long do you want to build the wall?");
    //the user sets the length and the width of the wall
    Scanner keyboard =new Scanner(System.in);
    //set the length of the wall
    length=keyboard.nextDouble();
    System.out.println("Enter the width: ");
    width=keyboard.nextDouble();
    Bricks myBricks=
            new Bricks(length,width,price);
    System.out.println("Here are the properties of the wall.");
    System.out.println("Length: "+
            myBricks.getLength());
    System.out.println("Width: "+
            myBricks.getWidth());
    System.out.println("Base Area: "+
            myBricks.getArea());
    System.out.println("Estimated number of bricks you will need for the wall: "
            +myBricks.getNumberofBricks());
    //System.out.printf("%,6.4f\n",NumberofBricks);
    System.out.println("Estimated cost: "+myBricks.getPrice(areain) );//
     
     }
}
