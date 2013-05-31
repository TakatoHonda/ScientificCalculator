package scientific_calculator;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class EqualButton extends JButton implements MouseListener{
	
	EqualButton(String display) {
		super(display);
		addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("EqualButton!");
	}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}
	
}
