/*
 * 
 * 
 * 
 */
package structure;
//new class=brick class extends rectangle
public class Bricks extends Wall
{
//    private double cost;
//    
//    /**
//     * The constructor sets the wall length,width,area and cost
//     * and cost
//     * @param len
//     * @param w
//     * @param c
//     */
    
    public Bricks(Double len, Double w,Double p) 
    {
        super(len, w,p);
        //cost=c;
    }
    
    public double getLength()
{
    return length;
           
}
    public double getWidth()
{
    return width;
           
}
//     public double getheight()
//{
//    return height;
//           
//}
    public double getArea()
{
    return length * width;
           
}
    public double getNumberofBricks()
{
    return (length*width)/0.2326;
           
}

    
    @Override
   public double getPrice(double p)
{
    return (length*width)/0.2326 * price;
           
}
}

    
    

