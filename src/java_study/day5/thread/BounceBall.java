package java_study.day5.thread;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class BounceBall extends Frame implements Runnable {
	int x = 0;
	int y = 20;
	boolean xOrient, yOrient;
	
	
	public BounceBall() {
		setSize(300, 200);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics graphics) {
		Random random = new Random();
		Dimension dimension = this.getSize();
		if (xOrient) {
			x--;
			if (x < 0) {
				x = 0;
				xOrient = false;
			}
		} else {
			x++;
			if (x >= dimension.width - 20) {
				x = dimension.width - 20;
				xOrient = true;
			}
		}

		if (yOrient) {
			y--;
			if (y < 20) {
				y = 20;
				yOrient = false;
			}
		} else {
			y++;
			if (y >= dimension.height - 20) {
				y = dimension.height - 20;
				yOrient = true;
			}
		}
		
		graphics.setColor(new Color(127, 179, 250));
		graphics.drawRect(x, y, 20, 20);
	}
	
	public void update(Graphics graphics) {
		paint(graphics);
	}

	@Override
	public void run() {
		while (true) {
			repaint();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thread thread = new Thread(new BounceBall());
		thread.start();
	}
}
