package chapter3;

public class Circle
{
 private int  diameter, x, y;
  public  Circle(int  size,int  upperX,  int  upperY)
  {
    diameter  =  size;
    x  =  upperX;
    y  =  upperY;
  }
  public  void  setDiameter(int  size)
  {
    diameter  =  size;
  }
  public  void  setX(int  upperX)
  {
    x  =  upperX;
  }
  public  void  setY(int  upperY)
  {
    y  =  upperY;
  }
  public  int  getDiameter()
  {
    return  diameter;
  }
  public  int  getX()
  {
    return  x;
  }
  public  int  getY()
  {
    return  y;
  }
  public  double  calcArea()
  {
    return  (3.415*diameter*diameter/4.0);
  }
  
  public static void main(String[] arg){
	  Circle myCircle = new Circle(4,2,1);
	  System.out.println("The area of my circle is" + myCircle.calcArea());
  }
}