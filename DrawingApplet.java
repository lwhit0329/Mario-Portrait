package uncp.csc1900.gui.labs.lab1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 * Create an applet that will show an image I created
 * 
 * @author Lewis A. Whitley
 * @version 2013-08-23
 */
public class DrawingApplet extends JApplet {
	private static final long serialVersionUID = 1L;

	/**
	 * Creates applet and sets background color to white.
	 */
	public void init() {
		super.init();
		getContentPane().setBackground(new Color(255, 255, 255));
	}

	/**
	 * This method will be used to generate a picture within 
	 * the applet
	 * 
	 * @param g object that will generate the image painted on
	 * the applet
	 */
	public void paint(Graphics g) {
		super.paint(g);
		int w = getWidth();
		int h = getHeight();
		/**
		 * Put all the red into the image hat, overalls
		 */
		g.setColor(Color.red);
		g.fillRect((3 * w) / 12, 0, (5 * w) / 12, (h / 16));
		g.fillRect((2 * w) / 12, (h / 16), (9 * w) / 12, (h / 16));
		g.fillRect((4 * w) / 12, (7 * h / 16), (4 * w) / 12, (3 * h / 16));
		g.fillRect((2 * w) / 12, (10 * h / 16), (8 * w) / 12, (3 * h / 16));
		g.fillRect((2 * w) / 12, (13 * h / 16), (3 * w) / 12, (h / 16));
		g.fillRect((7 * w) / 12, (13 * h / 16), (3 * w) / 12, (h / 16));
		/**
		 * Put all the brown into the image hair, eyes, clothes
		 */
		g.setColor(new Color(156, 93, 82));
		g.fillRect((2 * w) / 12, (2 * h / 16), (7 * w) / 12, (4 * h / 16));
		g.fillRect((w) / 12, (3 * h / 16), (w) / 12, (3 * h / 16));
		g.fillRect((9 * w) / 12, (5 * h / 16), (2 * w) / 12, (h / 16));
		g.fillRect((5 * w) / 12, (7 * h / 16), (2 * w) / 12, (2 * h / 16));
		g.fillRect((7 * w) / 12, (7 * h / 16), (w) / 12, (h / 16));
		g.fillRect((2 * w) / 12, (10 * h / 16), ((w) / 12), (h / 16));
		g.fillRect((-w) / 12, (9 * h / 16), (5 * w) / 12, (h / 16));
		g.fillRect((w) / 12, (8 * h / 16), (3 * w) / 12, (h / 16));
		g.fillRect((2 * w) / 12, (7 * h / 16), (2 * w) / 12, (h / 16));
		g.fillRect((-w) / 12, (15 * h / 16), (5 * w) / 12, (h / 16));
		g.fillRect((w) / 12, (14 * h / 16), (3 * w) / 12, (h / 16));
		g.fillRect((8 * w) / 12, (8 * h / 16), (3 * w) / 12, (h / 16));
		g.fillRect((8 * w) / 12, (9 * h / 16), (4 * w) / 12, (h / 16));
		g.fillRect((9 * w) / 12, (10 * h / 16), (w) / 12, (h / 16));
		g.fillRect((8 * w) / 12, (14 * h / 16), (3 * w) / 12, (h / 16));
		g.fillRect((8 * w) / 12, (15 * h / 16), (4 * w) / 12, (h / 16));
		/**
		 * Put all the yellow into the image face and buttons
		 */
		g.setColor(Color.yellow);
		g.fillRect((2 * w) / 12, (3 * h / 16), (w) / 12, (2 * h / 16));
		g.fillRect((3 * w) / 12, (5 * h / 16), (4 * w) / 12, (2 * h / 16));
		g.fillRect((7 * w) / 12, (6 * h / 16), (3 * w) / 12, (h / 16));
		g.fillRect((5 * w) / 12, (2 * h / 16), (2 * w) / 12, (5 * h / 16));
		g.fillRect((4 * w) / 12, (3 * h / 16), (w) / 12, (h / 16));
		g.fillRect((7 * w) / 12, (4 * h / 16), (w) / 12, (h / 16));
		g.fillRect((8 * w) / 12, (2 * h / 16), (w) / 12, (2 * h / 16));
		g.fillRect((9 * w) / 12, (3 * h / 16), (2 * w) / 12, (2 * h / 16));
		g.fillRect((11 * w) / 12, (4 * h / 16), (w) / 12, (h / 16));
		g.fillRect((-w) / 12, (10 * h / 16), (3 * w) / 12, (3 * h / 16));
		g.fillRect((2 * w) / 12, (11 * h / 16), ((w) / 12), (h / 16));
		g.fillRect((10 * w) / 12, (10 * h / 16), ((2 * w) / 12), (3 * h / 16));
		g.fillRect((9 * w) / 12, (11 * h / 16), ((w) / 12), (h / 16));
		g.fillOval((4 * w) / 12, (10 * h / 16), ((w) / 12), (h / 16));
		g.fillOval((7 * w) / 12, (10 * h / 16), ((w) / 12), (h / 16));
		/**
		 * creates white lines that will be able to give the character the
		 * square look
		 */
		g.setColor(new Color(255, 255, 255));
		for (int i = 0; i <= 12; i++) {
			g.drawLine(0, (i * h / 16), w, (i * h / 16));
			g.drawLine((i * w / 12), 0, (i * w / 12), h);
		}

	}

}
