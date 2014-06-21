package assignment3;
	import java.awt.*;
	import java.applet.*;
public class House extends Applet{

	 
	   public void paint (Graphics g){
	       
	      house (g);
	      roof1 (g);
	      windows (g);
	      framing (g);
	      fencepost (g);
	      
	   }
	   
	  
	   public void house (Graphics g){
	      g.setColor (Color.black);   //house 
	      g.fillRect (100,250,400,200);
	      g.setColor(Color.blue);   //doors   
	      g.fillRect (245,380,110,70);
	      g.setColor (new Color(186,134,11));   //door knobs
	      g.fillOval (282,412,10,10);
	      g.fillOval (307,412,10,10);
	      
	   }
	   
	   public void roof1 (Graphics g){
	      g.setColor(Color.red);   //house roof
	      int x[] = {98,300,501};
	      int y[] = {250,130,250};
	      g.fillPolygon(x,y,3);
	   }
	   
	  public void fencepost (Graphics g){
	     g.setColor (Color.green); //verticle fence posts
	     for (int i=100; i < 525; i+=25) {
	    	    g.fillRect(i, 400, 10, 50);
	    	}
	      g.fillRect (100,415,400,5); //horizontal slats
	      g.fillRect (100,435,400,5);
	  }
	   public void windows (Graphics g){
	      g.setColor (Color.red);   //outer frame effect
	      g.fillRect (121,261,78,78);
	      g.fillRect (121,361,78,78);
	      g.fillRect (401,261,78,78);
	      g.fillRect (401,361,78,78);
	      g.setColor (Color.orange);   //windows
	      g.fillRect (125,265,70,70);
	      g.fillRect (125,365,70,70);
	      g.fillRect (405,265,70,70);
	      g.fillRect (405,365,70,70);
	       
	       
	   }
	   
	   public void framing (Graphics g){
	      g.setColor (Color.red);   //door sections
	      g.fillRect (298,380,2,70);
	      g.setColor (Color.red);   //inner frame effect
	      g.fillRect (157,265,5,70);
	      g.fillRect (157,365,5,70);
	      g.fillRect (437,265,5,70);
	      g.fillRect (438,365,5,70);
	      g.fillRect (125,298,70,5);
	      g.fillRect (125,398,70,5);
	      g.fillRect (405,298,70,5);
	      g.fillRect (405,398,70,5);
	      g.fillRect (245,375,110,5);   //door            
	       
	   }
	   
	   
	      
	}

