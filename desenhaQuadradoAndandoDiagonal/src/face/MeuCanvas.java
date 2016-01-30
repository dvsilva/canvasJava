package face;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

final class MeuCanvas extends Canvas {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8231638729724890350L;

	public void paint(Graphics g) {
		//
		// ESCREVA SEU CÓDIGO NESTE ESCOPO
		//
		int x = 0;
		int y = 0;
		int tam = 100;
		int i;

		for (i = 0; i <= 500; i++) {
			x = i;
			y = i;
			g.setColor(Color.blue);
			g.drawLine(x, y, x + tam, y);
			g.drawLine(x, y, x, y + tam);
			g.drawLine(x, y + tam, x + tam, y + tam);
			g.drawLine(x + tam, y + tam, x + tam, y);
			dormir(50);
			g.setColor(Color.white);
			g.drawLine(x, y, x + tam, y);
			g.drawLine(x, y, x, y + tam);
			g.drawLine(x, y + tam, x + tam, y + tam);
			g.drawLine(x + tam, y + tam, x + tam, y);
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