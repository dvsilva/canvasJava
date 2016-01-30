package face;

import java.awt.Canvas;
import java.awt.Graphics;

final class MeuCanvas extends Canvas {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8231638729724890350L;

	public void paint(Graphics g) 
	{
		//
		// ESCREVA SEU CÓDIGO NESTE ESCOPO
		//
		g.drawLine(0, 0, 500, 500);

	}
	
	public void dormir(int segundos) {
		try {
			Thread.sleep(segundos * 1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}