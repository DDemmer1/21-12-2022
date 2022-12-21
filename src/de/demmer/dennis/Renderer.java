package de.demmer.dennis;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Renderer {

	

	public void render(Drawable drawable) {
		
		try {
			BufferedImage img = ImageIO.read(new File(drawable.getImgUrl()));

			ImageIcon icon = new ImageIcon(img);
			
			JFrame frame = new JFrame();
            frame.setLayout(new FlowLayout());
			frame.setSize(500, 500);
			
			JLabel lbl = new JLabel();
			lbl.setIcon(icon);
			
			frame.add(lbl);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
