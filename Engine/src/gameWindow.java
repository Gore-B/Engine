import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class gameWindow extends Thread{
	
	public boolean running;
	public JFrame mainWindow;
	public static JPanel drawBoard;
	public static BufferedImage image;
	public static Graphics2D g;
	
	public gameWindow() {
		createAndShowGUI();
		this.run();
	}
	
	public void run(){
		long nextFrame =  (System.nanoTime() + 16666667);
		
		while(true) {
			if(System.nanoTime() >= nextFrame) {
				nextFrame += 16666667;
				//frame
			}
			
		}
		
	}

	
	
	/**
	 * Creates the main game window.
	 */
	private void createAndShowGUI() {
		mainWindow = new JFrame();
		mainWindow.setSize(1280, 720);
		mainWindow.setVisible(true);
		
		drawBoard = new JPanel();
		drawBoard.setSize(1280, 720);
		mainWindow.add(drawBoard);
		drawBoard.setVisible(true);
		
		mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		mainWindow.setFocusable(true);
		mainWindow.setResizable(false);
		mainWindow.requestFocus();
		mainWindow.setVisible(true);
	}
	
}
