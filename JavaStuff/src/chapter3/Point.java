package chapter3;

public class Point
{
    private int x;
    private int y;
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public int getY()
    {
        return y;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public void transpose()
    {
        int temp;
        temp = getX();
        setX(getY());
        setY(temp);
    }
    public Point(){
    	x=0;
    	y=0;
    }


public static void main(String[] args)
{
	 	 Point  myPoint  = new Point();
System.out.println("My point is ("+ myPoint.getX()+","+myPoint.getY() + ")");
	 	 Point  p1  = new Point(2,3);
System.out.println("P1 is "+ p1.getX() +","+ p1.getY());
	 	 p1.transpose();
System.out.println("P1 is "+ p1);
}
}