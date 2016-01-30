package face;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

final class Barras extends Canvas {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6528359065159988838L;

	public void paint(Graphics g) {
		//
		// ESCREVA SEU CÓDIGO NESTE ESCOPO
		//
		int x = 100;
		int y = 100;
		int tam = 100;
		int i;

		g.setColor(Color.blue);
		g.drawLine(x, y, x + tam, y);
		g.drawLine(x, y, x, y + tam);
		g.drawLine(x, y + tam, x + tam, y + tam);
		g.drawLine(x + tam, y + tam, x + tam, y);

		for (i = 0; i <= tam; i++) {
			g.drawLine(x, y + i, x + tam, y + i);
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