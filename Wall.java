/*
 * 
 * 
 * 
 */
package structure;

public class Wall extends Structure
{
  double length;
   double width;
   double price;
  // double height;
    //private double cost;
    /*
     * Constructor
     * @param len
     * @param w
     */  
    public Wall (Double len,Double w,Double p)
{
    length=len;
    width=w;
    price=p;
    //height=h;
}
public void setlength(double len)
{
    length=len;
}
    public void setWidth(double w)
{
    width=w;
}
//    public void setHeight(double h)
//    {
//        height=h;
//    }
//    public double getHeight()
//    {
//        return height;
//    }
    public double setPrice(double p)
    {
        return price;
    }
    
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public double getArea()
    {
        return length * width; 
    }
    public double getNumberOfBricks()
    {
        return (length * width)/0.2326; 
    }
     public double getPrice(double p)
    {
        return price;
    }
    
}


