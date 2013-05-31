package scientific_calculator;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class ClearButton extends JButton implements MouseListener {
	
	ClearButton(String display) {
		super(display);
		addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("ClearButton!");
	}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}
	
}