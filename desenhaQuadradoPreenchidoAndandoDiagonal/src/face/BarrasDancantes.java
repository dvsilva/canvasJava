package face;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

final class BarrasDancantes extends Canvas {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2609905405421135458L;

	public void paint(Graphics g) {
		//
		// ESCREVA SEU CÓDIGO NESTE ESCOPO
		//
		int x = 0;
		int y = 0;
		int tam = 100;
		int i, j, k;

		for (i = 0; i <= 500; i++) {
			x = i;
			y = i;

			for (j = i; j <= i + 100; j++) {
				if (i % 2 == 0) {
					for (k = 0; k <= 20; k++) {
						g.setColor(Color.green);
						g.drawLine(j, i, j, i + tam);
					}
				} else {
					for (k = 0; k <= 20; k++) {
						g.setColor(Color.red);
						g.drawLine(j, i, j, i + tam);
					}

				}
			}

			dormir(50);

			for (j = i; j <= i + 100; j++) {
				g.setColor(Color.white);
				g.drawLine(j, i, i, i + tam);
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