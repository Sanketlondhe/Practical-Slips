import javax.swing.SpringLayout;

 class Point  {
    double x,y;

}
class colorPoint extends Point
{
    String x_col,y_col,z_col;



public void colorPoint()
{
    x_col="RED";
    y_col="RED";
    z_col="RED";
}

public void colorPoint(String x_col,String y_col,String z_col)
{
    this.x_col=x_col;
this.y_col=y_col;
    this.z_col=z_col;
}

public void display()

{
    System.out.println("Color of X is "+ x_col);
    System.out.println("color of y is "+y_col );
    System.out.println("color of z is "+z_col);
}
}
class Xyz
{    
    public static void main(String arg[])
    {
    //     Point P =new Point();
    //     P.Point(6.0,7.0,8.0);
    //    P.display();

        colorPoint  c= new colorPoint();
       c.colorPoint("Brown","Blue","Gray"); 
        c.display();
    }

}
