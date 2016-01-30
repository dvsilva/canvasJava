package face;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Programa {
	public static void main(String args[]) {
		final Frame frame = new Frame();
		MeuCanvas canvas = new MeuCanvas();
		frame.add(canvas);
		frame.setSize(500, 500);
		frame.setTitle("Canvas");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.validate();
		frame.setVisible(true);
	}
}
