package face;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

final class BarrasDancantes extends Canvas {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2609905405421135458L;

	public void paint(Graphics g) 
	{
		//
		// ESCREVA SEU CÓDIGO NESTE ESCOPO
		//
		int x= 0;
		int y= 0;
		int tam= 100;
		int i, j;
		int cor = 0;
				
		for (i=0; i<=500; i++){
			x=i;
			y=i;
			
			if (i % 20 == 0)
				cor++;
			
		    	switch (cor % 4){
		    	case 0: 
		    		g.setColor(Color.black);
		    		break;
		    	case 1: 
		    		g.setColor(Color.red);
		    		break;
		    	case 2: 
		    		g.setColor(Color.green);
		    		break;
		    	case 3: 
		    		g.setColor(Color.blue);
		    		break;
		    	}	
		    
			
		    for (j=i; j<=i+100;j++)
			      g.drawLine(j, i, j, i+tam);
			    
		    dormir(50);
		   
		    for (j=i; j<=i+100;j++){
		    	g.setColor(Color.white);
		    	g.drawLine(j, i, i,i+tam);
		    }
		    
		  }
      }
	
	public void dormir(int segundos) {
		try {
			Thread.sleep(segundos * 1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}